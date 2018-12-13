import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
public static boolean isPrime(int n){
    if(n==1){
        return false;
    }
    else{
    for(int i=2;i<=n/2;i++){
        if(n%i==0){
            return false;
        }
    }
    return true;
    }

}
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        int a;
        for(int i=0;i<n;i++){
            a=scan.nextInt();
            if(isPrime(a)){
                System.out.println("Prime");
            }
            else{
                System.out.println("Not prime");
            }
        }
        scan.close();
    }
}



