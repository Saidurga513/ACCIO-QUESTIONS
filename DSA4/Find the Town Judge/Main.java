import java.util.*;

class Accio {
    public int findJudge(int n, int[][] trust) {
        //Write your code here
        if(trust.length==0&&n==1)return 1;
        else if(trust.length==0) return -1;
        Set<Integer> trust1=new HashSet<Integer>();
        Set<Integer> judge=new HashSet<Integer>();
        for(int i=0;i<trust.length;i++)
        {
            trust1.add(trust[i][0]);
            judge.add(trust[i][1]);
        }
        judge.removeAll(trust1);
        if(judge.isEmpty() || judge.size() > 1)  return -1;
        int judgeId = judge.iterator().next();
        int judgeTrust = 0;
        for(int i = 0; i<trust.length; i++) {
            if(trust[i][1] == judgeId) {
                judgeTrust++;
            }
        }
        if(judgeTrust == n-1) {
            return judgeId;
        }
        return -1;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, m;
        n = sc.nextInt();
        m = sc.nextInt();
        int[][] trust = new int[m][2];
        for (int i = 0; i < m; i++) {
            trust[i][0] = sc.nextInt();
            trust[i][1] = sc.nextInt();
        }
        Accio Obj = new Accio();
        int result = Obj.findJudge(n, trust);
        System.out.println(result);
        sc.close();
    }
}