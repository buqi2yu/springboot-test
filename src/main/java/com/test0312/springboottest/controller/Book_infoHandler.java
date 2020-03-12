package com.test0312.springboottest.controller;

import com.test0312.springboottest.entity.Book_info;
import com.test0312.springboottest.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/book")
public class Book_infoHandler {
    @Autowired//自动装载
    private BookRepository bookRepository;

    @GetMapping("findAll")
    public List<Book_info> findAll(){//返回一个List集合
    return bookRepository.findAll();
    }
}
