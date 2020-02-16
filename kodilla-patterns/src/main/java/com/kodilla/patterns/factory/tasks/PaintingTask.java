package com.kodilla.patterns.factory.tasks;

import static java.lang.Math.random;

public final class PaintingTask implements Task {
    final String taskName;
    final String color;
    final String whatToPaint;

    public PaintingTask(String taskNameDD, String color, String whatToPaint) {
        this.taskName = taskNameDD;
        this.color = color;
        this.whatToPaint = whatToPaint;
    }

    @Override
    public String executeTask() {
        return "Painting " + whatToPaint;
    }

    @Override
    public String getTaskName() {
        return taskName;
    }

    @Override
    public boolean isTaskExecuted() {
        double rand = Math.random() * 2;
        return true && rand > 1;
    }
}
