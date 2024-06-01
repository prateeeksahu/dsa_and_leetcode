package practice.test;
import java.util.*;

public class test {
    public static void main(String[] args) {

        int [] quality = {3,1,10,10,1};
        int [] wage = {4,8,2,2,7};

        int n = quality.length;
        double[] ratios = new double[n];
        for (int i = 0; i < n; i++) {
            ratios[i] = (double) wage[i] / quality[i];
        }

        Integer[] sortedIndices = new Integer[n];
        for (int i = 0; i < n; i++) {
            sortedIndices[i] = i;
        }

        Arrays.sort(sortedIndices, (idx1, idx2) -> Double.compare(ratios[idx1], ratios[idx2]));

        for(Integer x : sortedIndices) System.out.print(x + " ");
        System.out.println();
        for(double x : ratios) System.out.print(x + " ");

    }

}
