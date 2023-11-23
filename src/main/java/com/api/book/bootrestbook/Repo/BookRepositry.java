package com.api.book.bootrestbook.Repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.api.book.bootrestbook.Entities.Book;
import java.util.List;


@Repository
public interface BookRepositry extends JpaRepository<Book,Integer> {
    List<Book> findById(int id);
    
}
