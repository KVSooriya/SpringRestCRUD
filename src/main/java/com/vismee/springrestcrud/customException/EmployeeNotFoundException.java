package com.vismee.springrestcrud.customException;

public class EmployeeNotFoundException extends RuntimeException
{
    public EmployeeNotFoundException(String message) {
        super(message);
    }
}
