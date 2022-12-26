package com.project.elibrary.entity;

import lombok.AccessLevel;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
@Entity
@Table(name="librarian",schema="public")
@Data 
@Getter
@Setter

public class Librarian {
    @Id
    @Getter(AccessLevel.PUBLIC) 
    @Column(name = "id")
    public int id ;
   
    @Getter(AccessLevel.NONE)
    @Column(name="l_ID")
    public int l_ID=id;
    public int getL_ID() {
    	return id;
    }
    
    @Column(name = "fname")
    @NotNull(message="fname should not be null")
    @Pattern(regexp="[a-zA-Z]*+",message="must not contain special characters")
    public String fname;
    
    
    @Column(name = "lname")
    @NotNull(message="lname should not be null")
    @Pattern(regexp="[a-zA-Z]*+",message="must not contain special characters")
    public String lname;
    
   @Column(name="password")
   public String password;
   
    @Column(name = "mail")
    @Email(message="mail should be valid one")
    public String mail;
    
    @Column(name = "phone")
    @NotNull(message="phone should not be null")
    @Pattern(regexp = "[6-9][0-9]{9}", message = "must not contain special characters")
    public String phone;
    
    @Column(name = "gender")
    @NotNull(message="gender should not be null")
    public String gender;
    
   
}