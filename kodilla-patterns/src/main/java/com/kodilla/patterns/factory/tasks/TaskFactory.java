package com.kodilla.patterns.factory.tasks;

public final class TaskFactory {
    public static final String SHOPPING = "SHOPPING";
    public static final String PAINTING = "PAINTING";
    public static final String DRIVING = "DRIVING";

    public final Task makeTaskActivity(final String taskClass) {
        switch (taskClass) {
            case SHOPPING:
                return new ShoppingTask("Spring shopping", "jeans", 1);
            case PAINTING:
                return new PaintingTask("After party renovation", "walls & ceilling", "white");
            case DRIVING:
                return new DrivingTask("Summer journey", "polar circle", "motorcycle");
            default:
                return null;
        }
    }
}
