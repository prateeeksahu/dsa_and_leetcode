package practice.test;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;

public class test  implements Iterable<Integer>{

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String haystack  = sc.nextLine();
        String needle = sc.nextLine();



        int n = needle.length();
        int i = 0;
        int j = n;

        while(j!= haystack.length()){
            String hay = haystack.substring(i,j);
            if(needle.equalsIgnoreCase((hay))){
                System.out.println(i);
                return;
            }
            i++;
            j++;
            System.out.println(i);
            System.out.println(j);
        }

        System.out.println("-1");

    }
}
