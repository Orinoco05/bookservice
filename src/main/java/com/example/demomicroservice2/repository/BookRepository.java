package com.example.demomicroservice2.repository;


import com.example.demomicroservice2.domain.Book;
import jakarta.persistence.Tuple;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface BookRepository extends JpaRepository<Book,Long> {
    Book findAllByName(String name);
    @Query(
            value = "select * from book ",
            nativeQuery = true
    )
    Page<Tuple> search(
            Pageable pageable
    );
}
