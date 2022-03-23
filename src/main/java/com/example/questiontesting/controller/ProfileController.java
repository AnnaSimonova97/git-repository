package com.example.questiontesting.controller;

import com.example.questiontesting.dto.ProfileDto;
import com.example.questiontesting.service.ProfileService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/profile")
@AllArgsConstructor
public class ProfileController {

    private ProfileService service;


    //localhost:8080/profile/get/4
    @GetMapping("/get/{id}")
    public ProfileDto getProfileById(@PathVariable Long id) {
        return service.getById(id);
    }

}
