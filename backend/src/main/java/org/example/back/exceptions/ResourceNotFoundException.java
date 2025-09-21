package org.example.back.exceptions;

public class ResourceNotFoundException extends RuntimeException {

    public ResourceNotFoundException(String resource, Long id) {
        super(resource + " with id " + id + " not found.");
    }

    public ResourceNotFoundException(String message) {
        super(message);
    }
}
