//Complete this code or write your own from scratch
import java.util.*;
import java.io.*;

class Solution{
    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        Map<String,Integer> contacts= new HashMap<String,Integer>();
        for(int i = 0; i < n; i++){
            String name = in.next();
            int phone = in.nextInt();
            contacts.put(name,phone);
        }
        int result;
        while(in.hasNext()){
            String s = in.next();
            try{
                result=contacts.get(s);
                System.out.println(s+"="+result);
            }
            catch(Exception e){
                System.out.println("Not found");
            }
        }
        in.close();
    }
}

