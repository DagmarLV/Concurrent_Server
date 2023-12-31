package org.example;

public class Point {
    private float x;
    private float y;
    public Point(float x, float y){
        this.x = x;
        this.y = y;
    }
    public float getX(){return x;}
    public float getY(){return y;}

    public void update(float x, float y){
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString(){
        return "(" + x + "," + y + ")";
    }
}
