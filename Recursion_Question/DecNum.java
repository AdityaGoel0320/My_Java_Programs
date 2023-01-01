package Recursion_Question;

//want to print like  5 4 3 2 1

public class DecNum {
    static void decnum(int n){
        //base case
        if(n==1){
            System.out.println(1);
            return ; 
        }

        // my work  /self work
        System.out.println(n);

        //recusion work bharsoa rakhp iss pe
        decnum(n-1);
    }
    public static void main(String[] args) {

        decnum(5);
        
    }
    
}
