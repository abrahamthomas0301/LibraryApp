package com.libraryApp.Apigateway.client;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.library.beans.BookDetail;

@FeignClient(name = "bookDetails")
public interface BookstoreClient {

	@GetMapping("/bookStore/{name}/{author}")
	public BookDetail saveBook(@PathVariable String name,@PathVariable String author);
	
	@GetMapping("/bookStoreDetails")
	public List<BookDetail> getAllBooksDetails();
	
	@GetMapping("/bookStore/{id}")
	public BookDetail getBookById(@PathVariable String id);
}
