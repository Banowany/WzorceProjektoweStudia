package Zadanie02a.Factories;

import Zadanie02a.Shapes.Rectangle;
import Zadanie02a.Shapes.Shape;

public class RectangleCreator extends ShapeCreator {
    @Override
    public Shape factory()
    {
        return new Rectangle();
    }
}
