package com.example.questiontesting.controller;

import com.example.questiontesting.dto.AnswerDto;
import com.example.questiontesting.service.AnswerService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/answer")
@AllArgsConstructor
public class AnswerController {

    private AnswerService service;

    public AnswerDto getAnswerById(Long id){
        return service.getById(id);
    }
}
