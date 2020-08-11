package com.mtechsolutions.dddjavaexample.domain.auth;


import com.mtechsolutions.dddjavaexample.domain.core.Validators;
import com.mtechsolutions.dddjavaexample.domain.core.either.Either;
import com.mtechsolutions.dddjavaexample.domain.core.ValueFailure;
import com.mtechsolutions.dddjavaexample.domain.core.ValueObjects;

public class AuthValueObject{
    public static class EmailAddress extends ValueObjects<String>{

        public static EmailAddress EmailAddress(String email){
            return new EmailAddress(Validators.validateEmail(email));
        }

        private EmailAddress(Either<ValueFailure<String>, String> value) {
            super(value);
        }
    }

    public static class Password extends ValueObjects<String>{
        final Either<ValueFailure<String>, String> value;

        public static Password getValidPassword(String pass){
            return new Password(Validators.validPassword(pass));
        }

        private Password(Either<ValueFailure<String>, String> value) {
            super(value);
            this.value=value;
        }
    }
}

