// Java program to sum two numbers
// represented two arrays.
import java.util.*;

public class Main {
  static int[] calSum(int a[], int b[], int n, int m) {
    // your code here
       StringBuilder sb1=new StringBuilder();
    for(Integer num:a)
    {
        sb1.append(num);
    }
    StringBuilder sb2=new StringBuilder();
    for(Integer num:b)
    {
        sb2.append(num);
    }
    long f=Long.parseLong(sb1.toString());
    long l=Long.parseLong(sb2.toString());
    long sum=f+l;
    String result=Long.toString(sum);
    int res[]=new int[result.length()];
    for(int i=0;i<result.length();i++)
        res[i]=result.charAt(i)-'0';
    return res;
  }

  /* Driver program to test above function */
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n1 = sc.nextInt();
    int[] arr1 = new int[n1];
    for (int i = 0; i < n1; i++) arr1[i] = sc.nextInt();

    int n2 = sc.nextInt();
    int[] arr2 = new int[n2];
    for (int i = 0; i < n2; i++) arr2[i] = sc.nextInt();
    sc.close();

    int[] res = calSum(arr1, arr2, n1, n2);
    for (int i : res) System.out.println(i);
  }
}