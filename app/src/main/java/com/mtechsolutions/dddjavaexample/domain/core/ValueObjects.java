package com.mtechsolutions.dddjavaexample.domain.core;

import com.mtechsolutions.dddjavaexample.domain.core.either.Either;

import java.util.Objects;

public abstract class ValueObjects<T> {
    private final Either<ValueFailure<T>, T> value;

    protected ValueObjects(Either<ValueFailure<T>, T> value){
        this.value = value;
    }

    public boolean isValid(){
        return value.getRight().isPresent();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof ValueObjects))
            return false;
        ValueObjects<T> that = (ValueObjects<T>) o;
        return Objects.equals(this.value, that.value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(value);
    }

    @Override
    public String toString() {
        return "Value Object {"+ value + '}';
    }

    public Either<ValueFailure<T>, T> getValue(){
        return value;
    }

}
