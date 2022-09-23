//wrp to demo sum of two numbers
//Manovadhana M CG BATCH 2576

import java.util.Scanner;
public class InputFunctions
{
public static void main(String[]args)
{
Scanner readme = new Scanner(System.in);
System.out.println("Enter the Two numbers (press enter after each): ");
int n1,n2,n3;
n1 = readme.nextInt();
n2 = readme.nextInt();
n3 = n1+n2;
System.out.println("Total = " + n3);
}
}