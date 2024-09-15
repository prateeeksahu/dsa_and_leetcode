package practice.test;

import java.util.*;

public class 71A-Way_Too_Long_Words {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while(t-- >= 0){
            String str = sc.nextLine();
            if(str.length() > 10) System.out.println( "" +  str.charAt(0) + (str.length() - 2) + str.charAt(str.length() - 1));
            else System.out.println(str);
        }

    }

}
