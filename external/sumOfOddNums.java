package practice.external;

public class sumOfOddNums {
    public static void main(String[] args) {
        int n = 5;

        for(int i = 1; i<=n;i++){
            int sum = 0;
             for(int j = 1;j<=i;j++){
                 if(j==1){
                     System.out.print(j);
                 } else {
                     System.out.print("+" + j);
                 }

                 sum+=j;
             }

            System.out.print(" = " + sum);
            System.out.println();

        }
    }
}
