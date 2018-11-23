import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan=new Scanner(System.in);
        int t=scan.nextInt();
        String z=scan.nextLine();
        String s;
        for(int i=0;i<t;i++){
            s=scan.nextLine();
            for(int j=0;j<s.length();j=j+2){
                System.out.print(s.charAt(j));
            }
            System.out.print(" ");
            for(int k=1;k<s.length();k=k+2){
                System.out.print(s.charAt(k));
            }
            System.out.print("\n");
        }

    }
}

