package practice.external;


import java.util.*;
public class pattern {
    public static void main(String[] args) {
        int n = 5;

        for (int i = 0; i<(n*2)+1;i++) {
            int x = 1;
            if (i == 0 || i == (n * 2)) {
                System.out.print("*");
            } else {
                if(i<((n*2)+1)/2){
                    System.out.print("*");
                    for(int j = 1; j<(i*2); j++){
                        if(j<i){
                            System.out.print(x);
                            x++;
                        } else {
                            System.out.print(x);
                            x--;
                        }
                    }
                    System.out.print("*");
                } else {
                    System.out.print("*");
                    for (int j=1; j<(n*2-i)*2; j++) {
                        if (j<n*2-i) {
                            System.out.print(x);
                            x++;
                        } else {
                            System.out.print(x);
                            x--;
                        }
                    }
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }
}

