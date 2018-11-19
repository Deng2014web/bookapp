package com.sundaysee.entity;

import java.sql.Date;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Book {
    private Integer id;     //id
    private String name;    //书名
    private String author;  //作者
    private String publication; //出版社
    private Date publicationdate;   //出版日期
    private Double price;       //价格
    private String image;       //封面图片
    private String remark;      //详细描述
}