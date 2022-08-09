package com.anemchenko.hometask1.task3;

public class Circle extends Figure{
    private int r;

    public Circle(int center_x, int center_y, int r) {
        super(center_x, center_y);
        this.r = r;
    }

    @Override
    public void draw() {
        System.out.println("Circle is Drawn");
    }
}
