package com.livetechstudy.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.data.domain.Example;

@SpringBootApplication
public class Application{
	
	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(Application.class, args);
		BookRepository repository =context.getBean(BookRepository.class);
		String bookid="1001";
		repository.save(new Book(bookid, "ABC", "XYZ"));
		
		System.out.println("Find All After save");
		System.out.println(repository.findAll());
		
		System.out.println("Find By ID");
		System.out.println(repository.findById(bookid).get());
		
		System.out.println("Find By Title");
		Book b = new Book();
		b.setBooktitle("ABC");
		Example<Book>example = Example.of(b);
		System.out.println(repository.findAll(example));
		
		System.out.println("Deleting ID:"+bookid);
		repository.deleteById(bookid);
		
		System.out.println("Find All After Deleting");
		System.out.println(repository.findAll());
	}
}
