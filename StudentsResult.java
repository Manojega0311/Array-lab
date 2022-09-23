//wrp to demo calculate total,average,result for students
//Manovadhana M CG BATCH 2576
import java.util.Scanner;
public class StudentsResult
{
public static void main(String[]args)
{
Scanner sc = new Scanner(System.in);
Scanner reader = new Scanner(System.in);
System.out.println("Enter the marks of five subjects::\n");
float maths = sc.nextFloat();
float science = sc.nextFloat();
float social = sc.nextFloat();
float tamil = sc.nextFloat();
float english = sc.nextFloat();

float total;
float average;
String Result;
int num;

total = maths + science + social + tamil + english;
average = (float)(total/5.0);
num = reader.nextInt();
if (num>=40)
{
System.out.println(	"pass!");
}
else
	System.out.println("Fail!");
System.out.println("\nThe total marks = " + total + "/5.0");
System.out.println("The average marks = " + average);

}
}

