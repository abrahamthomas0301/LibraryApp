package com.libraryApp.Apigateway.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.library.beans.BookDetail;
import com.libraryApp.Apigateway.client.BookstoreClient;

@RestController
@RequestMapping("/libraryAPI")
public class ApiController {

	@Autowired
	BookstoreClient bookstoreClient;
	
	@GetMapping("/bookStore/{name}/{author}")
	public BookDetail saveBook(@PathVariable String name,@PathVariable String author) {
		return bookstoreClient.saveBook(name, author);
	}
	
	@GetMapping("/bookStoreDetails")
	public List<BookDetail> getAllBooksDetails(){
		return bookstoreClient.getAllBooksDetails();
	}
	
	@GetMapping("/bookStore/{id}")
	public BookDetail getBookById(@PathVariable String id) {
		return bookstoreClient.getBookById(id);
	}
	
	
}
