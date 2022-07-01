package com.testApp;
import java.io.*;
import java.util.*;

public class Main {





    public static void main(String[] args) {
	    Person person1 = new Person(1, "Mike");
        Person person2 = new Person(2, "lock");
        Person person3 = new Person(3, "Jack");

        List<Person> personList = new ArrayList<Person>();
        personList.add(person1);
        personList.add(person2);
        personList.add(person3);

        FileCleaner fileCleaner = new FileCleaner("src/com/testApp/PersonFile");

        try {
            fileCleaner.clear();
        } catch (IOException e) {
            e.printStackTrace();
        }

        SaveFile saveFile = new SaveFile(personList, "src/com/testApp/PersonFile");
        saveFile.save();

        LoadFile loadFile = new LoadFile("src/com/testApp/PersonFile");

        List<Person> newList = new ArrayList<>();
        try {
            newList = (List<Person>) loadFile.load();
        } catch (ClassCastException e) {
            e.printStackTrace();
        }

        System.out.println(newList);


    }
}
