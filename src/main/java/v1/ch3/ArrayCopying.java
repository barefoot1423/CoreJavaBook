package v1.ch3;

import java.util.Arrays;

public class ArrayCopying {

    public static void main(String[] args) {

        int[] smallPrimes = {2, 3, 5, 7, 11, 13};
//        int[] luckyNumbers = smallPrimes;

//        luckyNumbers[5] = 12;

//        System.out.println(Arrays.toString(smallPrimes));

        // if you want to copy all values of one array into a new array, you use the copyOf method in the Arrays class

        int[] copiedluckyNumbers = Arrays.copyOf(smallPrimes, smallPrimes.length);
        smallPrimes[5] = 12;
        System.out.println(Arrays.toString(copiedluckyNumbers));
    }

}
