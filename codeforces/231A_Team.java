import java.util.*;

public class 231A_Team {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int a = 0;
        while (t-- > 0) if (sc.nextInt() + sc.nextInt() + sc.nextInt() >= 2) a++;
        System.out.println(a);

    }
}
