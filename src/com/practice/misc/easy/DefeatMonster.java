package src.com.practice.misc.easy;

import java.util.Scanner;

/*
A monster has H health points. Each time you hit it with a sword it loses X health points.
However, the monster always gains Y health points right before every one of your hits.
The monster is considered defeated when the number of health points it has becomes zero or less than zero.
You need to find if it is possible to defeat the monster.

Input Format

The first line of the input contains a single integer T - the number of test cases. The description of T test cases follows.
The first line of each test case contains three space-separated integers H, X and Y.
Output
For each test case, print a single line containing one integer. That integer should be
1 if it is possible to defeat the monster and 0 otherwise.

Constraints
1 ≤ T ≤ 100
1 ≤ H,X,Y ≤ 10^18
 */
public class DefeatMonster {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        for(int i = 1; i <= input; i++) {
            long initialHealthPoints = sc.nextLong();
            long hitPoints = sc.nextLong();
            long gainPoints = sc.nextLong();
            System.out.println(canBeDefeated(initialHealthPoints, hitPoints, gainPoints));
        }
    }

    public static int canBeDefeated(long initialHealthPoints, long hitPoints, long gainPoints) {
        long totalHealthPoints = initialHealthPoints + gainPoints; //7+2=9
        long leftHitPoints = totalHealthPoints - hitPoints; //9-2=7
        if(leftHitPoints < initialHealthPoints)
            return 1;
        return 0;
    }
}
