package com.api.book.bootrestbook.services;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.api.book.bootrestbook.Entities.Book;
import com.api.book.bootrestbook.Repo.BookRepositry;

@Service
public class BookService {

    @Autowired 
    private BookRepositry bookRepositry;

    // private static List<Book> list = new ArrayList<>() ;

    // static{
    //     list.add(new Book(1,"java book","abc"));
    //     list.add(new Book(2,"python book","xyz"));
    //     list.add(new Book(3,"c++ book","jkl"));
    // }

    public List<Book> getAllBooks() {
        List<Book> list= this.bookRepositry.findAll();
        return list;
    }

    public List<Book> getBookbyId(int id){
        List<Book> list = null;
        try{
            // book = list.stream().filter(obj->obj.getId()==id).findFirst().get();
            list = this.bookRepositry.findById(id);
        }catch(Exception e){
            e.printStackTrace();
        }
        return list;
    }

    //adding the book
    public Book addBook(Book b){
        Book result = this.bookRepositry.save(b);
        return result;
    }

    public void deletebook(int id){
        // Book book = null;
        // book = list.stream().filter(obj->obj.getId()==id).findFirst().get();
        // list.remove(book);
        // return book;

        bookRepositry.deleteById(id);

    }

    public void UpdateBook(Book b, int bid) {
        // list = list.stream().map(e->{
        //     if(e.getId()==bid){
        //         e.setTitle(b.getTitle());
        //         b.setAuthor(b.getAuthor());
        //     }
        //     return e;
        // }).collect(Collectors.toList());
        b.setId(bid);
        bookRepositry.save(b);
    }

    

    
    
}
