package practice.recursionAndBacktracking;
import java.util.*;

public class printPermutations {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        print(str,"");
    }

    public static void print(String ques, String psf){

        if(ques.length()==0){
            System.out.println(psf);
            return;
        }

        for(int i = 0; i<ques.length();i++){
            char ch = ques.charAt(i);
            String ros = ques.substring(0,i)+ques.substring(i+1);
            print(ros,psf+ch);
        }
    }
}
