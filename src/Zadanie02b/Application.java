package Zadanie02b;

import Zadanie02b.SupplementaryPayments.SupplementaryPayment;
import Zadanie02b.Taxes.Tax;

//dopytac na zajeciach
public class Application
{
    public static void main(String[] args)
    {
        Double baseAmount = Double.valueOf(100000);
        Factory fact = Factory.get();
        SupplementaryPayment sp = fact.createSP();
        Double amountToTax = sp.calculate(baseAmount);
        Tax tax = fact.createTax();
        tax.calculate(amountToTax);
    }
}
