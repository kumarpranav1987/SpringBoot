package com.livetechstudy.springboot;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book, String> {
	public List<Book> findByBooktitle(String bookTitle);
}
