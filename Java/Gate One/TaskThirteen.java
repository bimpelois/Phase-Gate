import java.util.Scanner;
public class TaskThirteen{
public static void main(String[] args){
Scanner input = new Scanner(System.in);
System.out.println("Enter student scores: ");
int scores=input.nextInt();
if(scores >= 50){
System.out.println("pass");
}
else{
System.out.println("fail");
}
}
}
