package com.example.questiontesting.exceptionAdvice;

import com.example.questiontesting.exception.NotFoundAnswerException;
import com.example.questiontesting.exception.NotFoundLevelException;
import com.example.questiontesting.exception.NotFoundProfileException;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

@ControllerAdvice
public class ExceptionController {

    @ResponseBody()
    @ResponseStatus(HttpStatus.NOT_FOUND)
    @ExceptionHandler(NotFoundProfileException.class)
    public String notFoundProfile(NotFoundProfileException ex) {
        return ex.getMessage();
    }

    @ResponseBody()
    @ResponseStatus(HttpStatus.NOT_FOUND)
    @ExceptionHandler(NotFoundProfileException.class)
    public String notFoundLevel(NotFoundLevelException ex) {
        return ex.getMessage();
    }
    @ResponseBody()
    @ResponseStatus(HttpStatus.NOT_FOUND)
    @ExceptionHandler(NotFoundProfileException.class)
    public String notFoundAnswer(NotFoundAnswerException ex) {
        return ex.getMessage();
    }
}
