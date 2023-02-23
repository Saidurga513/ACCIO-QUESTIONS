import java.util.*;
import java.io.*;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set; 
class Solution{
    static String solve(String [] a){
        //Write your code here

        List<String> l1 =
            new ArrayList<String>(Arrays.asList(a));
        boolean increasing=false;
        boolean decreasing=false;
        for(int i=0;i<l1.size()-1;i++)
        {
            if(l1.get(i).compareTo(l1.get(i+1))<0)
            {
                decreasing=true;
            }
            else
            {
                increasing=true;
            }
        }
        if(increasing&&decreasing)
            return "NEITHER";
        else if(!decreasing)
            return "DECREASING";
       return "INCREASING" ;
    }
}
public class Main {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        String[] a = new String[n];
        for(int i = 0; i < n; i++){
            a[i] = input.next();
        }
        input.close();
        System.out.println(Solution.solve(a));
    }
}