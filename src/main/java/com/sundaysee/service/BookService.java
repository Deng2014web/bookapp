package com.sundaysee.service;

import java.util.List;

import com.sundaysee.entity.Book;

public interface BookService {

    /**
     * 查询所有的书
     * @return Book对象几何
     */
    List<Book> getAll();

}