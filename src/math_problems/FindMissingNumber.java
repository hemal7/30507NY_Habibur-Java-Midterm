package math_problems;

public class FindMissingNumber {

    /** INSTRUCTIONS
     * Write a method to find the missing number from the array.
     */

    public static void main(String[] args) {
        int[] array = new int[] { 10, 2, 1, 4, 5, 3, 7, 8, 6,};

            System.out.println("Give Array : 10, 2, 1, 4, 5, 3, 7, 8, 6,  ");
            System.out.println("Missing Number is " + findMissingNumber(array));

        }
    public static int findMissingNumber(int[] arr){
            int length = arr.length;
            int n = ( (length + 1) * (length + 2) ) / 2;
            for(int i = 0; i < length; i++)
                n -= arr[i];

            return n;
        }

    }

