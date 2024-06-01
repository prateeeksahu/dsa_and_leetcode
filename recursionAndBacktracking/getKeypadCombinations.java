package practice.recursionAndBacktracking;
import java.util.*;


public class getKeypadCombinations {
    static String [] codes = {",;", "abc", "def", "ghi", "jkl","mno","pqrs", "tu","vw","xyz"};

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        ArrayList<String> words = gkc(str);
        System.out.println(words);

    }

    public static ArrayList<String> gkc(String str){
        if(str.length() == 0){
            ArrayList<String> bres = new ArrayList<>();
            bres.add("");
            return bres;
        }

        char ch = str.charAt(0);
        String ros = str.substring(1);

        ArrayList<String> rres = gkc(ros);
        ArrayList <String> mres = new ArrayList<>();

        String cfch = codes[ch - '0'];
        for(int i = 0; i<cfch.length(); i++){
            char cd = cfch.charAt(i);
            for(String x : rres){
                mres.add(cd + x);
            }
        }

        return mres;
    }
}
