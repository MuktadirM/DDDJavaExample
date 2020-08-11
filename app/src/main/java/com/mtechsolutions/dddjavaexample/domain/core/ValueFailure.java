package com.mtechsolutions.dddjavaexample.domain.core;

public class ValueFailure<T> {
    private final String error;

    public static ValueFailure<String> getFailure(String message){
        assert message!=null;
        return new ValueFailure<>(message);
    }

    private ValueFailure(String error) {
        this.error = error;
    }

    public String getError(){
        return error;
    }
}
