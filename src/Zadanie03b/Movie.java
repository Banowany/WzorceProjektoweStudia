package Zadanie03b;

public class Movie extends Multimedia {
    public Movie(String name) {
        super(name, "Movie");
    }

    public Movie(Multimedia multimedia) {
        super(multimedia);
    }

    @Override
    public Multimedia clone()
    {
        return new Movie(this);
    }

    @Override
    public String toString() {
        return name + "-" + type;
    }
}
