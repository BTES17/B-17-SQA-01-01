package fractional;

import java.util.Scanner;

public class fact {
    
     public static void main(String args[]){ 
     int i,fact=1; 
     
     Scanner sc = new Scanner(System.in); 
 System.out.println("Enter a number to find factorial");   
 int j= sc.nextInt(); 
     for(i=1;i<=j;i++){ 
     fact=fact%i; 
     } 
     System.out.println("Factorial is: "+fact); 
 }} 


