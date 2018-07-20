package com.kodilla.patterns.factory.task;

public final class TaskFactory {
    public static final String SHOPPING = "SHOPPING";
    public static final String PAINTING = "PAINTING";
    public static final String DRIVING = "DRIVING";

    public final Task makeTask(final String taskClass) {
        switch (taskClass) {
            case SHOPPING:
                return new ShoppingTask("grocery shopping", "apples", 12);
            case PAINTING:
                return new PaintingTask("self-portrait", "black and white", "myself");
            case DRIVING:
                return new DrivingTask("holiday", "far away from home", "camper");
            default:
                return null;
        }
    }
}
