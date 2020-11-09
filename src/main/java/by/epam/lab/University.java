package by.epam.lab;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.HashMap;

public class University {

    public static void main(String[] args) {

        HashMap <String, Integer> marksForHelen = new HashMap<String, Integer>();
        Student studentHelen = new Student("Helen", marksForHelen);
        studentHelen.addMark ("history", 11);
        studentHelen.addMark("Math", 9);
        HashMap <String, Integer> marksForTed = new HashMap<String, Integer>();
        Student studentTed = new Student("Ted", marksForTed);
        studentTed.addMark("history", 8);
        studentTed.addMark("Math", 6);
        HashMap <String, Integer> marksForTim = new HashMap<String, Integer>();
        Student studentTim = new Student("Tim", marksForTim);
        studentTim.addMark("history", 7);
        studentTim.addMark("Math", 9);
        ArrayList <Student> studentsFirst= new ArrayList<Student>();
        ArrayList <Student> studentsSecond= new ArrayList<Student>();
        studentsFirst.add(studentHelen);
        studentsFirst.add(studentTed);
        studentsSecond.add(studentTim);
        ArrayList <Group> groupsHist = new ArrayList<Group>();
        ArrayList <Group> groupsMath = new ArrayList<Group>();
        groupsHist.add(new Group("1", studentsFirst));
        groupsMath.add(new Group("2", studentsSecond));
        Univer univers = new Univer();
        univers.addFacultaies(new Faculty("History", groupsHist));
        univers.addFacultaies(new Faculty("Math", groupsMath));
        System.out.println(univers);


    }
}