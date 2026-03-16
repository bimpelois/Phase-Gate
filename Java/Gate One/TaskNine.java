import java.util.Scanner;
public class TaskNine{
public static void main(String[] args){
Scanner input = new Scanner(System.in);
System.out.println("Enter price of items: ");
double items = input.nextDouble();
double percentage= items * 10/100;
System.out.println("percentage of price of items:" + percentage);
} 
}
