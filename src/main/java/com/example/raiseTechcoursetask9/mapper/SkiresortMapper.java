package com.example.raiseTechcoursetask9.mapper;

import com.example.raiseTechcoursetask9.entity.Skiresort;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface SkiresortMapper {
    @Select("SELECT * FROM skiresort")
    List<Skiresort> findAll();
}
