import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan=new Scanner(System.in);
        int Da=scan.nextInt();
        int Ma=scan.nextInt();
        int Ya=scan.nextInt();
        int De=scan.nextInt();
        int Me=scan.nextInt();
        int Ye=scan.nextInt();
        int fine=0;

        if(Ya==Ye){
            if(Ma==Me){
                if(Da==De){
                    System.out.println("0");
                }
                else{
                    if(Da<De){
                        System.out.println("0");
                    }
                    else{
                    fine=15*(Da-De);
                    System.out.println(fine);}
                }}
            else{
                if(Ma<Me){
                    System.out.println("0");
                }
                else{
                fine=500*(Ma-Me);
                System.out.println(fine);
            }}
            }
            else{
                if(Ya<Ye){
                    System.out.println("0");
                }
                else{
                System.out.println("10000");
            }}
        }
}

