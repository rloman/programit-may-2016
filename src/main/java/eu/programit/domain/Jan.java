package eu.programit.domain;

import java.util.ArrayList;
import java.util.List;

public class Jan extends Person {
    @Override
    public String getFirstName() {
        return "Jan";
    }

    @Override
    public List<String> getHobbies() {
        List<String> result = new ArrayList<>(2);
        result.add("programmeren");
        result.add("Tafeltennis");
        return result;
    }
}
