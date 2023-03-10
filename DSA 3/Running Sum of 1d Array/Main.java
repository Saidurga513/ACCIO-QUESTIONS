import java.util.*;

class Solution {
    public static int[] runningSum(int[] arr){
       //Write your code here
       int res[]=new int[arr.length];
       res[0]=arr[0];
       for(int i=1;i<arr.length;i++)
       {
        res[i]=res[i-1]+arr[i];
       }
		return res;
    }
    
}

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] input = new int[n];
        int[] output = new int[n];
        for (int i = 0; i < n; i++) {
            input[i] = sc.nextInt();
        }
        int [] arr=(Solution.runningSum(input));

        for(int i=0; i<arr.length; i++)
            System.out.print(arr[i]+" ");
    }
}

