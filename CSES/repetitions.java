//package practice.CSES;


import java.io.*;
import java.util.*;

public class repetitions {

    static FastReader in = new FastReader();
    static FastWriter out = new FastWriter();
    static final Random random = new Random();
    static long mod = 1000000007L;
    static HashMap<String, Integer> map = new HashMap<>();


    static int max(int a, int b) {
        return Math.max(a, b);
    }

    static void ruffleSort(int[] a) {
        int n = a.length;
        for (int i = 0; i < n; i++) {
            int oi = random.nextInt(n), temp = a[oi];
            a[oi] = a[i];
            a[i] = temp;
        }
        Arrays.sort(a);
    }

    static <E> void print(E res) throws IOException {
        out.println(res);
    }

    static int gcd(int a, int b) {
        return b == 0 ? a : gcd(b, a % b);
    }

    static int lcm(int a, int b) {
        return (a / gcd(a, b)) * b;
    }

    static int abs(int a) {
        return Math.abs(a);
    }


    static class FastReader {
        BufferedReader br;
        StringTokenizer st;

        public FastReader() {
            br = new BufferedReader(new InputStreamReader(System.in));
        }

        String next() {
            while (st == null || !st.hasMoreTokens()) {
                try {
                    st = new StringTokenizer(br.readLine());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }

        int nextInt() {
            return Integer.parseInt(next());
        }

        long nextLong() {
            return Long.parseLong(next());
        }

        double nextDouble() {
            return Double.parseDouble(next());
        }

        String nextLine() {
            String str = "";
            try {
                str = br.readLine();
            } catch (IOException e) {
                e.printStackTrace();
            }
            return str;
        }

        int[] readIntArray(int n) {
            int[] res = new int[n];
            for (int i = 0; i < n; i++) res[i] = nextInt();
            return res;
        }

        long[] readLongArray(int n) {
            long[] res = new long[n];
            for (int i = 0; i < n; i++) res[i] = nextLong();
            return res;
        }
    }


    static class FastWriter {
        private final BufferedWriter bw;

        public FastWriter() {
            this.bw = new BufferedWriter(new OutputStreamWriter(System.out));
        }

        public void print(Object object) throws IOException {
            bw.append("" + object);
        }

        public void println(Object object) throws IOException {
            print(object);
            bw.append("\n");
        }

        public void close() throws IOException {
            bw.close();
        }
    }
    public static void main(String[] args) throws IOException {
        String s = in.nextLine();
        StringBuilder res = new StringBuilder();
        int c = Integer.MIN_VALUE, cc = 1;



        if(s.length() == 1) c = 1;
        else{
            for(int i = 1; i < s.length(); i++){
                if(s.charAt(i) == s.charAt(i-1)) cc++;
                else cc = 1;

                c = max(c, cc);
            }
        }


        print(c);
        out.close();
    }

}

//import java.util.Scanner;
//
//public class repetitions {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        String s = sc.nextLine();
//        if(s.length() == 1){
//            System.out.println(1);
//            return;
//        }
//        int c = Integer.MIN_VALUE, cc = 1;
//
//        for(int i = 1; i < s.length(); i++){
//            if(s.charAt(i) == s.charAt(i-1)) cc++;
//            else cc = 1;
//            c = Math.max(cc, c);
//        }
//        System.out.println(c);
//    }
//}