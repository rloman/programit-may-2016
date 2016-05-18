package eu.programit.domain;

import java.util.ArrayList;
import java.util.List;

public class Marcel extends Person {
    @Override
    public String getFirstName() {
        return "Marcel";
    }

    @Override
    public List<String> getHobbies() {
        List<String> result = new ArrayList<>(2);
        result.add("boventoonzingen");
        result.add("programmeerpuzzels");
        return result;
    }
}
