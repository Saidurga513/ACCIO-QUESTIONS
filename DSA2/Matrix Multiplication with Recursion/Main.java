import java.util.*;

class Accio {
    static int result[][];
    static int i=0,j=0,k=0;
    public int[][] MatMul(int m, int p, int n, int[][] A, int[][] B)
     {
        //Write your code here
        int row1=m,col1=p,row2=p,col2=n;
        result=new int[m][n];
        matrixMultiplicationRecurssive(A,row1,col1,B,row2,col2,result);
        return result;
    }
    public static void matrixMultiplicationRecurssive(int A[][],int row1,int col1,int B[][],int row2,int col2,int result[][])
    {
        if(i>=row1)return;
        if(j<col2)
        {
            if(k<col1)
            {
                result[i][j]+=A[i][k]*B[k][j];
                k++;
                matrixMultiplicationRecurssive(A,row1,col1,B,row2,col2,result);
            }
            k=0;
            j++;
            matrixMultiplicationRecurssive(A,row1,col1,B,row2,col2,result);
        }
        k=0;
        j=0;
        i++;
        matrixMultiplicationRecurssive(A,row1,col1,B,row2,col2,result);
  
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m, n, p;
        m = sc.nextInt();
        p = sc.nextInt();
        n = sc.nextInt();
        int[][] A = new int[m][p];
        int[][] B = new int[p][n];

        for(int i = 0; i < m; i++) {
            for(int j = 0; j < p; j++) {
                A[i][j] = sc.nextInt();
            }
        }

        for(int i = 0; i < p; i++) {
            for(int j = 0; j < n; j++) {
                B[i][j] = sc.nextInt();
            }
        }

        Accio Obj = new Accio();

        int[][] Ans = Obj.MatMul(m, p, n, A, B);

        for(int i = 0; i < m; i++) {
            for(int j = 0; j < n; j++) {
                System.out.print(Ans[i][j] + " ");
            }
            System.out.print("\n");
        }
    }
}