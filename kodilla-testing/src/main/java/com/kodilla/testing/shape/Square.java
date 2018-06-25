package com.kodilla.testing.shape;

import java.util.Objects;

public class Square implements Shape {

    private double side;
    private String shapeName;

    public Square(double side, String shapeName) {
        this.side = side;
        this.shapeName = shapeName;
    }

    public double getSide() {
        return side;
    }

    public String getShapeName() {
        return shapeName;
    }

    public double getField() {
        double field = side * side;
        return field;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Square square = (Square) o;
        return Double.compare(square.side, side) == 0 &&
                Objects.equals(shapeName, square.shapeName);
    }

    @Override
    public int hashCode() {

        return Objects.hash(side, shapeName);
    }
}
