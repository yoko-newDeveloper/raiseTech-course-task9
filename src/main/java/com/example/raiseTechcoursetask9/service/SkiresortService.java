package com.example.raiseTechcoursetask9.service;

import com.example.raiseTechcoursetask9.entity.Skiresort;

import java.util.List;

public interface SkiresortService {

    // skiresortテーブルを全部取得する
    List<Skiresort> findAll();
}
