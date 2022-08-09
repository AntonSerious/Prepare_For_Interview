package com.anemchenko.hometask1.task3;

public class Triangle extends Figure {
    private int d_to_a;
    private int d_to_b;
    private int d_to_c;

    public Triangle(int x, int y, int d_to_a, int d_to_b, int d_to_c){
        super(x,y);
        this.d_to_a = d_to_a;
        this.d_to_b = d_to_b;
        this.d_to_c = d_to_c;
    }

    @Override
    public void draw() {
        System.out.println("Circle is drawn");
    }
}
