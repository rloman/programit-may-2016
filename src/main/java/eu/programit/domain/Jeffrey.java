package eu.programit.domain;

import java.util.ArrayList;
import java.util.List;

public class Jeffrey extends Person {
    @Override
    public String getFirstName() {
        return "Jeffrey";
    }

    @Override
    public List<String> getHobbies() {
        List<String> result = new ArrayList<>(2);
        result.add("programmeren");
        result.add("Boogschieten");
        return result;
    }
}
