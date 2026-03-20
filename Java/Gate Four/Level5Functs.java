//import java.util.Arrays;
//import java.util.Collections;
//
//public class Level5Functs{
//
//    public static boolean isPrime(int num) {
//        if (num <= 1) return false;
//
//        for (int i = 2; i <= Math.sqrt(num); i++) {
//            if (num % i == 0) return false;
//        }
//        return true;
//    }
//
//    public static Integer[] getSortedPrimes(int[] arr) {
//
//       
//        int count = 0;
//        for (int num : arr) {
//            if (isPrime(num)) count++;
//        }
//
//        Integer[] primes = new Integer[count];
//        int index = 0;
//
//       
//        for (int num : arr) {
//            if (isPrime(num)) {
//                primes[index++] = num;
//            }
//        }
//
//        
//        Arrays.sort(primes, Collections.reverseOrder());
//
//        return primes;
//    }
//
//    public static void main(String[] args) {
//        int[] numbers = {5, 9, 3, 6, 2};
//
//        Integer[] result = getSortedPrimes(numbers);
//
//        System.out.println(Arrays.toString(result)); 
//    }
//}
//


    public static int[] replaceWithZeros(int[] arr) {

        for (int count = 0; count < array.length; count++) {
            if (array[count] < 0) {
                array[count] = 0;
            }
        }

        return array;
    }

    public static void main(String[] args) {
        int[] numbers = {5, -9, 3, -6, 2, -1};

        int[] result = replaceWithZeros(numbers);

        System.out.println(Arrays.toString(result)); 
    }
}




    public static int[] ZerosAtEnd(int[] array) {

        int index = 0;
        
        for (int counter = 0; counter< arr.length; counter++) {
            if (array[counter] != 0) {
                array[index] = array[count];
                index++;
            }
        }
    
        while (index < array.length) {
            array[index] = 0;
            index++;
        }

        return array;
    }

    public static void main(String[] args) {
        int[] numbers = {5, 0, 3, 0, 2, 0};

        int[] result = ZerosAtSEnd(numbers);

        System.out.println(Arrays.toString(result));
    }
}


 public static List<List<Integer>> splitArray(int[] array) {

        List<Integer> odd = new ArrayList<>();
        List<Integer> even = new ArrayList<>();

        for (int num : array) {
            if (num % 2 == 0) {
                even.add(num);
            } else {
                odd.add(num);
            }
        }

        List<List<Integer>> result = new ArrayList<>();
        result.add(odd);
        result.add(even);

        return result;
    }

    public static void main(String[] args) {
        int[] numbers = {45, 60, 3, 10, 9, 22};

        List<List<Integer>> result = splitArray(numbers);

        System.out.println(result); 
    }
}




    public static boolean isItPalindrome(int[] array) {

        int start = 0;
        int end = array.length - 1;

        while (start < end) {
            if (array[start] != array[end]) {
                return false;
            }
            start++;
            end--;
        }

        return true;
    }

    public static void main(String[] args) {
        int[] numbers = {45, 0, 8, 0, 45};

        boolean result = isItPalindrome(numbers);

        System.out.println(result);
    }
}
