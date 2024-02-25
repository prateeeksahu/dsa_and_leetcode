package practice.test;
//public class test2 {
//    public static void main(String[] args) {
//
//        Scanner sc = new Scanner(System.in);
//        String str = sc.nextLine();
//
//        solve(str);
//
//    }
//
//    public static void solve(String str){
//
//        if(str.length() == 1 && str == "1") { System.out.println("YES");} else { System.out.println("NO");}
//        if(str.length() == 2 && str == "14") { System.out.println("YES");} else { System.out.println("NO");}
//        if(str.length() == 3 && str == "144") { System.out.println("YES");} else { System.out.println("NO");}
//
//        int i = 0;
//        int j = 2;
//        boolean mn = true;
//
//        while (j < str.length()) {
//            String substr = str.substring(i,j+1);
//
//            for(int k = 0; k<3;k++){
//
//                if(i == 0 && substr.substring(0,1) != "1") mn = false;
//                if(i == 1 && substr.substring(0,2) != "14") mn = false;
//                if(i == 2 && sxubstr.substring(0,3) != "144") mn = false;
//            }
//
//            i++; j++;
//        }
//
//        if (mn) System.out.println("YES");
//        else System.out.println("NO");
//
//    }
//}
//

import java.util.*;
public class test2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        if (isMagicNumber(str)) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }

    public static boolean isMagicNumber(String str) {
        return str.matches("^(1|14|144)*$");
    }
}