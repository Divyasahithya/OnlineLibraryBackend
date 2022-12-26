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



@Entity
@Table(name="issuebook", schema="public")
@Data 
@Getter
@Setter

public class IssueBook {
    @Id
   
    @Column(name = "issue_id")
     public int issue_id;
    @Getter(AccessLevel.NONE)
    @Column(name = "id")
    public int id=issue_id;
    public int getId() {
    	return issue_id;
    }

    @Column(name = "callno")
    @NotNull(message="callno should not be null")
    @Pattern(regexp="[A-Z]{1}[/-]{1}[0-9]*",message="must not contain special characters")
    public String callno;
    
    @Column(name = "stu_id")
    @NotNull(message="stu_id should not be null")
    @Digits(integer = 1000, fraction = 0, message="Invalid quantity")
    public int stu_id;
    
    @Column(name = "stuname")
    @NotNull(message="stuname should not be null")
    @Pattern(regexp = "[a-z A-Z]*+", message = "must not contain special characters")
    public String stuname;
    
     @Column(name = "returnstatus")
    public String returnstatus;
   
    
    @Column(name = "stu_phone")
    @NotNull(message="stu_phone should not be null")
    @Pattern(regexp = "[6-9][0-9]{9}", message = "must not contain special characters")
    public String stu_phone;
    
    @Column(name = "issue_date")
    @CreationTimestamp
    @Temporal(TemporalType.DATE)
    public Date issue_date;
   


    
}