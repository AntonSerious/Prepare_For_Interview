package com.anemchenko.hometask1.task1;

public abstract class PersonBuilder {
     protected Person person;

     public Person getPerson(){
         return person;
     }
     public void createNewPerson(){
         person = new Person();
     }
     public abstract void buildFirstName();
    public abstract void buildLastName();
    public abstract void buildMiddleName();
    public abstract void buildCountry();
    public abstract void buildAddress();
    public abstract void buildAge();
    public abstract void buildGender();
}
