package com.dailycodebuffer.springboot.model;
import lombok.Data;
import org.springframework.http.HttpStatus;

@Data
public class ErrorMessage {

    private HttpStatus status;
    private String message;

    public ErrorMessage(HttpStatus status, String message) {
        this.status = status;
        this.message = message;
    }

}
