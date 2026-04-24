package com.library.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.library.beans.BookEntity;
import com.library.service.BookStore;

@RestController
public class BookController {
	
	@Autowired
    private BookStore bookStore;
	
	@GetMapping("/bookStore/{name}/{author}")
	public BookEntity saveBook1(@PathVariable String name,@PathVariable String author) {
		BookEntity entity=new BookEntity();
		entity.setAuthorName(author);
		entity.setBookName(name);
		bookStore.saveBook1(entity);
		System.out.println("saved");
		return entity;
	}
	
	@GetMapping("/bookStore")
	public List<BookEntity> getAllBooks(){
		return bookStore.getAllBooks();
	}

}
