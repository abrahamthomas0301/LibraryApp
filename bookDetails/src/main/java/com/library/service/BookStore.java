package com.library.service;

import java.util.List;

import com.library.beans.BookEntity;


public interface BookStore {
	public BookEntity saveBook1(BookEntity entity);

	List<BookEntity> getAllBooks();
		
}
