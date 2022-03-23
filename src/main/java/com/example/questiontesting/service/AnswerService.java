package com.example.questiontesting.service;

import com.example.questiontesting.dto.AnswerDto;
import com.example.questiontesting.entity.Answer;
import com.example.questiontesting.exception.NotFoundLevelException;
import com.example.questiontesting.repositories.AnswerRepository;
import com.example.questiontesting.repositories.ProfileRepository;
import com.example.questiontesting.util.Mapper;

public class AnswerService {

    private AnswerRepository answerRepository;

    private Mapper mapper;

    public AnswerService(AnswerRepository answerRepository, Mapper mapper) {
        this.answerRepository = answerRepository;
        this.mapper = mapper;
    }

    public AnswerDto getById(Long id){
        Answer answer = answerRepository.findById(id).orElseThrow(() -> new NotFoundLevelException(id));
        AnswerDto answerDto = mapper.mapper(answer, AnswerDto.class);
        mapper.mapper(answerDto, Answer.class);
        return answerDto;
    }

}
