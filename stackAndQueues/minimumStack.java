package practice.stackAndQueues;

import java.io.*;
import java.sql.SQLOutput;
import java.util.*;

public class minimumStack {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        MinStack st = new MinStack();

        String str = br.readLine();
        while(str.equals("quit") == false){
            if(str.startsWith("push")){
                int val = Integer.parseInt(str.split(" ")[1]);
                st.push(val);
            } else if(str.startsWith("pop")){
                int val = st.pop();
                if(val != -1){
                    System.out.println(val);
                }
            } else if(str.startsWith("top")){
                int val = st.top();
                if(val != -1){
                    System.out.println(val);
                }
            } else if(str.startsWith("size")){
                System.out.println(st.size());
            } else if(str.startsWith("min")){
                int val = st.min();
                if(val != -1){
                    System.out.println(val);
                }
            }
            str = br.readLine();
        }
    }

    public static class MinStack {
        Stack<Integer> allData;
        Stack<Integer> minData;

        public MinStack() {
            allData = new Stack<>();
            minData = new Stack<>();
        }


        int size() {
            return allData.size();
        }

        void push(int val) {
            if(minData.size()==0 ||  minData.peek()>=val){
                minData.push(val);
            }
                allData.push(val);

        }

        int pop() {

            int x=-1;
            if(allData.size()==0){
                System.out.println("Stack Underflow");
            } else {
                if((!minData.isEmpty())&&(allData.peek()==minData.peek())){
                    minData.pop();
                }
                x = allData.pop();
            }

            return x;
        }

        int top() {
            if(allData.isEmpty()){
                return -1;
            } else {
                return allData.peek();
            }
        }

        int min(){
            if(minData.isEmpty()){
                System.out.println("Stack Underflow");
                return -1;
            } else {
                return minData.peek();
            }
        }
    }


}