package by.epam.lab;
import lombok.*;
import java.util.ArrayList;

@Getter
@Setter


public class Group {

    private String numberOfGroup;
    private ArrayList <Student> students;

    public Group (String numberOfGroup, ArrayList <Student> students){
        this.numberOfGroup = numberOfGroup;
        this.students = students;
    }

    @Override
    public String toString() {
        return
                "numberOfGroup= " + numberOfGroup + ' '
                 + students+ ' ';
    }

        public void addStudent(Student student){
        this.students.add(student);
    }

}
