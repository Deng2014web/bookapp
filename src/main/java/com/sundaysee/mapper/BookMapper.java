package com.sundaysee.mapper;

import java.util.List;

import com.sundaysee.entity.Book;

import org.apache.ibatis.annotations.Select;

public interface BookMapper {

    /**
     * 查询所有图书
     * @return 图书对象集合
     */
    @Select("select * from tb_book")
    List<Book> findAll();
}