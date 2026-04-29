package com.library.service;

import java.util.List;
import java.util.Optional;

import com.library.beans.BookEntity;


public interface BookStore {
	public BookEntity saveBook1(BookEntity entity);

	List<BookEntity> getAllBooks();

	Optional<BookEntity> getBookById(String id);
		
}
