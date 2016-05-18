package eu.programit.domain;

import java.util.ArrayList;
import java.util.List;

public class Mervyn extends Person {
    @Override
    public String getFirstName() {
        return "Mervyn";
    }

    @Override
    public List<String> getHobbies() {
        List<String> result = new ArrayList<>(2);
        result.add("Voetbal");
        result.add("Gitaar pingelen");
        return result;
    }
}
