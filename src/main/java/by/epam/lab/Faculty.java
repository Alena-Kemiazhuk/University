package by.epam.lab;
import lombok.*;
import java.util.ArrayList;

@Getter
@Setter


public class Faculty {
    private String nameOfFaculty;
    private ArrayList<Group> groups;

    public Faculty(String nameOfFaculty, ArrayList<Group> groups){
        this.nameOfFaculty = nameOfFaculty;
        this.groups = groups;
    }

//    public void addGroups(ArrayList<Student> students){
//        this.groups.add(addGroups(ArrayList <Student>students);
//    }

    @Override
    public String toString() {
        return   "nameOfFaculty= " + nameOfFaculty + ' '
                + groups+ ' ';
    }

}
