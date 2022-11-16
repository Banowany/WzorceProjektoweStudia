package Zadanie02b;

import Zadanie02b.SupplementaryPayments.*;
import Zadanie02b.Taxes.*;

public class Factory
{
    private String country;
    private String threshold;

    private Factory(String country, String threshold)
    {
        this.country = country;
        this.threshold = threshold;
    }

    public static Factory get()
    {
        //czytanie z pliku
        return new Factory("Poland", "High");
    }

    public Tax createTax()
    {
        switch (country)
        {
            case "Poland" ->
            {
               switch (threshold)
               {
                   case "Low" ->
                   {
                       return new PolandLowTax();
                   }
                   case "High" ->
                   {
                       return new PolandHighTax();
                   }
                   default -> throw new RuntimeException("I do not known given threshold");
               }
            }
            case "USA" ->
            {
                switch (threshold)
                {
                    case "Low" ->
                    {
                        return new USALowTax();
                    }
                    case "High" ->
                    {
                        return new USAHighTax();
                    }
                    default -> throw new RuntimeException("I do not known given threshold");
                }
            }
            case "Sweden" ->
            {
                switch (threshold)
                {
                    case "Low" ->
                    {
                        return new SwedenLowTax();
                    }
                    case "High" ->
                    {
                        return new SwedenHighTax();
                    }
                    default -> throw new RuntimeException("I do not known given threshold");
                }
            }
            default -> throw new RuntimeException("I do not known the given country");
        }
    }

    public SupplementaryPayment createSP()
    {
        switch (country)
        {
            case "Poland" ->
            {
                switch (threshold)
                {
                    case "Low" ->
                    {
                        return new PolandLowSP();
                    }
                    case "High" ->
                    {
                        return new PolandHighSP();
                    }
                    default -> throw new RuntimeException("I do not known given threshold");
                }
            }
            case "USA" ->
            {
                switch (threshold)
                {
                    case "Low" ->
                    {
                        return new USALowSP();
                    }
                    case "High" ->
                    {
                        return new USAHighSP();
                    }
                    default -> throw new RuntimeException("I do not known given threshold");
                }
            }
            case "Sweden" ->
            {
                switch (threshold)
                {
                    case "Low" ->
                    {
                        return new SwedenLowSP();
                    }
                    case "High" ->
                    {
                        return new SwedenHighSP();
                    }
                    default -> throw new RuntimeException("I do not known given threshold");
                }
            }
            default -> throw new RuntimeException("I do not known the given country");
        }
    }
}
