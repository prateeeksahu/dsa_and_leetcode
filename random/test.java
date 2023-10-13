import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.Collections;

public class test {

    public static ArrayList<Integer> findSimilarity(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int n, int m) {
        ArrayList<Integer> com = new ArrayList<>();
        ArrayList<Integer> uni = new ArrayList<>();

        int i = 0;
        int j = 0;
        Collections.sort(arr1);
        Collections.sort(arr2);

        while (i < arr1.size() && j < arr2.size()) {
            if (arr1.get(i) < arr2.get(j)) {
                uni.add(arr1.get(i));
                i++;
            } else if (arr2.get(j) < arr1.get(i)) {
                uni.add(arr2.get(j));
                j++;
            } else {
                com.add(arr1.get(i));
                uni.add(arr1.get(i));
                i++;
                j++;
            }
        }

        ArrayList<Integer> res = new ArrayList<>();
        res.add(com.size());
        res.add(uni.size());

        return res;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();  // Number of test cases

        for (int i = 0; i < t; i++) {
            int n = scanner.nextInt();  // Size of the first array
            int m = scanner.nextInt();  // Size of the second array
            ArrayList<Integer> arr1 = new ArrayList<>();
            for (int j = 0; j < n; j++) {
                arr1.add(scanner.nextInt());
            }


            ArrayList<Integer> arr2 = new ArrayList<>();
            for (int j = 0; j < m; j++) {
                arr2.add(scanner.nextInt());
            }

            ArrayList<Integer> result = findSimilarity(arr1, arr2, n, m);
            System.out.println( result.get(0) + " " + result.get(1));

        }
    }
}
