package prove04;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        String yourName = "Dana";
        List<String> teamMatesNames = new ArrayList<>();
        teamMatesNames.add("Darren");

        System.out.printf("Hello, my name is %s", yourName + "!\n");

        for (String name : teamMatesNames             ) {
            System.out.printf("Hello, " + yourName + " my name is %s!%n", name);
        }

    }
}
