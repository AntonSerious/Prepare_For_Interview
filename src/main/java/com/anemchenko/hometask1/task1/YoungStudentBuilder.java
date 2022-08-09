package com.anemchenko.hometask1.task1;

public class YoungStudentBuilder extends PersonBuilder{


    @Override
    public void buildFirstName() {
        person.setFirstName("Yang");
    }

    @Override
    public void buildLastName() {
        person.setLastName("Li");
    }

    @Override
    public void buildMiddleName() {
        person.setMiddleName("Von");
    }

    @Override
    public void buildCountry() {
        person.setCountry("China");
    }

    @Override
    public void buildAddress() {
        person.setAddress("China, Beijing");
    }

    @Override
    public void buildAge() {
        person.setAge(21);
    }

    @Override
    public void buildGender() {
        person.setGender("M");
    }


}
