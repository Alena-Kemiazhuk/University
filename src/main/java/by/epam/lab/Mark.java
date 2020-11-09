package by.epam.lab;
import lombok.*;

import java.util.ArrayList;

@Getter
@Setter

public class Mark {
    private Integer mark;


    public Mark ( Integer mark){
        this.mark = mark;
    }

    @Override
    public String toString() {
        return
                "mark=" + mark;
    }
}
