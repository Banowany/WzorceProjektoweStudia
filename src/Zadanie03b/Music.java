package Zadanie03b;

public class Music extends Multimedia {
    public Music(String name) {
        super(name, "Music");
    }

    public Music(Multimedia multimedia) {
        super(multimedia);
    }

    @Override
    public Multimedia clone()
    {
        return new Music(this);
    }

    @Override
    public String toString() {
        return name + "-" + type;
    }
}
