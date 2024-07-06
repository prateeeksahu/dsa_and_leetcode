package practice.stringsAndArraylists;
import java.util.*;

public class removePrimeNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        ArrayList<Integer> al = new ArrayList<>();

        for(int i = 0; i<n; i++){
            al.add(sc.nextInt());
        }
        remove(al);
        System.out.println(al);
    }

    public static void remove(ArrayList<Integer> al){
        for(int i = al.size()-1; i>=0; i--){
            int x = al.get(i);
            if(isPrime(x)==true){
                al.remove(i);
            }
        }
    }

    public static boolean isPrime(int x){
        for(int div=2;div*div<=x;div++){
            if(x%div==0){
                return false;
            }
        }
        return true;
    }
}
