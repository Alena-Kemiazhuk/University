package by.epam.lab;

import lombok.val;

import java.util.ArrayList;
import java.util.Collection;

public class Univer {

    private ArrayList<Faculty> faculties;



    public Univer() {
        this.faculties = new ArrayList<Faculty>();
    }


    public void addFacultaies (Faculty faculty) {
        this.faculties.add(faculty);
    }



    @Override
    public String toString() {
        return
                "university:" + faculties;
    }
}
