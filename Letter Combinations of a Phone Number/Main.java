import java.util.*;

public class Main {
    public static void main(String[] args) throws Throwable {
        Scanner sc = new Scanner(System.in);
        String digits = sc.nextLine();
        sc.close();
        if(digits.isEmpty()){
            System.out.println("");
        }
        else{
            List<String> ans = Solution.letterCombinations(digits);
            Collections.sort(ans);
            for(int i=0;i<ans.size();i++){
                System.out.print("" + ans.get(i) + " ");
            }

        }
        
    }
}

class Solution {
  static   List<String> mapping =  new ArrayList<>(List.of("","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"));
   static  List<String> ans = new ArrayList<>();
 static   void genrateComination(String digits,String letters,int idx)
    {
        if(digits.length() == letters.length()){
            ans.add(letters);
            return;
        }
        String currDigit = mapping.get(digits.charAt(idx)-'0');
        for(int i=0;i<currDigit.length();++i)
            genrateComination(digits,letters+currDigit.charAt(i),idx+1);
        

    }
    static List<String> letterCombinations(String digits) {
        // Write code here
		 if (digits.length() == 0)
            return ans;
        genrateComination(digits,"",0);
        return ans;
    }
}