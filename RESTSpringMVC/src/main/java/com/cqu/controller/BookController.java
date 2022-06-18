package com.cqu.controller;

import com.cqu.domain.Book;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController//包含@Controller、@RequestBody
@RequestMapping("/books")
public class BookController {
    @PostMapping
    public String save(@RequestBody Book book){
        System.out.println("book save=>"+book);
        return "{'module':'book save success'}";
    }

    @GetMapping
    public List<Book> getAll(){
        Book book1 = new Book();
        book1.setType("小说");
        book1.setDescription("nb");
        book1.setName("SpringMVC");

        Book book2 = new Book();
        book2.setType("计算机");
        book2.setDescription("wow");
        book2.setName("RESTful");

        List<Book> books = new ArrayList<>();
        books.add(book1);
        books.add(book2);
        return books;
    }
}
