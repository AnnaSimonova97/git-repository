package com.example.questiontesting.dto;

import lombok.*;

import java.util.List;


@Getter
@Setter
@ToString
@EqualsAndHashCode
@RequiredArgsConstructor

public class ProfileDto {

    private Long id;

    private String name;

    private List<QuestionDto> questions;
}
