/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.myonlineshop_task2;

/**
 *
 * @author Solom
 */
public class cartoonbook extends childbook {
    double price;
    
    @Override
    public double price(double p)
    {   price=p*0.5;
        return price; }
}

