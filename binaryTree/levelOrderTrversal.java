package practice.binaryTree;

import java.util.*;

public class levelOrderTrversal {
    public static class Node{
        int data;
        Node right;
        Node left;

        Node(int data, Node right, Node left){
            this.data = data;
            this.right = right;
            this.left  = left;
        }


    }

    public static Node construct (Integer [] arr){
        Node root = new Node(arr[0], null, null);
        Pair rp = new Pair(root, 1);
        int idx = 0;
        Stack <Pair> st = new Stack<>();
        st.push(rp);

        while(st.size()>0){
            Pair top = st.peek();

            if(top.state == 1){
                idx++;
                if(arr[idx] != null){
                    top.node.left = new Node(arr[idx], null, null);
                    Pair ln = new Pair(top.node.left, 1);
                    st.push(ln);
                } else{
                    top.node.left = null;
                }
                top.state++;

            } else if (top.state == 2){

                idx++;
                if(arr[idx] != null){
                    top.node.right = new Node(arr[idx], null, null);
                    Pair rn = new Pair(top.node.right, 1);
                    st.push(rn);
                } else{
                    top.node.right = null;
                }
                top.state++;

            } else {
                st.pop();
            }
        }

        return root;
    }

    public static void display(Node node) {
        if (node == null) {
            return;
        }

        String str = " <- " + node.data + " -> ";

        String left = (node.left == null) ? " " :  "" + node.left.data;
        String right = (node.right == null) ? " " : "" + node.right.data;

        str = left + str + right;

        System.out.println(str);

        display(node.left);
        display(node.right);
    }

    public static class Pair{
        Node node;
        int state;

        Pair(Node node, int state){
            this.node = node;
            this.state = state;
        }
    }

    public static void levelOrder(Node node){
        ArrayList<Node> list = new ArrayList<>();
    }

    public static void main(String[] args) {

        Integer [] arr = {50, 25, 12, null, null, 37, 30, null, null, null, 75, 62, null, 70, null, null, 87, null, null};

        Node root = construct(arr);
        levelOrder(root);
    }
}

