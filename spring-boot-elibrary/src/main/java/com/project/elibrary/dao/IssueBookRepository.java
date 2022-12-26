package com.project.elibrary.dao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.project.elibrary.entity.IssueBook;

@CrossOrigin("http://localhost:4200")

public interface IssueBookRepository  extends JpaRepository<IssueBook,Integer>{

}
