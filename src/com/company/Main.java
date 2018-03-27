package com.company;

import java.text.ParseException;

public class Main {

    public static void main(String[] args) throws ParseException {

        Person person = new Person("Иванов", "Иван", "Иванович");

        System.out.println(person.getFullName("Иванов", "Иван", "Иванович"));

        System.out.println(person.getBriefName("Иванов", "Иван", "Иванович"));

        System.out.println(person.age("21/03/1990"));

    }
}





