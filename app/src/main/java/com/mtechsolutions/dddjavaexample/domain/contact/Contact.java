package com.mtechsolutions.dddjavaexample.domain.contact;

import com.mtechsolutions.dddjavaexample.domain.contact.ContactValueObject.*;

import java.util.Objects;

public class Contact {
    private Name name;
    private Phone phone;
    private Image image;

    public Contact(Name name, Phone phone, Image image) {
        this.name = name;
        this.phone = phone;
        this.image = image;
    }

    public Name getName() {
        return name;
    }

    public void setName(Name name) {
        this.name = name;
    }

    public Phone getPhone() {
        return phone;
    }

    public void setPhone(Phone phone) {
        this.phone = phone;
    }

    public Image getImage() {
        return image;
    }

    public void setImage(Image image) {
        this.image = image;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Contact)) return false;
        Contact contact = (Contact) o;
        return Objects.equals(name, contact.name) &&
                Objects.equals(phone, contact.phone) &&
                Objects.equals(image, contact.image);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, phone, image);
    }
}
