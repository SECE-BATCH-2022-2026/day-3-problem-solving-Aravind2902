import java.util.*;

class Main {
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String inpu=sc.nextLine();
        int n=sc.nextInt();
        String ans=UserMainCode.repeatFront(inpu,n);
        System.out.println(ans);
    }
}

class UserMainCode {
    public static String repeatFront(String inp, Integer n) {

        int l = inp.length();

        if (l == 0) {
            return inp;
        }
        else if (l < 3) {   
            String res = "";
            for (int i = 1; i <= n; i++) {
                res += inp;
            }
            return res;
        }
        else {
            String res = "";
            String inp1 = inp.substring(0, 3);   //

            for (int i = 1; i <= n; i++) {
                res += inp1;
            }
            return res;   
        }
    }
}