package src.com.practice.misc.easy;

import java.util.*;
import java.lang.*;

/**
 * Problem
 * Nightking wants to attack the kingdom and he really likes cold days.
 * However, he doesn’t want to attack the kingdom on the coldest day, because it is obvious.
 *
 * Instead, he will attack the second coldest day. Given an array
 * A of N distinct integers where Ai represents the temperature forecast of the
 * i-th day, You need to find the temperature of the day of the attack.
 *
 * Input Format
 * First-line will contain T, the number of test cases. Then the test cases follow.
 * Each test case contains two lines of input.
 * The first line of every test case contains an integer
 * N - the number of days
 * The second line of every test case contains N integers - A1, A2,..,AN
 * denoting the temperature forecast of the i-th day.
 * Output Format
 * For each test case, output in a single line - the answer to the i-th test case.
 */

public class SecondColdestDay {
        public static void main (String[] args) throws java.lang.Exception
        {
            Scanner sc = new Scanner(System.in);
            int testCase = sc.nextInt();
            for(int i = 1; i <= testCase; i++) {
                int days = sc.nextInt();
                int[] temp = new int[days];
                for(int j = 0; j < days; j++) {
                    temp[j] = sc.nextInt();
                }
                secondColdest(days, temp);
            }
        }

        public static void secondColdest(int days, int[] temp) {
            int cold = Integer.MAX_VALUE;
            int secondCold = Integer.MAX_VALUE;
            if(temp.length >= 2) {
                for(int i = 0; i < days; i++) {
                    if(temp[i] < cold) {
                        secondCold = cold;
                        cold = temp[i];
                    }
                    if(temp[i] > cold && temp[i] < secondCold) {
                        secondCold = temp[i];
                    }
                }
                System.out.println(secondCold);
            }
        }

}


