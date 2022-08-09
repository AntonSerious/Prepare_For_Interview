package com.anemchenko.hometask1.task1;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println("hell");

        PersonCreator personCreator = new PersonCreator();
        PersonBuilder doctor = new DoctorBuilder();
        //personCreator.createPerson();
        personCreator.setPersonBuilder(doctor);
        personCreator.createPerson();
        Person doctorJohn = personCreator.getPerson();

        System.out.println(doctorJohn);

        PersonBuilder studentBuilder = new YoungStudentBuilder();

        personCreator.setPersonBuilder(studentBuilder);
        personCreator.createPerson();
        Person student = personCreator.getPerson();
        System.out.println(student);
    }
}
