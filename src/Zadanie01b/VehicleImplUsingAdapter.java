package Zadanie01b;

public class VehicleImplUsingAdapter implements Vehicle
{
    private LegacyCar legacyCar;

    public VehicleImplUsingAdapter(LegacyCar legacyCar)
    {
        this.legacyCar = legacyCar;
    }

    @Override
    public void moveTo(int x2, int y2)
    {
        int x1 = x2 - legacyCar.getX();
        int y1 = y2 - legacyCar.getY();
        legacyCar.drive(x1,y1);
    }
}
