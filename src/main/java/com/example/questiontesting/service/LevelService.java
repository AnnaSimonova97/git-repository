package com.example.questiontesting.service;

import com.example.questiontesting.dto.AnswerDto;
import com.example.questiontesting.dto.LevelDto;
import com.example.questiontesting.entity.Level;
import com.example.questiontesting.exception.NotFoundLevelException;
import com.example.questiontesting.repositories.LevelRepository;
import com.example.questiontesting.util.Mapper;

public class LevelService {

    private LevelRepository levelRepository;

    private Mapper mapper;

    public LevelService(LevelRepository levelRepository, Mapper mapper) {
        this.levelRepository = levelRepository;
        this.mapper = mapper;
    }

    public LevelDto getById(Long id) {
        Level level = levelRepository.findById(id).orElseThrow(() -> new NotFoundLevelException(id));
        LevelDto levelDto = this.mapper.mapper(level, LevelDto.class);
        mapper.mapper(levelDto, Level.class);
        return levelDto;
    }

    public void deleteByName(Level name) {
       levelRepository.delete(name);

    }
}
