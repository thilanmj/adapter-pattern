package com.codexmo.adapter.model;

public class SquirePeg {

    private double width;

    public SquirePeg(double width) {
        this.width = width;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getSquire() {
        double result;
        result = Math.pow(this.width, 2);
        return result;
    }

}
