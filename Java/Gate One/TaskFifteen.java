import java.util.Scanner;
public class TaskFifteen{
public static void main(String[] args){
Scanner input = new Scanner(System.in);
System.out.println("Enter numbers: ");
int firstNumber=input.nextInt();
int secondNumber=input.nextInt();
if(firstNumber >= secondNumber){
System.out.println("The largest is: " + firstNumber);
}
else if(secondNumber<=firstNumber){
System.out.println("The second largest is: " + secondNumber);
}
else{
System.out.println("invalid");
}
}
}
