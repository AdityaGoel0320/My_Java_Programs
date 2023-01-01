public class pw {
    static long fnc(int n) {
        if (n < 0) {
            System.out.println("error");
            return -1;
        }
        if (n == 0 || n == 1) {
            return n;
        }

        return  fnc(n - 1) + fnc(n - 2) ;
    }


    static void fnc2(int n){
        if(n==1){
            System.out.print(1 + " ");
            return ;
        }
        fnc2(n-1);
        System.out.print(n + " ");
    }


    static int sumofdigit(int n){
        if(n>=0 && n<=9){
            return n ; 
        }
        return n%10  + sumofdigit(n/10);
    }


     static int  fnc4(int n , int c){
        if(n>=0 && n<=9){
            return c+1 ;
        }
        c +=1 ;
        return fnc4(n/10 , c ) ;
     }
    public static void main(String[] args) {
        System.out.println(fnc4(123456789 , 0 ));
    }
}