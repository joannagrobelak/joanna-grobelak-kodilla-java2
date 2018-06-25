package com.kodilla.testing.shape;

import java.util.Objects;

public class Circle implements Shape {

    private double radius;
    private String shapeName;

    public Circle(double radius, String shapeName) {
        this.radius = radius;
        this.shapeName = shapeName;
    }

    public double getRadius() {
        return radius;
    }

    public String getShapeName() {
        return shapeName;
    }

    public double getField() {
        double field = Math.PI * radius * radius;
        return field;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Circle circle = (Circle) o;
        return Double.compare(circle.radius, radius) == 0 &&
                Objects.equals(shapeName, circle.shapeName);
    }

    @Override
    public int hashCode() {

        return Objects.hash(radius, shapeName);
    }
}
