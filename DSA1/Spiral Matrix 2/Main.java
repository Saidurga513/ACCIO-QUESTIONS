import java.io.*;
import java.util.*;
class Main{
    public static void main(String args[])throws IOException{
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int max=Integer.MAX_VALUE;
        while(t-- > 0){
            int r = sc.nextInt();
            int c = sc.nextInt();
            int matrix[][] = new int[r][c];
            for(int i = 0; i < r; i++){
                for(int j = 0; j < c; j++)
                 matrix[i][j] = sc.nextInt();
            
            ArrayList<Integer> ans = spirallyTraverse(matrix, r, c);
            for (Integer val: ans) 
                System.out.print(val+" "); 
            System.out.println();
        }
    }

    public static ArrayList<Integer> spirallyTraverse(int matrix[][], int n, int m){
        // your code here
        ArrayList<Integer> list = new ArrayList<>();
        /*1 2 3
         * 4 5 6
         * 7 8 9         */
        // first print the firts column 00,10,20,..n-1,0
        int c=1;//row indiactes
        for(int i=0;i<n;i++)
        list.add(matrix[i][0]);

        //except oth column then remaining last row n-1,1..
        for(int i=1;i<m;i++)
        list.add(matrix[n-1][i]);
        //last column
        for(int i=n-2;i>=0;i--)
        list.add(matrix[i][m-1]);
        //remaining first row
        for(int i=m-2;i>0;i--)
         list.add(matrix[0][i]);
        //print the middle elements in 2nd row
        for(int i=1;i<n-1;i++)
        list.add(matrix[i][1]);
        // for(int i=n-2;i>1;i--)
        // list.add(matrix[i][i]);
        return list;
		
    }
}
