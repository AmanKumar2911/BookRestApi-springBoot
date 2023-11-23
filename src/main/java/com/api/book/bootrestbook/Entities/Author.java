package com.api.book.bootrestbook.Entities;

import com.fasterxml.jackson.annotation.JsonBackReference;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;

@Entity
public class Author {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int auth_id;

    @Column(name = "FirstName")
    private String fname;

    @Column(name="LastName")
    private String lname;
    
    @Column(name="SpokenLanguage")
    private String lang;

    @OneToOne(mappedBy = "author")
    @JsonBackReference
    private Book book;

    

    public int getAuth_id() {
        return auth_id;
    }

    public void setAuth_id(int auth_id) {
        this.auth_id = auth_id;
    }

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public String getLname() {
        return lname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }

    public String getLang() {
        return lang;
    }

    public void setLang(String lang) {
        this.lang = lang;
    }

    public Author() {
    }

    

    public Author(int auth_id, String fname, String lname, String lang, Book book) {
        this.auth_id = auth_id;
        this.fname = fname;
        this.lname = lname;
        this.lang = lang;
        this.book = book;
    }

    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }

   
    
    
}
