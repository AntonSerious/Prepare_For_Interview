package com.anemchenko.hometask1.task3;

public class Square extends Figure {
    private int d_to_corner;

    public Square(int x, int y, int d_to_corner){
        super(x,y);
        this.d_to_corner = d_to_corner;
    }

    @Override
    public void draw() {
        System.out.println("Square is drawn");
    }
}
