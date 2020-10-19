
package javaprogramming;

import java.util.Scanner;

public class TemperatureConverter {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        double fahrenheit,celsius;
        System.out.print("Enter the value of temperture in Celsius : ");
        celsius = input.nextDouble();
        
         fahrenheit = 1.8 * celsius + 32;
         System.out.println("The value of temperture in Fahrenheit : " + fahrenheit);
         
         System.out.print("Enter the value of temperture in Fahrenheit : ");
         fahrenheit = input.nextDouble();
         celsius = celsius =(( 5 *(fahrenheit - 32.0)) / 9.0);
         System.out.println("The value of temperture in Celsius : " + celsius);
         
    }
    
}
