package Zadanie03b;

import java.util.ArrayList;
import java.util.List;

public class Main
{
    public static void main(String[] args)
    {
        List<Multimedia> multimedia = new ArrayList<>();
        multimedia.add(new Picture("picture1"));
        multimedia.add(new Music("picture1"));
        multimedia.add(new Movie("picture1"));

        System.out.println("Originals");
        for (Multimedia m : multimedia)
        {
            System.out.println(m);
        }

        List<Multimedia> multimediaCopies = new ArrayList<>();
        for(Multimedia m : multimedia)
        {
            multimediaCopies.add(m.clone());
        }

        System.out.println("Copies");
        for (Multimedia m : multimediaCopies)
        {
            System.out.println(m);
        }
    }
}
