package eu.programit.domain;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by udr013 on 18-5-2016.
 */
public class Mark extends Person{
    @Override
    public String getFirstName() {
        return "Mark";
    }

    @Override
    public List<String> getHobbies() {
        List<String> hobbies = new ArrayList<>();
        hobbies.add("Music");
        hobbies.add("Programming");
        hobbies.add("Belgium Beer");
        return hobbies;
    }
}
