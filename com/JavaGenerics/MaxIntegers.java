package com.JavaGenerics;
//import packages
import java.util.Scanner;
public class MaxIntegers 
//to find maximum of 3 integers
{
	
	public static Integer Max(Integer x,Integer y,Integer z) {
		int n1 = x.compareTo(y);
		int n2 = y.compareTo(z);
		int n3 = x.compareTo(z);
		if(n1==1&&n2==1)
			return x;
		else if(n1==-1&&n2==1)
			return y;
		else if(n1==-1&&n2==-1)
			return z;
		else if(n1==-1&&n3==-1)
			return z;
		else if(n1==1&&n3==-1)
			return z;
		else 
			return 0;
	}
    public static void main( String[] args )
    {
    	//take input from the user
    	Scanner sc = new Scanner(System.in);
        System.out.println("Enter 3 integers to find maximum");
        System.out.println("Enter first integer");
        Integer x = Integer.parseInt(sc.nextLine());
        System.out.println("Enter second integer");
        Integer y = Integer.parseInt(sc.nextLine());
        System.out.println("Enter third integer");
        Integer z = Integer.parseInt(sc.nextLine());
        System.out.println(Max(x,y,z));
        sc.close();
    }
}