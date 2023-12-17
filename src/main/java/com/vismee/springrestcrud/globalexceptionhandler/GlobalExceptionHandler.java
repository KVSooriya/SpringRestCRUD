package com.vismee.springrestcrud.globalexceptionhandler;

import com.vismee.springrestcrud.customException.EmployeeNotFoundException;
import com.vismee.springrestcrud.entity.Employee;
import com.vismee.springrestcrud.exceptionentity.EmployeeErrorResponse;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class GlobalExceptionHandler
{
    @ExceptionHandler
    public ResponseEntity<EmployeeErrorResponse> handleException(EmployeeNotFoundException ex)
    {
        EmployeeErrorResponse eer = new EmployeeErrorResponse();
        eer.setStatus(HttpStatus.NOT_FOUND.value());
        eer.setMessage(ex.getMessage());
        eer.setTimestamp(System.currentTimeMillis());
        return new ResponseEntity<>(eer,HttpStatus.NOT_FOUND);
    }

    @ExceptionHandler
    public ResponseEntity<EmployeeErrorResponse> handleException(Exception ex)
    {
        EmployeeErrorResponse er = new EmployeeErrorResponse();
        er.setStatus(HttpStatus.BAD_REQUEST.value());
        er.setMessage(ex.getMessage());
        er.setTimestamp(System.currentTimeMillis());
        return new ResponseEntity<>(er,HttpStatus.BAD_REQUEST);
    }

}
