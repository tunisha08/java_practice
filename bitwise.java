import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int t = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        int h=0;
        ArrayList<Integer> a=new ArrayList<>();
        for (int tItr = 0; tItr < t; tItr++) {
            String[] nk = scanner.nextLine().split(" ");

            int n = Integer.parseInt(nk[0]);

            int k = Integer.parseInt(nk[1]);
            
             a=new ArrayList<Integer>();
             for(int i=1;i<=n;i++){
                 for(int j=i+1;j<=n;j++){
                     h=i&j;
                     if(h<k){
                     a.add(h);
                 }}
             }
             int max=a.get(0);
           for(int j=1;j<a.size();j++){
               if(a.get(j)>max){
                   max=a.get(j);
               }
           }
             
                     System.out.println(max);

        }

        scanner.close();
    }
}
