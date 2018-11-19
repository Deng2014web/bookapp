package com.sundaysee.service.impl;

import java.util.List;

import com.sundaysee.entity.Book;
import com.sundaysee.mapper.BookMapper;
import com.sundaysee.service.BookService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Book服务层接口实现类
 * @Service("bookService")用于将当前类注释为一个Spring的bean，名为bookService
 */
@Service("bookService")
public class BookServiceImpl implements BookService {

    /**
     * 自动注入BookMapper
     */
    @Autowired
    private BookMapper bookMapper;

    @Override
	public List<Book> getAll() {
		return bookMapper.findAll();
	}



}