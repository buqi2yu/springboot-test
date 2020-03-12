package com.test0312.springboottest.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity//加上此注解，此实体类就可以和数据库中同名表链接起来。
@Data
public class Book_info {
    @Id
    private Integer Id;
    private String book_name;
    private String book_type;
    private String book_author;
    private Integer book_price;
    private String book_publish;
    private Integer book_page;
}
