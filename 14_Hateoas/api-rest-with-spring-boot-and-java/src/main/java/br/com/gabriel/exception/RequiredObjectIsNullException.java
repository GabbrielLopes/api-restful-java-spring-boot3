package br.com.gabriel.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.BAD_REQUEST)
public class RequiredObjectIsNullException extends RuntimeException {
    private static final long serialVersionUID = 6624254215215230194L;


    public RequiredObjectIsNullException(String ex) {
        super(ex);
    }

    public RequiredObjectIsNullException() {
        super("It is not allowed to persist a null object!");
    }

}
