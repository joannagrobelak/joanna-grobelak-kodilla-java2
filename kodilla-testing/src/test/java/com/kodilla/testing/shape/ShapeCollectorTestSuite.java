package com.kodilla.testing.shape;

import org.junit.*;

import java.util.ArrayList;

public class ShapeCollectorTestSuite {

    private static int testCounter = 0;

    @BeforeClass
    public static void beforeAllTests() {
        System.out.println("This is the beginning of tests.");
    }

    @AfterClass
    public static void afterAllTests() {
        System.out.println("Tests finished.");
    }

    @Before
    public void beforeEveryTest() {
        testCounter++;
        System.out.println("test #" + testCounter + " in progress...");
    }

    @Test
    public void testAddFigure() {

        //given
        ShapeCollector shapeCollector = new ShapeCollector();
        Square square = new Square(20.0, "Square");
        Triangle triangle = new Triangle(20.0, 10.0, "Triangle");
        Circle circle = new Circle(30.0, "Circle");

        //when
        shapeCollector.addFigure(square);
        shapeCollector.addFigure(triangle);
        shapeCollector.addFigure(circle);

        //then
        Assert.assertEquals(3, shapeCollector.getFiguresQuantity());
    }

    @Test
    public void testRemoveFigure() {

        //given
        ShapeCollector shapeCollector = new ShapeCollector();
        Square square = new Square(20.0, "Square");
        Triangle triangle = new Triangle(20.0, 10.0, "Triangle");
        Circle circle = new Circle(30.0, "Circle");
        shapeCollector.addFigure(square);
        shapeCollector.addFigure(triangle);
        shapeCollector.addFigure(circle);

        //when
        boolean result = shapeCollector.removeFigure(triangle);

        //then
        Assert.assertTrue(result);
        Assert.assertEquals(2, shapeCollector.getFiguresQuantity());
    }

    @Test
    public void testGetFigure() {

        //given
        ShapeCollector shapeCollector = new ShapeCollector();
        Square square = new Square(20.0, "Square");
        Triangle triangle = new Triangle(20.0, 10.0, "Triangle");
        Circle circle = new Circle(30.0, "Circle");
        shapeCollector.addFigure(square);
        shapeCollector.addFigure(triangle);
        shapeCollector.addFigure(circle);

        //when
        Shape retrievedFigure = shapeCollector.getFigure(2);

        //then
        Assert.assertEquals(circle, retrievedFigure);
    }

    @Test
    public void testShowFigures() {

        //given
        ShapeCollector shapeCollector = new ShapeCollector();
        Square square = new Square(20.0, "Square");
        Triangle triangle = new Triangle(20.0, 10.0, "Triangle");
        Circle circle = new Circle(30.0, "Circle");
        shapeCollector.addFigure(square);
        shapeCollector.addFigure(triangle);
        shapeCollector.addFigure(circle);

        //when
        ArrayList<Shape> testArrayList = shapeCollector.showFigures();

        //then
        Assert.assertEquals(testArrayList.get(0), square);
        Assert.assertEquals(testArrayList.get(1), triangle);
        Assert.assertEquals(testArrayList.get(2), circle);

    }
}
