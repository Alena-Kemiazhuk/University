package by.epam.lab;
import lombok.*;
@Getter
@Setter

public class Subject {

    String nameOfSubject;

    public Subject (String nameOfSubject){
        this.nameOfSubject = nameOfSubject;
    }

    @Override
    public String toString() {
        return
                "nameOfSubject=" + nameOfSubject;
    }
}
