//Question
/*
 * Q. Maximum and minimum of an array using minimum number of comparisons
 * */


// Solution:

/* If n is odd then initialize min and max as first element. 
If n is even then initialize min and max as minimum and maximum of the first two elements respectively. 
For rest of the elements, pick them in pairs and compare their 
maximum and minimum with max and min respectively. 
*/


import java.util.*;
import java.lang.*;

public class minMax {

    public static int[] minimumComparison(int a[], int n) {

        int min, max;
        int i;
        int result[] = new int[2];

        if (n % 2 == 0) {

            if (a[0] < a[1]) {
                min = a[0];
                max = a[1];
            } else {
                min = a[1];
                max = a[0];
            }
            i = 2;
        } else {
            min = a[0];
            max = a[0];
            i = 1;
        }

        while (i < n - 1) {
            if (a[i] < a[i + 1]) {
                if (min > a[i])
                    min = a[i];
                if (max < a[i + 1])
                    max = a[i + 1];
            } else {
                if (min > a[i + 1])
                    min = a[i + 1];
                if (max < a[i])
                    max = a[i];
            }
            i += 2;


        }

        result[0] = min;
        result[1] = max;

        return result;


    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];

        for (int i = 0; i < n; i++)
            a[i] = sc.nextInt();

        int result[] = new int[2];
        result = minimumComparison(a, n);
        System.out.println(" Minimum element of array : " + result[0]);
        System.out.println(" Maximum element of array : " + result[1]);


    }

}
