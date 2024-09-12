//package practice.CSES;

import java.io.*;
import java.util.*;

public class increasingArray {

    static FastReader in = new FastReader();
    static FastWriter out = new FastWriter();
    static final Random random = new Random();
    static long mod = 1000000007L;
    static HashMap<String, Integer> map = new HashMap<>();


    static <E> void print(E res) throws IOException {
        out.println(res);
    }

    static int abs(int a) {
        return Math.abs(a);
    }

    // Fast Reader
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

    // Fast Writer
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
        int n= in.nextInt();
        long r = 0;
        int [] arr = in.readIntArray(n);

        for(int i = 1; i < arr.length; i++){
            if(arr[i] < arr[i-1]){
                r += abs(arr[i] - arr[i-1]);
                arr[i] += abs(arr[i] - arr[i-1]);
            }
        }

        print(r);
        out.close();
    }

}

