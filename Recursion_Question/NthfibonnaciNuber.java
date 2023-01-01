package Recursion_Question;

public class NthfibonnaciNuber {
    static int  nthfib(int n) {
        if (n == 1 || n == 0) {
            return n;
        }
        return nthfib(n - 1) + nthfib(n - 2);
    }

    public static void main(String[] args) {

        System.out.println(nthfib(4));

    }

}
