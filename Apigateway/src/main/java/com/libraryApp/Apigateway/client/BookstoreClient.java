package com.libraryApp.Apigateway.client;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.library.beans.BookDetail;

@FeignClient(name = "bookDetails")
public interface BookstoreClient {

	@GetMapping("/bookStore/{name}/{author}")
	public BookDetail saveBook(@PathVariable String name,@PathVariable String author);
	
	@GetMapping("/bookStoreDetails")
	public List<BookDetail> getAllBooksDetails();
	
	@GetMapping("/bookStore/{id}")
	public BookDetail getBookById(@PathVariable String id);
	
	@DeleteMapping("/bookStore/{id}")
	public boolean deleteBookById(@PathVariable String id);
	
	@PutMapping("/bookStore/{id}")
	public boolean updateBookById(@PathVariable String id,@RequestBody BookDetail detail);
}
