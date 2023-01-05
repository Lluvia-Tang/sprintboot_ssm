package com.itheima;

import com.itheima.domain.Book;
import com.itheima.service.BookService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class Springboot09SsmApplicationTests {
    @Autowired
    private BookService bookService;

    @Test
    void contextLoads() {
        Book book = bookService.getById(2);
        System.out.println(book);
    }

}
