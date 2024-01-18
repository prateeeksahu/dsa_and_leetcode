package practice.test;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;

public class test {

    public static void main(String[] args) {

        Scanner sc = new Scanner (System.in);
        String w1 = sc.nextLine();
        String w2 = sc.nextLine();

        closeStrings(w1, w2);

    }

    public static boolean closeStrings(String word1, String word2) {
        System.out.println(word1.length());
        System.out.println(word2.length());

        if(word1.length() != word2.length()){
            return false;
        }

        int [] cw1 = new int [26];
        int [] cw2 = new int [26];

        Set<Character> s1 = new HashSet<>();
        Set<Character> s2 = new HashSet<>();


        for (int i = 0; i<word1.length();i++){


            cw1[word1.charAt(i) -'a']++;
            s1.add(word1.charAt(i));
            cw2[word2.charAt(i) -'a']++;
            s2.add(word2.charAt(i));

        }

        List<Character> l1 = new ArrayList<Character>(s1);
        System.out.println(l1);
        List<Character> l2 = new ArrayList<Character>(s2);
        System.out.println(l2);

        if(l1.equals(l2) == false){
            return false;
        }

        Arrays.sort(cw1);
        Arrays.sort(cw2);





        for(int i = 0;i<26;i++){
            System.out.println(cw1[i] + " " + cw2[i]);
            if(cw1[i] != cw2[i]){
                return false;
            }
        }

        return true;

    }

}
