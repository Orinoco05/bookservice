package com.example.demomicroservice2;

import com.example.demomicroservice2.Service.dto.BookService;
import com.example.demomicroservice2.domain.Book;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/book")
public class BookController {
    private final BookService bookService;

    public BookController(BookService bookService) {
        this.bookService = bookService;
    }
    @GetMapping("/")
    public List<Book> getAll(){
        return bookService.findAll();
    }
}
