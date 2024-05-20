/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vu.mavenproject1;

/**
 *
 * @author ISAAC
 */
public class VU {  // new java class called VU
    
    // define new method called calculatePay that takes two parameters basePay and hoursWorked
    public static void calculatepay(int basePay, int hoursWorked) { 
        
        
        /*
        if the basePay is less than the minimum wage 
        of UGX 40,000 per hour and if it is, the method prints an error message and returns immediately.
        */
        
        if (basePay < 40000) {
            System.out.println("Error: Base pay cannot be less than UGX 40,000 an hour.");
            return;
        }
        
        
        // if the hoursWorked is more than 60 hours per week and if it is, the method prints an error message
        if (hoursWorked > 60) {
            System.out.println("Error: Hours worked cannot be more than 60 hours a week.");
            return;
        }

        int totalPay = 0; 
        // created new variable called totalPay and set it to 0 why 
        //because we want to start with a known state before calculating the total pay which will be
        //will be used to calculate the total pay for the employee.
        
        
        /*
        checks if the hoursWorked is less than or equal to 40 hours per week. 
        If it is,then this calculates the total pay by multiplying the hoursWorked by the basePay.
        */
       
        if (hoursWorked <= 40) {
            totalPay = hoursWorked * basePay;
        } 
        
        
       
        
        else {
            totalPay = 40 * basePay + (hoursWorked - 40) * basePay * 2;
        }
         /*
        If the hoursWorked is more than 40 hours per week, then
        method calculates the total pay by first calculating the pay for the first 40
        hours at the basePay
        
        Then, it calculates the pay for the remaining hours (hoursWorked - 40) 
        at the overtime rate of basePay * 1.5.
        
        Since i used an integer instead of double which handles decimal numbers,
        i can can simply calculate it by multiplying the basePay by 2 instead of 1.5 
        like intructed int hint above */
         
         
        System.out.println("Total pay: UGX " + totalPay); //prints the total pay for the employee 
    }

    public static void main(String[] args) { 
        //which basically serves as the entry point which is going to handle.
        
        calculatepay(48000, 35); //This calls the calculatePay method with the base pay of UGX 28,000 per hour and 35 hours worked.
        calculatepay(35000, 45);
        calculatepay(38000, 75);
    }
}
