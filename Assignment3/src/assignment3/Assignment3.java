/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment3;

import java.util.Scanner;

/**
 *
 * @author Nic
 */
public class Assignment3
{
    public static void main(String args[])
    {
        String[] monthNames = {"January","February","March","April","May","June","July","August","September","October","November","December"};
        
        int[] daysLeap = {31, 28, 31, 30, 31, 30 ,31, 31, 30, 31, 30, 31};
        int[] daysNoLeap = {31, 29, 31, 30, 31, 30 ,31, 31, 30, 31, 30, 31};
    
        int month;
        int day;
        int year;
        int leap = 1580;
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter Month: "); 
        month = (input.nextInt());
        while(month < 0 || month > 12){
            System.out.println("Invalid Month value!");
            System.out.print("Enter Month: "); 
            month = input.nextInt();
        }
        
        System.out.print("Enter Day: ");
        day = (input.nextInt());
        while(day < 0 || day > daysNoLeap[month - 1]){
            System.out.println("Invalid Day value!");
            System.out.print("Enter Day: "); 
            day = input.nextInt();
        }
        
        System.out.print("Enter Year: ");
        year = (input.nextInt());
        while(year < leap){
            System.out.println("Invalid Year value!");
            System.out.print("Enter Year: "); 
            year = input.nextInt();
        }
        
        
        boolean isLeap = false;
        while(leap <= year){
            if(leap == year){
                isLeap = true;
                leap += 4;
            }else{
                leap += 4;
            }
        }
        
        System.out.println(monthNames[month - 1] + " " + day + ", " + year);
        System.out.println("Is leap year? " + (isLeap?"Yes":"No"));
    }
}