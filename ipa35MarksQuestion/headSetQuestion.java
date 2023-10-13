package practice.ipa35MarksQuestion;
import java.util.*;

public class headSetQuestion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Headset [] headset = new Headset[4];

        for(int i = 0; i<headset.length;i++){
            String hn = sc.nextLine();
            String b = sc.nextLine();
            int p = sc.nextInt();
            boolean a = sc.nextBoolean();sc.nextLine();

            headset[i] = new Headset(hn, b, p, a);
        }
        sc.nextLine();

        String b = sc.nextLine();

        int r = tp(headset, b);

        if (r == 0) {
            System.out.println("No headsets available with given brand");
        } else {
            System.out.println(r);
        }

        ah(headset);
        

        
        
    }

    public static int tp( Headset [] headset, String b){
        int s = 0;

        for(Headset x : headset){
            if(x.b.equalsIgnoreCase(b)){
                s+=x.p;
            }
        }

        return s;
    }

    public static void ah(Headset[] headset){


        int c = 0;
        for(int i =0; i<headset.length;i++){
            if(headset[i].a == true){
                c++;
            }
        }


        Headset[] nh = new Headset[c];
        int k =0;

        for(int i =0; i<headset.length;i++){
            if(headset[i].a == true){
                nh [k] = headset[i];
                k++;
            }
        }

        Arrays.sort(nh, (a,b)-> a.p - b.p);

        if(c == 0){
            System.out.println( "No Headsets available");
        } else {
            System.out.println(nh[1].hn);
            System.out.println(nh[1].p);
        }





    }



}

class Headset{
    String hn;
    String b;
    int p;
    boolean a;



//    public String ghn(){
//        return hn;
//    }
//
//    public int ghp(){
//        return p;
//    }

    public Headset(String hn, String b, int p, boolean a){
        this.hn = hn;
        this.b= b;
        this.p = p;
        this.a = a;


    }

}
