package Zadanie01b;

public class LegacyCar
{
    private int x;
    private int y;

    public LegacyCar(int x, int y)
    {
        this.x = x;
        this.y = y;
    }

    public void drive(int x1, int y1)
    {
        x+=x1;
        y+=y1;
    }

    public int getX()
    {
        return x;
    }

    public int getY()
    {
        return y;
    }
}
