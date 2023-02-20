import java.util.*;

public class Main {
    public static void main(String[] args) throws Throwable {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // Your code here
		for(int i=1;i<=n;i++)
        {
            int count=0;
            for(int j=2;j<=i/2;j++)
            {
                if(i%j==0)
                    count++;
            }
            if(count==0)
            System.out.println(i);
        }
    }
}