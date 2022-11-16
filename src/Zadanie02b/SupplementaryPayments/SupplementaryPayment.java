package Zadanie02b.SupplementaryPayments;

public abstract class SupplementaryPayment
{
    private int chargeLevel;

    public SupplementaryPayment(int chargeLevel) {
        this.chargeLevel = chargeLevel;
    }

    public Double calculate(double base)
    {

        System.out.println("Podstawa naliczenia składki: " + base);
        System.out.println("Procent składki: " + chargeLevel + "%");
        Double contributionValue = (base*chargeLevel)/100;
        System.out.println("Wartosc skladki :" + contributionValue);
        return contributionValue;
    }
}
