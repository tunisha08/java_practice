import java.util.*;
import java.io.*;

class CustomException extends Exception{
    CustomException(String msg){
        super(msg);
    }
}
class Calculator{
    int power(int n, int p) throws CustomException{
        if(n<0 || p<0){
            throw new CustomException("n and p should be non-negative");
        }
        else{
            return (int)Math.pow(n,p);
        }

    }
}
//Write your code here

class Solution{

    public static void main(String[] args) {
    
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while (t-- > 0) {
        
            int n = in.nextInt();
            int p = in.nextInt();
            Calculator myCalculator = new Calculator();
            try {
                int ans = myCalculator.power(n, p);
                System.out.println(ans);
            }
            catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
        in.close();
    }
}
