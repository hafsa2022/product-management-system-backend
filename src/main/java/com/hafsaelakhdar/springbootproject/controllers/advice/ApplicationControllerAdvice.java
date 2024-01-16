package com.hafsaelakhdar.springbootproject.controllers.advice;

import com.hafsaelakhdar.springbootproject.dto.ErrorEntity;
import jakarta.persistence.EntityNotFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

@ControllerAdvice
public class ApplicationControllerAdvice {
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    @ExceptionHandler({EntityNotFoundException.class})
    public @ResponseBody ErrorEntity handelException(EntityNotFoundException exception){
        return new ErrorEntity(exception.getMessage());
    }


}
