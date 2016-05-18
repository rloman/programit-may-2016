package eu.programit.domain;

import java.util.ArrayList;
import java.util.List;

public class Constant extends Person {
    @Override
    public String getFirstName() {
        return "Constant";
    }

    @Override
    public List<String> getHobbies() {
        List<String> result = new ArrayList<>(2);
        result.add("Fitness");
        result.add("Hardlopen");
        return result;
    }
}
