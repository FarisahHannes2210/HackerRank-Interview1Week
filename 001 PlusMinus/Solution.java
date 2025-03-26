// Given an array of integers, calculate the ratios of its elements that are 
// positive, negative, and zero. Print the decimal value of each fraction on a new  
//line with  places after the decimal.

import java.io.*;
import java.util.*;
import java.util.stream.*;
import static java.util.stream.Collectors.toList;

class Result {

    /*
     * Complete the 'plusMinus' function below.
     *
     * The function accepts INTEGER_ARRAY arr as parameter.
     */

    public static void plusMinus(List<Integer> arr) {
    // Write your code here
    
    // print these 3 lines
    // proportion of positive values 
    // proportion of negative values 
    // proportion of zeros
    
    //eg. 0.500000
    //      0.333333
    //      0.166667
    
        int total = arr.size();
        int positive = 0;
        int negative = 0;
        int zero = 0;
        
        for (int num : arr) {
            if (num > 0) {
                positive++;
            } else if (num < 0) {
                negative++;
            } else {
                zero++;
            }
        }
        
        System.out.printf("%.6f%n", (double) positive / total);
        System.out.printf("%.6f%n", (double) negative / total);
        System.out.printf("%.6f%n", (double) zero / total);
    

    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
            .map(Integer::parseInt)
            .collect(toList());

        Result.plusMinus(arr);

        bufferedReader.close();
    }
}
