package com.project.elibrary.entity;

import lombok.AccessLevel;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import java.util.Date;
import javax.persistence.*;
import javax.validation.constraints.Digits;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

import org.hibernate.annotations.CreationTimestamp;


@Getter
@Setter
@Entity
@Table(name="book" ,schema="public")
@Data


public class Book {
    @Id
    @Column(name = "b_id")
    public int b_id;
    @Getter(AccessLevel.NONE)
    @Column(name = "id")
    public int id=b_id;
    public int getId() {
    	return b_id;
    }
    
    @Column(name = "callno")
    @NotNull(message="callno should not be null")
    @Pattern(regexp="[A-Z]{1}[/-]{1}[0-9]{1}",message="must not contain special characters")
    public String callno;
    
    @Column(name = "name")
    @NotNull(message="name should not be null")
    @Pattern(regexp = "[a-z A-Z]*+", message = "must not contain special characters")
    public String name;
    
    @Column(name = "author")
    @NotNull(message="author should not be null")
    @Pattern(regexp = "[a-z A-Z]*+", message = "must not contain special characters")
    public String author;
    
    @Column(name = "publisher")
    @NotNull(message="publisher should not be null")
    @Pattern(regexp = "[a-z A-Z]*+", message = "must not contain special characters")
    public String publisher;
    
    @Column(name = "quantity")
    @NotNull(message="quantity should not be null")
    @Digits(integer = 5, fraction = 0, message="Invalid quantity")
    public int quantity;
    
    @Column(name = "issued")
    @NotNull(message="issued should not be null")
    public int issued;
    
    @Column(name = "added_date")
    @CreationTimestamp
    @Temporal(TemporalType.DATE)
    public Date added_date;
   
}