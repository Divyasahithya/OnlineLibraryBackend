package com.project.elibrary.service;
import org.springframework.stereotype.Service;

import com.project.elibrary.dao.BookRepository;
import com.project.elibrary.entity.Book;

import javax.transaction.Transactional;
import java.util.Set;
@Service
public class BookService {
private BookRepository bookrepository;
public BookService(BookRepository bookrepository) {
	this.bookrepository=bookrepository;
}
	  @Transactional
	  public void AddBook() {
		  Book book = null;
		  bookrepository.save(book);
		  
	  }

}


   

  
   

       

  









