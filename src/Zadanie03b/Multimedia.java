package Zadanie03b;

public abstract class Multimedia
{
    protected String name;
    protected String type;

    public Multimedia(String name, String type)
    {
        this.name = name;
        this.type = type;
    }

    public Multimedia(Multimedia multimedia)
    {
        this.name = multimedia.name;
        this.type = multimedia.type;
    }

    public abstract Multimedia clone();

    public abstract String toString();
}
