package com.mtechsolutions.dddjavaexample.domain.contact;

import com.mtechsolutions.dddjavaexample.domain.core.Validators;
import com.mtechsolutions.dddjavaexample.domain.core.ValueFailure;
import com.mtechsolutions.dddjavaexample.domain.core.ValueObjects;
import com.mtechsolutions.dddjavaexample.domain.core.either.Either;

public class ContactValueObject {
    static class Name extends ValueObjects<String>{
        private Either<ValueFailure<String>,String> value;

        public static Name getValidName(String name){
            return new Name(Validators.validName(name));
        }

        public Name(Either<ValueFailure<String>,String> value){
            super(value);
            this.value = value;
        }

        public Either<ValueFailure<String>, String> getValue() {
            return value;
        }
    }

    static class Image extends ValueObjects<String>{
        private Either<ValueFailure<String>,String> value;

        public static Image getValidImage(String image){
            return new Image(Validators.validName(image));
        }

        public Image(Either<ValueFailure<String>,String> value){
            super(value);
            this.value = value;
        }

        public Either<ValueFailure<String>, String> getValue() {
            return value;
        }
    }

    static class Phone extends ValueObjects<String>{
        private Either<ValueFailure<String>,String> value;

        public static Phone getValidPhone(String phone){
            return new Phone(Validators.validName(phone));
        }

        public Phone(Either<ValueFailure<String>,String> value){
            super(value);
            this.value = value;
        }

        public Either<ValueFailure<String>, String> getValue() {
            return value;
        }
    }





}
