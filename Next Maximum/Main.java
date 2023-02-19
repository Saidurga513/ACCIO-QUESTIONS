import java.util.*;

class Main{

	/**
	 * @param A
	 * @param n
	 * @return
	 */
	public static int[] nextMaximum(int[] A,int n)
    {
		//Write code here and print output
		// create the resultant array
		int[] result=new int[n];
		for(int i=0;i<n;i++)
        {
            int min=i+1;
            int m=1;
            // create the empty stack
            Stack<Integer> st=new Stack<>();
            st.push(A[i]);
            while(!st.empty()&&min<n)
            {
                    //check the greater element on right side
                if(st.peek()<A[min])
                {
                   result[i]=m;
                    break;
                }
                else
                {
                  min++;  // check the next element
                 m++;
                }
            }  
             if(result[i]!=m)
             {
                result[i]=-1;
             }
           
        }
  return result;
	}

	public static void main(String[] args){
		try (Scanner sc = new Scanner(System.in)) {
			int t=sc.nextInt();
			while(t>0){
				int n=sc.nextInt();
				int []A=new int[n];
				for(int i=0;i<n;i++){
					A[i]=sc.nextInt();
				}
				int[] ans = nextMaximum(A,n);
				for(int i = 0; i < n; i++)
				{
					System.out.print(ans[i] + " ");
				}
				System.out.println();
				t--;
			}
		}
	}

}