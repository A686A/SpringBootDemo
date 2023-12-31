package com.example.springbootdemo.mapper;

import com.example.springbootdemo.entity.Book;
import com.example.springbootdemo.entity.Group;
import com.example.springbootdemo.entity.groupVo;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface BookMapper {
    List<Book> getBook();

    List<groupVo> getGroup();
}
