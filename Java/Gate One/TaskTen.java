import java.util.Scanner;
public class TaskTen{
public static void main(String[] args){
Scanner input = new Scanner(System.in);
System.out.println("Enter numbers: ");
int firstNumber = input.nextInt();
int secondNumber = input.nextInt();
int thirdNumber = input.nextInt();
int total = firstNumber+secondNumber+thirdNumber;
double average = total/3;
System.out.println("Average of numbers: " + average);
}
}
