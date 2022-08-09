package com.anemchenko.hometask1.task1;

public class PersonCreator {
    private PersonBuilder pb;

    public void setPersonBuilder(PersonBuilder pb){
        this.pb = pb;
    }
    public Person getPerson(){
        return pb.getPerson();
    }
    public void createPerson() throws Exception {
        try {
            pb.createNewPerson();
            pb.buildAddress();
            pb.buildAge();
            pb.buildGender();
            pb.buildFirstName();
            pb.buildCountry();
            pb.buildLastName();
            pb.buildMiddleName();
        }
        catch(NullPointerException nlp){
            throw new Exception("Insert a person builder");
        }
    }
}
