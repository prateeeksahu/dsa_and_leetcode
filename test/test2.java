package practice.test;

import java.util.*;


public class test2 {
    public static class Student {
        public static void main(String[] args) {
           Scanner sc = new Scanner(System.in);
           int [] arr = {3,1,2,4};

            Stack <Integer> st = new Stack<>();

            for (int i = 0; i < arr.length; i++) {
                int min = Integer.MAX_VALUE;
                for (int j = i; j < arr.length; j++) {
                    if(arr[j]<min) min = arr[j];

                    st.push(min);
                }


            }

            System.out.println(st);

//


        }
    }
}
