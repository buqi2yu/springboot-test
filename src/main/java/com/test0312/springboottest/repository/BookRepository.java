package com.test0312.springboottest.repository;

import com.test0312.springboottest.entity.Book_info;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book_info,Integer> {
}
