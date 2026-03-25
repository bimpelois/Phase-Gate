public class GuessGame{

    public static void generateNumber(){
        Random random = randon.nextInt();
        int number = random.nextInt(1,101);
        return number;
        }
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

    static void usersInput(){
       int usersInput = input.nextInt();

        if(userInput!=number){
        System.out.print("invalid input. Enter a number.");
        return invalid;
        }

        if(guess < 1 || guess > 100){
            System.out.print("Guess Number ranges from 1 to 100");
           
        }
        return guess;
    }       
        
    static void checkGuess(int serectNumber, int guess);
        if(guess == secretNumber){
            return correct;
        }
        else if(guess < secretNumber){
            System.out.print("Attempt is higher than number");
        return wrong;
        }
        else{
        System.out.print("Attempt is lower than number");
        return wrong;
        }
    }

    static void nowRating(int attempt, int wonWon){
        if(wonWon == false){
            return better luck
}

        if(attempts == 1){
            return Legendary;
}
        else if(attempts == 2){
            return Excellent;
}
        else if(attempts ==3 || attempts ==4){
            return Good;            
}
 
        else{
            return close;
}

}


