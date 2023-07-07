package com.example.raiseTechcoursetask9.controller;
import com.example.raiseTechcoursetask9.entity.Skiresort;
import com.example.raiseTechcoursetask9.response.SkiresortResponse;
import com.example.raiseTechcoursetask9.service.SkiresortService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class SkiresortController {

    // field(ControllerにMapper->Serviceを定義）
    private final SkiresortService skiresortService;

    // constructor(ControllerのコンストラクタとしてMapper->Serviceを定義）
    public SkiresortController(SkiresortService skiresortService) {
        this.skiresortService = skiresortService;
    }

    @GetMapping("/skiserots")
    public List<SkiresortResponse> skiresorts() {
        List<Skiresort> skiresorts = skiresortService.findAll();
        List<SkiresortResponse> skiresortResponses = skiresorts.stream().map(SkiresortResponse::new).toList();

        return skiresortResponses;
        }
}
