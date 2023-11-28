package practice.linkedList;

// need to re visit
import java.io.*;

import java.util.*;

public class addInMiddle  {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        LinkedList list = new LinkedList();

        String str = br.readLine();
        while(str.equals("quit") == false){
            if(str.startsWith("addLast")){
                int val = Integer.parseInt(str.split(" ")[1]);
                list.addLast(val);
            } else if (str.startsWith("addMid")) {
                int val = Integer.parseInt(str.split(" ")[1]);
                int el = Integer.parseInt(str.split(" ")[2]);
                // Call addMid function
                list.addMid(val, el);
            } else if(str.startsWith("size")){
                System.out.println(list.size());
            } else if(str.startsWith("display")){
                list.display();
            }
            str = br.readLine();
        }
    }
    public static class Node {
        int data;
        Node next;
    }

    public static class LinkedList {
        Node head;
        Node tail;
        int size;

        void addMid(int val,int el){
            if(head.data == val){
                Node temp = new Node();
                temp.data = el;
                temp.next = head.next;
                head = temp;
                size++;
            } else {
                Node temp = new Node();
                Node nxt = head;

                while(temp != null && temp.next != null){
                    nxt = temp.next;
                    if(nxt.data == val){
                        Node opr = new Node();
                        opr.data = el;
                        opr.next = nxt;
                        temp.next = opr;
                        size++;
                    }
                    temp= temp.next;

                }
            }
        }

        void addLast(int val) {
            Node temp = new Node();
            temp.data = val;
            temp.next = null;

            if (size == 0) {
                head = tail = temp;
            } else {
                tail.next = temp;
                tail = temp;
            }

            size++;
        }

        public int size(){
            return size;
        }

        public void display(){
            Node temp  = head;

            while(temp!= null){
                System.out.print(temp.data + " ");
                temp = temp.next;
            }
            System.out.println();
        }
    }


}
