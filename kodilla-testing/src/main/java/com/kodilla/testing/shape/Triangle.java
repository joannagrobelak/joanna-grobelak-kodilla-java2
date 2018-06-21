package com.kodilla.testing.shape;

import java.util.Objects;

public class Triangle implements Shape {

    private double side;
    private double height;
    private String shapeName;

    public Triangle(double side, double height, String shapeName) {
        this.side = side;
        this.height = height;
        this.shapeName = shapeName;
    }

    public double getSide() {
        return side;
    }

    public double getHeight() {
        return height;
    }

    public String getShapeName() {
        return shapeName;
    }

    public double getField() {
        double field = side * height / 2;
        return field;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Triangle triangle = (Triangle) o;
        return Double.compare(triangle.side, side) == 0 &&
                Double.compare(triangle.height, height) == 0 &&
                Objects.equals(shapeName, triangle.shapeName);
    }

    @Override
    public int hashCode() {

        return Objects.hash(side, height, shapeName);
    }
}
