public class MilkyDonuts{

//    public static int countEvens(int[] numbers) {
//        int count = 0;
//
//        for (int index = 0; index < numbers.length; index++) {
//            if (numbers[index] % 2 == 0) {
//                count++;
//            }
//        }
//
//        return count;
//    }
//
//      public static void main(String[] args) {
//        int[] numbers = {2, 5, 8, 11, 14, 7};
//
//        int result = countEvens(numbers);
//        System.out.println("Number of even elements: " + result);
//    }
//}
//
//
//    public static int[] squares(int number){
//        int[] result = new int[number];
//
//        for (int value = 0; value < number; value++){
//            result[value] = (value + 1) * (value + 1);
//        }
//
//        return result;
//    }
//
//    public static void main(String[] args){
//        int[] output = squares(5);
//
//        for (int num : output) {
//            System.out.print(num + "\t");
//        }
//    }
//}
//


    public static int Search(int[] numbers, int target){

        for (int counter = 0; counter < numbers.length; counter++){
            if (numbers[counter] == target) {
                return counter; 

        return -1; 
    }

    public static void main(String[] args){
        int[] numbers = {4, 7, 9, 2, 5};

        int result = Search(numbers, 9);
        System.out.println("Index: " + result);
        }
    }
  }
}
