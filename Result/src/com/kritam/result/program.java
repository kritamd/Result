/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.kritam.result;
import java.util.Scanner;

/**
 *
 * @author lenovo
 */
public class program {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter your name:");
        String name=input.next();
        String grade="";
        System.out.println("Enter your symbol number");
        String symbol=input.next();
        
        System.out.println("Enter cmath mark:");
        double cmath=input.nextDouble();
        System.out.println("Enter opt math marks:");
        double optmath=input.nextDouble();
        System.out.println("Enter nepali marks:");
       double nep=input.nextDouble();
        System.out.println("Enter marks of english:");
        double eng=input.nextDouble();
        System.out.println("Enter marks of science:");
        double sci=input.nextDouble();
        double Percentage=0;
                
        
        if(cmath<32 || optmath<32|| nep<32 || eng<32 || sci<32){
            System.out.println("You are fail");
        }
        else{
           Percentage=(cmath + optmath + nep + eng + sci )/500*100;
           if(Percentage >80 ){
               
             grade="Distinction";
                     }
           else if(Percentage >= 60&& Percentage <80) {
               grade="First";}
               else if (Percentage >= 45 && Percentage <60){
                   grade="Second";
               
           }
               else if(Percentage >= 30 && Percentage <45){
                   grade="Third";
                           }    
            System.out.println("Your percentage is" + Percentage );
               System.out.println("Your grade is" + grade);
        }
        
        }
    }
    

