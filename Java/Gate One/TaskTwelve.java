import java.util.Scanner;
public class TaskTwelve{
public static void main(String[] args){
Scanner input = new Scanner(System.in);
System.out.println("Enter numbers: ");
int numbers=input.nextInt();
if(numbers<0){
System.out.println("negative");
}
else{
System.out.println("positive");
}
}
}
