
package javaprogramming;

import java.util.Scanner;


public class ArithmeticOperator {
public static void main(String[] args){
    int num1,num2,result;
Scanner input = new Scanner(System.in);

System.out.print("Enter the first number : ");
num1 = input.nextInt();
System.out.print("Enter the second number : ");
num2 = input.nextInt();

result = num1 + num2;

System.out.println("Addition is "+result);
result = num1 - num2;
System.out.println("Substraction is "+result);
result = num1 / num2;
System.out.println("Division is "+result);
result = num1 * num2;
System.out.println("multipliplication is "+result);
result = num1 % num2;
System.out.println("Remainder is "+result);


    
}
}
