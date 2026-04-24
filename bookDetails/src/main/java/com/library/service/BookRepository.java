package com.library.service;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.library.beans.BookEntity;
@Repository
public interface BookRepository extends JpaRepository<BookEntity, Long>{

}
