package ua.lviv.lgs;
import java.util.Scanner;

public class Circle {
   public double radius;
   public double diameter;
	   
	   public static void main(String[] args) {
		   Scanner in = new Scanner(System.in);
		   
		   System.out.println("¬вед≥ть д≥аметр кола:");
		   double diameter=in.nextDouble();
		   
		   double area=(Math.PI*Math.pow(diameter, 2)/4);
		   System.out.println("Area circle = "+area);
			  
	       System.out.println("¬вед≥ть рад≥ус кола (д≥аметр/2) : ");		   
		   double radius=in.nextDouble();
	       double length=Math.round(Math.PI*2*radius);
		   System.out.println("Length  circle = "+ length);
	   }
}