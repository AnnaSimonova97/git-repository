package com.example.questiontesting.controller;

import com.example.questiontesting.dto.LevelDto;
import com.example.questiontesting.entity.Level;
import com.example.questiontesting.service.LevelService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/level")
@AllArgsConstructor
public class LevelController {

    private LevelService service;

    @GetMapping("/get/{id}")
    public LevelDto getLevelById(Long id) {
        return service.getById(id);
    }
    public void deletebyName(Level name){
        service.deleteByName(name);
    }
}
