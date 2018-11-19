package com.sundaysee.controller;

import java.util.List;

import com.sundaysee.entity.Book;
import com.sundaysee.service.BookService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
class BookController {

    /**
     * 自动注入BookService
     */
    @Autowired
    @Qualifier("bookService")
    private BookService bookService;

    @GetMapping(value = "/main")
    public String main(Model model) {
        //获取所有的图书集合
        List<Book> booList = bookService.getAll();
        //将图书集合添加到model中
        model.addAttribute("book_list", booList);
        //跳转到main
        return "main";
    }

}