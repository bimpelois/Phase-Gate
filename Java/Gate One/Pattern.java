public class Pattern{
    public static void main(String[] args) {

//        for(int i = 1; i <= 5; i++){
//            for(int j = 1; j <= i; j++){
//                System.out.print("* ");
//            }
//            System.out.println();
//        }
//    }
//}

//for(int count=5; count>=1; count--){
//    for(int index=1; index<=count; index++){
//        System.out.print(" *");
//}
//        System.out.println();
//}
//}
//}



        int[] numbers = {3, 4, 5};

        for(int index = 0; index < numbers.length; index++){

            int factorial = 1;

            for(int count = 1; count <= numbers[index]; count++){
                factorial *=  count;
            }

            System.out.println("Factorial of " + numbers[index] + " = " + factorial);
        }
    }
}

//        int rows = 5;
//
//        for(int i = 1; i <= rows; i++){
//
//            for(int j = 1; j <= rows - i; j++){
//                System.out.print(" ");
//            }
//
//            for(int k = 1; k <= (2*i - 1); k++){
//                System.out.print("*");
//            }
//
//            System.out.println();
//        }
//    }
//}

//            int rows = 10;

//            for(int index = 1; index <= rows; index++){
//                for(int count = 1; count <= rows - index; count++){
//                    System.out.print(" ");
//                 }   
//            for(int counter = 1; counter <= (2*index-1);counter++){
//                System.out.print("*");
//            }

//            for(int index = 10; index >= 1; index--){
//                for(int count = 1; count <= rows-index; count++){
//                    System.out.print(" ");
//                 }   
//            for(int counter = 1; counter <= (2*index-1);counter++){
//                System.out.print("*");
//            }
//                System.out.println();
//
//}
//}
//}
