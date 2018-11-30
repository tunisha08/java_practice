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
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
            ArrayList<Integer> a=new ArrayList<Integer>();
                int i=0;
                while(n!=0){
                    a.add(n%2);
                    n=n/2;
                    i=i+1;
                }

                int count[]=new int[a.size()];
                for(int k=a.size()-1;k>=0;k--) {
                    count[k]=0;
                    if(a.get(k)==1) {
                        count[k]=1;
                    for(int l=k-1;l>=0;l--) {
                        if(a.get(l)!=1) {
                            break;
                        }
                        else {
                            count[k]=count[k]+1;
                        }
                    }
                }
                }
                int highestCount=0;
                for(int j=0;j<i;j++) {
                    if(count[j]>highestCount) {
                        highestCount=count[j];
                    }
                }
                System.out.println(highestCount);

        scanner.close();
    }
}
