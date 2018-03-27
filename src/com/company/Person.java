package com.company;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Person {

    private String surname;
    private String name;
    private String patronymic;
    private String dateOfBirth;


    public Person(String surname, String name, String patronymic) {
        this.surname = surname;
        this.name = name;
        this.patronymic = patronymic;
    }

    public Person(String surname, String name, String patronymic, String dateOfBirth) {
        this.surname = surname;
        this.name = name;
        this.patronymic = patronymic;
        this.dateOfBirth = dateOfBirth;
    }

    @Override
    public String toString() {
        return "Person {" +
                "surname = '" + surname + '\'' +
                ", name = '" + name + '\'' +
                ", patronymic = '" + patronymic + '\'' +
                ", dateOfBirth = '" + dateOfBirth + '\'' +
                '}';
    }

    public static String getFullName(String surname, String name, String patronymic) {
        String fullName = surname + " " + name + " " + patronymic + ".";
        return fullName;
    }

    public static String getBriefName(String surname, String name, String patronymic) {
            String briefName = surname + " " + name.charAt(0) + ". " + patronymic.charAt(0) + ".";
            return briefName;
        }

    public static int age(String dateOfBirth) throws ParseException {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");
        Date birthday = simpleDateFormat.parse(dateOfBirth);
        Calendar calendarBirthday = Calendar.getInstance();
        calendarBirthday.setTime(birthday);
        Date today = new Date();
        Calendar calendarToday = Calendar.getInstance();
        calendarToday.setTime(today);
        int yearsOld = calendarToday.get(Calendar.YEAR) - calendarBirthday.get(Calendar.YEAR);
        if (calendarToday.get(Calendar.DAY_OF_YEAR) < calendarBirthday.get(Calendar.DAY_OF_YEAR)) {
            yearsOld--;
        }
        return yearsOld;
    }
}








