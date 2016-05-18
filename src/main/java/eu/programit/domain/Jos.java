package eu.programit.domain;

import java.util.ArrayList;
import java.util.List;

public class Jos extends Person {
    @Override
    public String getFirstName() {
        return "Jos";
    }

    @Override
    public List<String> getHobbies() {
        List<String> result = new ArrayList<>(2);
        result.add("Gitaar spelen");
        result.add("Sporten");
        return result;
    }
}

