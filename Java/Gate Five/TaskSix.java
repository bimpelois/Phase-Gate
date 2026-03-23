//Psuedo code
//
//A program that give ten question to user on simple artimetics.
//Initialise scores.
//Use loop statement to count questions.
//Use break to control attempt on each questionh question
//count correct attemp to sum total over ten.
//Time spent on each question recorded
//Measure total time spent in all

import java.util.Random;
import java.util.Scanner;
public class TaskSix{
public static void main(String[] args){
Random random = new Random(System.in);
int scores = 0;
int total = 0;
for(int count=1; count<=10; count++){
System.out.print("Enter from 1 to 10 questions: ");
int firstNumber = random.nextInt(10);
int secondNumber = random.nextInt(10);
for(int index=1; index<=10; index++){
    if (index==2){
         break;
    if (firstNumber+secondNumber=answer){
System.out.println(scores);
}
    else if(firstNumber/secondNumber=answer){
System.out.println(scores);
}
    else(firstNumber+secondNumber){
System.out.println(scores);
 }
System.out.println("number of correct attempt: " + total);
}
}   
}
