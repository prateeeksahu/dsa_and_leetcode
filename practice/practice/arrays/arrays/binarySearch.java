package practice.arrays;

public class binarySearch {
    public static void main(String[] args) {
        int [] arr = {10, 20, 30, 40, 50, 60, 70, 80, 90};
        int d = 20;

        int lo = 0;
        int hi = arr.length-1;

        while(lo<=hi){
            int mi = ((lo+hi)/2);

            if(d<arr[mi]){
                hi = mi-1;
            } else if (d>arr[mi]){
                lo = mi+1;
            } else{
                System.out.println(mi);
                return;
            }

        }
        System.out.println(-1);
    }
}
