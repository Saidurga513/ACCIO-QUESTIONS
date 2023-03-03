import java.util.*;

class Solution {
    boolean[] visited;
    public boolean CanVisitAllRooms(ArrayList<ArrayList<Integer>> rooms) {
        // Write your code here
        visited=new boolean[rooms.size()];
        visited[0]=true;
        dfs(rooms,0);
        for(boolean n:visited)
        {
            if(!n)
             return false;
        }

        return true;
    }
    public void dfs(ArrayList<ArrayList<Integer>> rooms,int index){
    for(int i:rooms.get(index))
    {
        if(!visited[i]){
            visited[i]=true;
            dfs(rooms,i);
        }
    }
}
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<ArrayList<Integer>> r = new ArrayList<ArrayList<Integer>>();
        for(int i = 0; i < n; i++) {
            int m = sc.nextInt();
            ArrayList<Integer> temp = new ArrayList<Integer>();
            for(int j = 0; j < m; j++) {
                temp.add(sc.nextInt());
            }
            r.add(temp);
        }
	    Solution Obj = new Solution();
        if(Obj.CanVisitAllRooms(r))
            System.out.println("true");
        else
            System.out.println("false");
    }
}