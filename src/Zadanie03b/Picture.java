package Zadanie03b;

public class Picture extends Multimedia {
    public Picture(String name) {
        super(name, "Picture");
    }

    public Picture(Multimedia multimedia) {
        super(multimedia);
    }

    @Override
    public Multimedia clone()
    {
        return new Picture(this);
    }

    @Override
    public String toString() {
        return String.format("");
    }
}
