import java.util.Scanner;
/*
Create a program where user inputs two numbers and perform 4 basic arithmetic operation using 4 methods
with return type and print the results
*/
public class Task7 {

public static int add (int a, int b){
  return a + b;
}

public static int subtract (int a, int b){
  return a-b;
}

public static int multiply(int a, int b){
  return a*b;
}

public static int divide(int a, int b){
  return a/b;
}

public static void main (String [] args){

Scanner sc = new Scanner (System.in);

System.out.print("Enter first number : ");
int num1 = sc.nextInt();

System.out.print("Enter second number : ");
int num2 = sc.nextInt();

System.out.println( num1 + " + " + num2 + " = " + add(num1,num2));
System.out.println( num1 + " - " + num2 + " = " + subtract(num1,num2));
System.out.println( num1 + " * " + num2 + " = " + multiply(num1,num2));
if (num2==0) {
  System.out.println(num1 + "/" + num2 +  "= Cannot divide by zero");}
else{
  System.out.println( num1 + " / " + num2 + " = " + divide(num1,num2));}

sc.close();

  }
}
