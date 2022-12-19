/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany._task3;

import java.util.Scanner;

/**
 *
 * @author Solom
 */
public class _Task3 {

    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
      double r,h;
      String color;        
      Circle ci = new Circle();
      Cylinder cy ;
        System.out.print("enter radius of the circle : ");
        r=input.nextDouble();
        ci.setRadius(r);
        System.out.println("area of the circle = " + ci.getArea(r));
        System.out.print("enter color of the circle : ");
        color=input.next();
        ci.SetColor(color);
        
        System.out.print("enter hieght of the cylinder : ");
        h=input.nextDouble();
        cy= new Cylinder(h,r);
        System.out.println("volume of the cylinder = " + cy.getVolume(h));
        
        System.out.println("******************");
        System.out.println("circle : ");
        System.out.println( ci.toString());
        System.out.println("******************");
        System.out.println("cylinder : ");
        System.out.println(cy.toString());
        
        
    }
    }

