package ua.jvlab.smlnk;

import java.util.Arrays;
import java.util.Scanner;

/*Creating an integer of integers based on the data entered
from the keyboard and outputting the data to the screen*/

/* @version 1.0.0;
 * @date 2018-01-18;
 * @author "$.m.lnk";
 */

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array:" + "\n");
        int sArr = sc.nextInt();

        int[] m = new int[sArr];

        for (int i = 0; i <m.length; i++) {
            System.out.println("Input element array: ");
            m[i] = sc.nextInt();
        }

        System.out.println("In the array are placed such elements: " + Arrays.toString(m));
        sc.close();
    }

}

