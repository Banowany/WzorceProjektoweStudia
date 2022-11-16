package Zadanie02a.Factories;

import Zadanie02a.Shapes.Shape;
import Zadanie02a.Shapes.Square;

public class SquareCreator extends ShapeCreator
{
    @Override
    public Shape factory()
    {
        return new Square();
    }
}
