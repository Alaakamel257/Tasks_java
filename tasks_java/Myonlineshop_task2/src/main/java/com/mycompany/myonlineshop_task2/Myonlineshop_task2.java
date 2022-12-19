/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.myonlineshop_task2;

import java.util.Scanner;

/**
 *
 * @author Solom
 */
public class Myonlineshop_task2 {

    public static void main(String[] args) {
         Scanner input=new Scanner(System.in);
        System.out.print("please enter number of books : ");
        int size=input.nextInt();
        product [] arr=new cartoonbook[size];
      
       
       double price;
       double total=0;
       for(int i=0; i<size;i++)
       { System.out.print("enter price of the book "  +(i+1)+  ": ");
         price=input.nextDouble();
         arr[i]=new cartoonbook();
         arr[i].price(price);
         total =total + arr[i].price(price);
         
       }
        System.out.print("total prices of the books :"+total);
    }
    }

