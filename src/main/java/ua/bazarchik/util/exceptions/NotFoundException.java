package ua.bazarchik.util.exceptions;

public class NotFoundException extends RuntimeException {
    public NotFoundException(String message){
        super(message);
    }
}
