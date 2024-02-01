package practice.test;

import java.util.*;


public class test2 {

    public static class  joke {
        int a;
        int b;


        public joke(int a, int b){
            this.a = a;
            this.b = b;
        }

        public int sum(){
            return a+b;
        }


    }
    public static void main(String[] args) {

        joke obj1 = new joke(5, 10);
        System.out.println(obj1.sum());
        joke obj2 = new joke(10, 10);
        System.out.println(obj2.sum());
        System.out.println(obj1.a);




    }
}

