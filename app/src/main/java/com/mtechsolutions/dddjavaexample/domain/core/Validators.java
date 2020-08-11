package com.mtechsolutions.dddjavaexample.domain.core;

import com.mtechsolutions.dddjavaexample.domain.core.either.Either;

import java.util.regex.Matcher;

import static com.mtechsolutions.dddjavaexample.domain.core.CONSTRAINS.VALID_EMAIL_ADDRESS_REGEX;
import static com.mtechsolutions.dddjavaexample.domain.core.either.Either.left;
import static com.mtechsolutions.dddjavaexample.domain.core.either.Either.right;

public class Validators {

    public static Either<ValueFailure<String>,String> validateEmail(String email){
        Matcher matcher = VALID_EMAIL_ADDRESS_REGEX.matcher(email);
        if(matcher.find()){
            return right(email);
        }
        else
            return left(ValueFailure.getFailure(email));

    }

    public static Either<ValueFailure<String>,String> validPassword(String password){
        if(password.length()>=6){
            return right(password);
        }
        else
            return left(ValueFailure.getFailure(password));
    }

    public static Either<ValueFailure<String>,String> validName(String name){
        if(!name.isEmpty()){
            return right(name);
        }
        else
            return left(ValueFailure.getFailure(name));
    }

    public static Either<ValueFailure<String>,String> validImage(String image){
        if(!image.isEmpty()){
            return right(image);
        }
        else
            return left(ValueFailure.getFailure(image));
    }
    public static Either<ValueFailure<String>,String> validPhone(String phone){
        if(!phone.isEmpty()){
            return right(phone);
        }
        else
            return left(ValueFailure.getFailure(phone));
    }

}
