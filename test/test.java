package practice.test;

import java.util.*;

public class test {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {


        int t = sc.nextInt();

        while(t>0){

            solve();


            t--;
        }



    }

    public static void solve(){
        int n = sc.nextInt();
        int M = sc.nextInt();


        int [] arr = new  int [n];
        int prod = 1;
        int l = 0;
        int r = 0;
        int [] ans = new int[n];


        for(int i = 0; i<n; i++){
            int x = sc.nextInt();
            arr[i] = x;
        }

        String com = sc.next();

        for(int i = 0; i<com.length(); i++){

            if(com.charAt(i) == 'L') l++;
        }
        r=l;

        for(int i = com.length() -1 ; i >= 0; i--){
            char ch = com.charAt(i);



            if (ch == 'L') {
                prod = (prod * arr[--l]) % M;
            } else {
                prod = (prod * arr[r++]) % M;
            }

            ans[i] = prod;
        }

        for(int a : ans){
            System.out.print(a + " ");
        }

        System.out.println();

    }

}
