import java.util.*;
import java.lang.Thread.State;

class Solution {
    public void MatTraverseRecur(int[][] mat) {
        // Write your code here

        int row=mat.length-1;
        int col=mat[0].length-1;
        traverseMatrix(mat,0,0,row,col);

    }
    public static void traverseMatrix(int [][] mat,int i,int j,int row,int col) 
    {
        if(i==row && j==col)
        {
            System.out.print(mat[i][j]);
            return;
        }  
        System.out.print(mat[i][j]+" ");
        if(j<col)
        {
            traverseMatrix(mat,i,j+1,row,col);
        }
        else if(i<row)
        {
            System.out.println();   
            traverseMatrix(mat,i+1,0,row,col);
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt(), n = sc.nextInt();
        int[][] mat = new int[m][n];

        for(int i = 0; i < m; i++) {
            for(int j = 0; j < n; j++)
                mat[i][j] = sc.nextInt();
        }
	    Solution Obj = new Solution();
        Obj.MatTraverseRecur(mat);
    }
}