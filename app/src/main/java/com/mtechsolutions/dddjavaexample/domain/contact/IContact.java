package com.mtechsolutions.dddjavaexample.domain.contact;

import androidx.lifecycle.LiveData;

import com.mtechsolutions.dddjavaexample.domain.core.Failures;
import com.mtechsolutions.dddjavaexample.domain.core.either.Either;

import java.util.List;

public interface IContact {
    public LiveData<List<Either<Failures,Contact>>> getAllContacts();
    public LiveData<Either<Failures,Contact>> addContact(Contact contact);
    public LiveData<Either<Failures,Contact>> singleUpdate(Contact contact);
    public LiveData<Either<Failures,Contact>> singleDelete(Contact contact);

}
