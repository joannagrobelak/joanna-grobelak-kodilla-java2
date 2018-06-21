package com.kodilla.testing.shape;

import java.util.ArrayList;

public class ShapeCollector {

    private ArrayList<Shape> figures = new ArrayList<>();

    public void addFigure(Shape shape) {
        figures.add(shape);
    }

    public boolean removeFigure(Shape shape) {

        boolean result = false;
        if(figures.contains(shape)) {
            figures.remove(shape);
            result = true;
        }
        return result;
    }

    public Shape getFigure(int figureNumber) {
        Shape shape = null;
        if(figureNumber >= 0 && figureNumber < figures.size()) {
            shape = figures.get(figureNumber);
        }
        return shape;
    }

    public ArrayList<Shape> showFigures() {

        for(int i = 0; i < figures.size(); i++) {
            System.out.println("Area of the figure " + figures.get(i).getShapeName() + " is equal to " + figures.get(i).getField() + " cm2.");
        }

        return figures;
    }

    public int getFiguresQuantity() {

        return figures.size();
    }
}
