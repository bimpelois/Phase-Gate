import java.util.Scanner;
public class TaskFour{
public static void main(String[] args){
Scanner input=new Scanner(System.in);
int product=0;
System.out.println("Enter numbers");
int firstNumber=input.nextInt();
int secondNumber=input.nextInt();
 product=firstNumber*secondNumber;
System.out.println("product: " + product);
}
}
