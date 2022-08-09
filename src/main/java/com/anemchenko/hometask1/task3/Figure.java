package com.anemchenko.hometask1.task3;

public abstract class Figure implements Drawable{
    private int center_x;
    private int center_y;

    public Figure(int center_x, int center_y){
        this.center_x = center_x;
        this.center_y = center_y;
    }
}
