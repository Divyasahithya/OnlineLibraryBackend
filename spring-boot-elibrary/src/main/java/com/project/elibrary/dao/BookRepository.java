package com.project.elibrary.dao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.project.elibrary.entity.Book;

@CrossOrigin("http://localhost:4200")
public interface BookRepository  extends JpaRepository<Book,Integer>{

}
