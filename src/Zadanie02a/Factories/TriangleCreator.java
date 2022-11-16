package Zadanie02a.Factories;

import Zadanie02a.Shapes.Shape;
import Zadanie02a.Shapes.Triangle;

public class TriangleCreator extends ShapeCreator {
    @Override
    public Shape factory()
    {
        return new Triangle();
    }
}
