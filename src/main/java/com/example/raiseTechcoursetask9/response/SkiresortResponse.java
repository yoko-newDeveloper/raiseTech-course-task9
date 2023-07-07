package com.example.raiseTechcoursetask9.response;

import com.example.raiseTechcoursetask9.entity.Skiresort;

public class SkiresortResponse {

    // レスポンスに返したいフィールドだけを定義する
    private String name;
    private String area;

    public SkiresortResponse(Skiresort skiresort) {
        this.name = skiresort.getName();
        this.area = skiresort.getArea();
    }

    public String getName() {
        return name;
    }

    public String getArea() {
        return area;
    }
}
