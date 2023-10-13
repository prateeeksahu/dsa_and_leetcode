package practice.ipa35MarksQuestion;
import java.util.*;


public class jan20th {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Motel [] motel = new Motel[4];

        for(int i = 0;i<motel.length;i++){
            int mi = sc.nextInt();sc.nextLine();
            String mn = sc.nextLine();
            String dob = sc.nextLine();
            int norb = sc.nextInt();sc.nextLine();
            String cf = sc.nextLine();
            double tb = sc.nextDouble();sc.nextLine();

            motel[i] = new Motel(mi, mn,dob, norb,cf, tb);

        }

        String str = sc.nextLine();

        int res = find(motel, str);

        if(res == 0){
            System.out.println("No such rooms booked");
        } else {
            System.out.println(res);
        }

    }

    public static int find(Motel[] motel, String str){
        int c = 0;

        for(Motel m : motel){
            if(m.cf.equalsIgnoreCase(str) && m.norb>5){
                c+=m.norb;
            }
        }

        return c;
    }
}

class Motel{

    int mi;
    String mn;
    String dob;
    int norb;
    String cf;
    double tb;

    public Motel(int mi, String mn, String dob, int norb, String cf, double tb){
        this.mi = mi;
        this.mn = mn;
        this.dob = dob;
        this.norb = norb;
        this.cf = cf;
        this.tb = tb;
    }
}
