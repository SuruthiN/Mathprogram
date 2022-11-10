package myproj;

import java.util.Scanner;

public class operatorstask {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int x,y,z;
        System.out.print("Enter first number:");
         x = sc.nextInt();
        System.out.print("Enter second number:");
         y = sc.nextInt();
        System.out.println("Enter third number:");
         z= sc.nextInt();
         float m;
        System.out.println("Enter the float number:");
         m=sc.nextFloat();
         Double n;
        System.out.println("Enter the double number:");
         n=sc.nextDouble();
        
         
        System.out.println("Addition of x+y = " + (x+y));
        System.out.println("Subtraction  of x-y = " + (x-y));
        System.out.println("Multiplication of x*y = " + (x*y));
        System.out.println("Division of  x/y = " + (x/y));
        System.out.println("Modulo of x%y = " + (x%y));
        System.out.println("Operator precedence x*y/z="+(x*y/z));
        System.out.println("Integer math x/y=" +(x/y));
        System.out.println("Floating point math x/y=" +(x/y));
        System.out.println("Floating point precision  ");
        System.out.println("Using Math.abs="+Math.abs(x));
        System.out.println("Using Math.ceil="+Math.ceil(m));
        System.out.println("Using Math.floor="+Math.floor(m));
        System.out.println("Using Math.min="+Math.min(x, y));
        System.out.println("Using Math.max="+Math.max(x,y));
        System.out.println("Using Math.round="+Math.round(m));
        System.out.println("Using Math.random="+Math.random());
        System.out.println("Using Math.exp="+Math.exp(n));
        System.out.println("Using Math.log="+Math.log(n));
        System.out.println("Using Math.log10="+Math.log10(n));
        System.out.println("Using Math.pow="+Math.pow(x,y));
        System.out.println("Using Math.sqrt="+Math.sqrt(y));
    
        Double A,B;
        System.out.println("Enter the double value");
        A=sc.nextDouble();
        B=sc.nextDouble();
        System.out.println("Value of PI="+Math.PI);
		System.out.println("Using Math.sin="+Math.sin(Math.PI));
        System.out.println("Using Math.cos="+Math.cos(Math.PI));
        System.out.println("Using Math.tan="+Math.tan(Math.PI));
        System.out.println("Using Math.asin="+Math.asin(Math.PI));
        System.out.println("Using Math.acos="+Math.acos(Math.PI));
        System.out.println("Using Math.atan="+Math.atan(Math.PI));
        System.out.println("Using Math.atan2="+Math.atan2(A,B));
        System.out.println("Using Math.sinh="+Math.sinh(Math.PI));
        System.out.println("Using Math.cosh="+Math.cosh(Math.PI));
        System.out.println("Using Math.tanh="+Math.tanh(Math.PI));
        System.out.println("Degrees value="+Math.toDegrees(Math.PI));
        System.out.println("Radian value="+Math.toRadians(Math.PI));
        
        
        
        
	    }

}
