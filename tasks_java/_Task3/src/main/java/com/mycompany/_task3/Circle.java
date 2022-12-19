/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany._task3;

public class Circle {
    public class circle {
    double radius;
    String color;

    public circle() {
    }
    
  
    public circle(double radius) {
        this.radius = radius;
    }

    public circle(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    
    public double getArea (double radius)
    {return 3.14*radius*radius;}

    @Override
    public String toString() {
        return "circle{" + "radius=" + radius + ", color=" + color + '}';
    }
}
}
    

