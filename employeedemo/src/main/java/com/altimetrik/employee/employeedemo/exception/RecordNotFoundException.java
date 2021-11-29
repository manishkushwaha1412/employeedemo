package com.altimetrik.employee.employeedemo.exception;

import java.text.MessageFormat;

public class RecordNotFoundException extends RuntimeException {

    public RecordNotFoundException(String message){
        super(message);
    }

    public RecordNotFoundException(String message, String employee){
        super(MessageFormat.format(message+" for employee {} ", employee));
    }
}
