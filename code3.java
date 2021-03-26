package LeetCode;

import java.util.HashSet;
import java.util.Set;

public class code3 {
    public int lengthOfLongestSubstring(String s) {
        Set<Character> occ = new HashSet<Character>();
        int n = s.length();            //n是s的总长度
        int rk = -1,ans=0;             //rightkey
        for (int i =0;i<n;i++){
            if (i!=0){
                occ.remove(s.charAt(i-1));   //逐个删除字符
            }
            while(rk+1<n&&!occ.contains(s.charAt(rk+1))){
                occ.add(s.charAt(rk+1));
                ++rk;
            }
            ans = Math.max(ans,rk-i+1);
        }
        return ans;
    }
}
