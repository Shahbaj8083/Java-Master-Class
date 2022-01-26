package com.company;

public class Main {

    public static void main(String[] args) {
        Person person=new Person();//creating object

        person.setFirstName("Raju");
        person.setLastName("");
        person.setAge(13);
        System.out.println("Full name is "+ person.getFullName());
        System.out.println("isTeen :"+person.isTeen());

    }
}
