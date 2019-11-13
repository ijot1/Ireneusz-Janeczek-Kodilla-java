package com.kodilla.testing.shape;

import java.util.ArrayList;
import java.util.Comparator;

import static java.lang.Math.sqrt;

public class Triangle implements Shape{
    private double sideA;
    private double sideB;
    private double sideC;

    public Triangle(double sideA, double sideB, double sideC) {
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
    }

    @Override
    public String getShapeName() {
        return "triangle";
    }

    @Override
    public double getField() {
        double retVal = -1.0;
        ArrayList<Double> triangleSides = new ArrayList<Double>();
        triangleSides.add(sideA);
        triangleSides.add(sideB);
        triangleSides.add(sideC);
        triangleSides.sort(Comparator.naturalOrder());
        if(triangleSides.get(0) + triangleSides.get(1) < triangleSides.get(2)){
            System.out.println("Such sides do not create any triangle\n");
        } else {
            double hlfCircumference = (sideA + sideB + sideC)/2;
            retVal = sqrt(hlfCircumference * (hlfCircumference - sideA) * (hlfCircumference - sideB) * (hlfCircumference - sideC));
        }
        return retVal;
    }
}
