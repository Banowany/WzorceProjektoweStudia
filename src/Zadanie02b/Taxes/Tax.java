package Zadanie02b.Taxes;

public abstract class Tax
{
    private int chargeLevel;

    public Tax(int chargeLevel)
    {
        this.chargeLevel = chargeLevel;
    }

    public Double calculate(double base)
    {
        System.out.println("Podstawa naliczenia podatku: " + base);
        System.out.println("Procent podatku: " + chargeLevel + "%");
        Double taxValue = (base*chargeLevel)/100;
        System.out.println("Kwota podatku :" + taxValue);
        return taxValue;
    }
}
