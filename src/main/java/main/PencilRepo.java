package main;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class PencilRepo {

    private List<String> listOfPens = new ArrayList<>();

    public List<String> getPencils(){
        listOfPens.add("crayon");
        listOfPens.add("blue pen");
        listOfPens.add("red pen");
        listOfPens.add("green pen");
        listOfPens.add("eraser");

        return listOfPens;
    }
}
