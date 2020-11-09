package by.epam.lab;

import lombok.*;

import java.util.Collection;
import java.util.HashMap;
import java.util.stream.Stream;

@Getter
@Setter


public class Student {
    private String name;
    private HashMap<String, Integer> marks;
    private int sum;
    private double avg;

    public Student(String name, HashMap<String, Integer> marks) {
        this.name = name;
        this.marks = marks;
    }

    public HashMap<String, Integer> getMarks() {
        return marks;
    }

    public void addMark(String subject, Integer mark){
        this.marks.put(subject, mark);
        sum = sum + mark;
        avg = Math.round(sum / this.marks.size());
    }

    public double getAvg() {
        return avg;
    }

    @Override
    public String toString() {
        return "nameOfStudent= " + name + ' '
                + marks + ' ' + getAvg();
    }

}

