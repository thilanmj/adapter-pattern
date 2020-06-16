package com.codexmo.adapter.model;

public class SquarePegAdapter extends RoundPeg {

    private SquirePeg peg;

    public SquarePegAdapter(double radius, SquirePeg peg) {
        super(radius);
        this.peg = peg;
    }

    @Override
    public double getRadius() {
        return super.getRadius();
    }

    @Override
    public void setRadius(double radius) {
        super.setRadius(radius);
    }

}
