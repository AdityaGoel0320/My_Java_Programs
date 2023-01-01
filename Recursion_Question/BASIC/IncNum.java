package Recursion_Question.BASIC;


//want to print like  1 2 3 4 5


public class IncNum {
    static void incnum(int n ){

        if(n==1){
            System.out.println(1);
            return ; 
        }

        //as input me 5 hoga toh usse end me sout karna hai toh isliye fnc call phele
        incnum(n-1);
        System.out.println(n);



    }
    public static void main(String[] args) {

        incnum(5);
        
    }
    
}
