package com.example.liddleoxfordlibrary.model;


import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name="books")
public class Book {
    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private String bookTitle;
    @Column
    private String authorName;

    @Column
    private Date dateAdded;

    @Column
    private boolean checkedOut;

    @Column
    private Date dateRemoved;

    @Column
    private String googleBooksId;


    public Book() {
    }

    public Book(Long id, String bookTitle, String authorName, Date dateAdded, boolean checkedOut, Date dateRemoved, String googleBooksId) {
        this.id = id;
        this.bookTitle = bookTitle;
        this.authorName = authorName;
        this.dateAdded = dateAdded;
        this.checkedOut = checkedOut;
        this.dateRemoved = dateRemoved;
        this.googleBooksId = googleBooksId;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getBookTitle() {
        return bookTitle;
    }

    public void setBookTitle(String bookTitle) {
        this.bookTitle = bookTitle;
    }

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public Date getDateAdded() {
        return dateAdded;
    }

    public void setDateAdded(Date dateAdded) {
        this.dateAdded = dateAdded;
    }

    public boolean isCheckedOut() {
        return checkedOut;
    }

    public void setCheckedOut(boolean checkedOut) {
        this.checkedOut = checkedOut;
    }

    public Date getDateRemoved() {
        return dateRemoved;
    }

    public void setDateRemoved(Date dateRemoved) {
        this.dateRemoved = dateRemoved;
    }

    public String getGoogleBooksId() {
        return googleBooksId;
    }

    public void setGoogleBooksId(String googleBooksId) {
        this.googleBooksId = googleBooksId;
    }
}
