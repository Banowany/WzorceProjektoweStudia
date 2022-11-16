package Zadanie02a;

import Zadanie02a.Factories.RectangleCreator;
import Zadanie02a.Factories.ShapeCreator;
import Zadanie02a.Factories.SquareCreator;
import Zadanie02a.Factories.TriangleCreator;

public class Main
{
    public static void main(String[] args)
    {
        ShapeCreator squareCreator = new SquareCreator();
        ShapeCreator rectangleCreator = new RectangleCreator();
        ShapeCreator triangleCreator = new TriangleCreator();

        squareCreator.factory().draw();
        System.out.println();
        rectangleCreator.factory().draw();
        System.out.println();
        triangleCreator.factory().draw();
    }
}
