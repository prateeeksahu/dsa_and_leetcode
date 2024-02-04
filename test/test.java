//package practice.test;
//
//
//import java.util.Scanner;
//
//public class test {
//    public static void main(String[] args) {
//
//        Scanner sc = new Scanner(System.in);
//
//        String str =  sc.nextLine();
//
//        for(int i = 0; i<str.length(); i++){
//            char ch = str.charAt(i);
//            boolean f = true;
//            if(ch == '.'){
//                for(int j = i+1; j<str.length(); j++){
//                    if(str.charAt(j)!=0){
//                        f = false;
//                    }
//
//                }
//                if(f){
//                    System.out.println("int " + str.substring(0,i));
//                } else {
//                    String s = str.substring(i+1);
//                    s = "0." + s;
//                    System.out.println("float " + str.substring(0,i) + " " + s );
//                }
//
//                break;
//            }
//        }
//
//    }
//}


package practice.test;

import java.util.Scanner;

public class test {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            boolean f = true;
            if (ch == '.') {
                for (int j = i + 1; j < str.length(); j++) {
                    if (str.charAt(j) != '0') {
                        f = false;
                    }
                }

                if (f) {
                    System.out.println("int " + str.substring(0, i));
                } else {
                    String s = str.substring(i + 1);
                    s = "0." + s;
                    System.out.println("float " + str.substring(0, i) + " " + s);
                }
                break;
            }
        }
    }
}
