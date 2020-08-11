package com.mtechsolutions.dddjavaexample.domain.core.either;

import java.util.Objects;

public class Optional<T> {
    private final T value;
    private static final Optional<?> ABSENT = new Optional<>();

    private Optional() {
        this.value = null;
    }

    private Optional(T value) {
        if (value == null) {
            throw new IllegalArgumentException();
        } else {
            this.value = value;
        }
    }

    public static <T> Optional<T> ofNullable(T value) {
        return value == null ? (Optional<T>) empty() : of(value);
    }

    public static <T> Optional<T> of(T value) {
        return new Optional<>(value);
    }

    public static <T> Optional<T> empty() {
        return (Optional<T>) ABSENT;
    }

    public boolean isPresent() {
        return value != null;
    }

    public T get() {
        if (isPresent()) {
            return value;
        }
        throw new IllegalStateException("Value is absent.");
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }

        if (!(object instanceof Optional)) {
            return false;
        }

        final Optional<?> other = (Optional<?>) object;
        return Objects.equals(value, other.value);
    }

    @Override
    public int hashCode() {
        return isPresent() ? value.hashCode() : 0;
    }
}
