package com.project.elibrary.dao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.bind.annotation.CrossOrigin;
import com.project.elibrary.entity.Librarian;

@CrossOrigin("http://localhost:4200")
public interface LibrarianRepository extends JpaRepository<Librarian,Integer> {

}
