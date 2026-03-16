import java.util.Scanner;
public class TaskSeven{
public static void main(String[] args){
Scanner input = new Scanner(System.in);
System.out.println("Enter radius of a circle: ");
double radius = input.nextDouble();
double cicumference = 3.14 * radius *radius;
System.out.println("cicumference of a circle is:" + cicumference);
} 
}
