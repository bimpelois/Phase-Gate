import java.util.Scanner;
public class TaskFive{
public static void main(String[] args){
Scanner input = new Scanner(System.in);
System.out.println("Enter Temperature in celcius:");
int celcius = input.nextInt();
double fahrenheit= (celcius*9/5+32);

System.out.println("fahrenheit: " + fahrenheit);
}
}
