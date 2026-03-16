import java.util.Scanner;
public class TaskEleven{
public static void main(String[] args){
Scanner input = new Scanner(System.in);
System.out.println("Enter numbers: ");
int numbers=input.nextInt();
if(numbers%2==0){
System.out.println("Even number");
}
else{
System.out.println("odd number");
}
}
}
