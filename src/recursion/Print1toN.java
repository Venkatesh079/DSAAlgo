package recursion;

import java.util.*;

public class Print1toN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        print1toN(n,n);
    }

    public static void print1toN(int i,int n) {
        if(i<1) {
            return;
        }
        System.out.println(i);
        print1toN(i-1, n);

    }
}
