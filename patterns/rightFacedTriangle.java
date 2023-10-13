package practice.patterns;
import java.util.*;

public class rightFacedTriangle {
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//
//        int n = sc.nextInt();

//        int ct=n-1;
//
//        for(int i = 0; i<n; ++i){
//            for(int j=0; j<i; ++j){
//                if(j>ct){
//                    System.out.print(" ");
//                }else{
//                    System.out.print(" *");
//                }
//
//                System.out.println();
//            }
//            ct--;

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            for (int j = n - i; j > 0; j--) {
                System.out.print(" ");
            }
            for (int k = 1; k <= i; k++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }
}

//        Sure! The code uses nested loops to print the pattern. The outer loop, controlled by the variable i, iterates n times, where n is the input number given by the user.
//
//        In each iteration of the outer loop, the first inner loop, controlled by the variable j, runs n - i times. The purpose of this inner loop is to print the spaces before the stars.
//        The loop starts with j = n - i, and for each iteration, it decrements the value of j by 1. This means that for the first iteration of the outer loop, the inner loop runs n - 1 times, for the
//        second iteration of the outer loop, the inner loop runs n - 2 times and so on.
//
//        The second inner loop, controlled by the variable k, runs i times. The purpose of this inner loop is to print the stars.
//
//        So, for each iteration of the outer loop, the first inner loop prints n - i spaces, and the second inner loop prints i stars.
//
//        Finally, the println() method is used to add a new line after each row is printed.
//
//        For example, if the input value is 5:
//
//        On the first iteration of the outer loop, variable i=1, inner loop j will run 4 times and inner loop k will run 1 times.
//        On the second iteration of the outer loop, variable i=2, inner loop j will run 3 times and inner loop k will run 2 times.
//        On the third iteration of the outer loop, variable i=3, inner loop j will run 2 times and inner loop k will run 3 times.
//        On the fourth iteration of the outer loop, variable i=4, inner loop j will run 1 times and inner loop k will run 4 times.
//        On the fifth iteration of the outer loop, variable i=5, inner loop j will run 0 times and inner loop k will run 5 times.
//
//        This way it will print the desired pattern.

