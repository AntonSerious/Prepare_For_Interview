package com.anemchenko.hometask1.task1;

public class DoctorBuilder extends PersonBuilder{


    @Override
    public void buildFirstName() {
        person.setFirstName("John");
    }

    @Override
    public void buildLastName() {
        person.setLastName("Green");
    }

    @Override
    public void buildMiddleName() {
        person.setMiddleName("");
    }

    @Override
    public void buildCountry() {
        person.setCountry("USA");
    }

    @Override
    public void buildAddress() {
        person.setAddress("USA, California");
    }

    @Override
    public void buildAge() {
        person.setAge(36);
    }

    @Override
    public void buildGender() {
        person.setGender("M");
    }

}
