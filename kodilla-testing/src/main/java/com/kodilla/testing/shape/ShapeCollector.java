package com.kodilla.testing.shape;

import java.util.ArrayList;

public class ShapeCollector {
    ArrayList<Shape> shapes = new ArrayList<>();

    public void addFigure(Shape shape){
        shapes.add(shape);
    }

    public void removeFigure(Shape shape){
        shapes.remove(shape);
    }

    public Shape  getFigure(int n){
        Shape retVal = null;
       if (n < shapes.size()){
            retVal = shapes.get(n);
        } else {
            System.out.println("This collection does not contain so many shapes");
        }
        return retVal;
    }

    public void showFigures(){
        for (int i = 0; i < shapes.size(); i++){
           System.out.println(shapes.get(i).toString());
        }
    }

    public int getSizeOfShapesCollection(){
        return shapes.size();
    }
}
