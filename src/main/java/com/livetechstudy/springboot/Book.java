package com.livetechstudy.springboot;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="books")
public class Book {
	
	@Id
	private String bookid;
	private String booktitle;
	private String author;

	public Book() {
	}

	public Book(String bookid, String booktitle, String author) {
		this.bookid = bookid;
		this.booktitle = booktitle;
		this.author = author;
	}

	public String getBookid() {
		return bookid;
	}

	public void setBookid(String bookid) {
		this.bookid = bookid;
	}

	public String getBooktitle() {
		return booktitle;
	}

	public void setBooktitle(String booktitle) {
		this.booktitle = booktitle;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	@Override
	public String toString() {
		return "Book [bookid=" + bookid + ", booktitle=" + booktitle + ", author=" + author + "]";
	}
	

}
