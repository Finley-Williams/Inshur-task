package org.finley.inshur.exceptions;

public class OpenWeatherApiErrorException extends Exception {
    private final String statusCode;

    public OpenWeatherApiErrorException(String message, String statusCode) {
        super(message);
        this.statusCode = statusCode;
    }

    public String getStatusCode() {
        return statusCode;
    }
}
