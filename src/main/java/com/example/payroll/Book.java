package com.example.payroll;

public class Book{

    private String title;
    private String author;
    private Integer year;
    Book(){};
    Book(String title, String author,Integer year) {

        this.title = title;
        this.author = author;
        this.year = year;
    }

    public String getTitle(){
        return this.title;
    }

    public String getAuthor(){
        return this.author;
    }

    public Integer getYear(){
        return this.year;
    }

    public String setTitle(String title){
        return this.title=title;
    }

    public String setAuthor(String author){
        return this.author=author;
    }

    public Integer setYear(Integer year){
        return this.year=year;
    }

}
