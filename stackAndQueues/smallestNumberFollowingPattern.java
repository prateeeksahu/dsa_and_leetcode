package practice.stackAndQueues;

import java.util.*;

public class smallestNumberFollowingPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        String st = sc.next();

        snfp(st);
    }

    public static void snfp( String st){
        Stack <Character> d = new Stack<>();
        Stack <Integer> v = new Stack<>();
        ArrayList<Integer> c = new ArrayList<>();
        int cm = 1;
        c.add(cm);

        for(int i = 0;i<st.length();i++){
            char ch = st.charAt(i);
            if(ch == 'd'){
                d.push('d');
                cm+=1;
                c.add(cm);
            } else {
                while(d.size()>0){
                    d.pop();
                    v.push(c.get(c.size()-1));
                    c.remove(c.size()-1);
                }

                v.push(c.get(c.size()-1));
                cm+=1;
                c.add(cm);
            }
        }

        while(d.size()>0){
            d.pop();
            v.push(c.get(c.size()-1));
            c.remove(c.size()-1);
        }

        v.push(c.get(c.size()-1));
        cm+=1;
        c.add(cm);

        int x = v.size();
        Stack<Integer> stt = new Stack<>();

        for(int i = 0;i<x;i++){
            int a = (v.pop());
            stt.push(a);
        }

        for(int i = 0;i<x;i++){
            System.out.println(stt.pop());
        }

        
    }


}
