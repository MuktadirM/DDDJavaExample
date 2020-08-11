package com.mtechsolutions.dddjavaexample.domain.auth;

import androidx.lifecycle.LiveData;

import com.mtechsolutions.dddjavaexample.domain.core.Failures;
import com.mtechsolutions.dddjavaexample.domain.core.either.Either;
import com.mtechsolutions.dddjavaexample.domain.auth.AuthValueObject.*;


public interface IAuthFacade {
    public LiveData<Either<Failures, User>> RegisterWithEmailPassword(EmailAddress emailAddress, Password password);
    public LiveData<Either<Failures, User>> loginWithEmailPassword(EmailAddress emailAddress, Password password);
    public LiveData<Either<Failures, User>> skipLogin();
    public LiveData<Either<Failures,User>> loginWithGoogle();

}
