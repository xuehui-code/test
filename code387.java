package LeetCode;

import javax.security.auth.callback.CallbackHandler;
import java.util.HashMap;

public class code387 {
    public int first(String s){
        HashMap<Character,Integer> count = new HashMap<Character, Integer>();
        int n = s.length();
        for (int i = 0;i < n;i++){   //遍历一遍s
            char c = s.charAt(i);     //将s的每一个元素放在c中
            count.put(c,count.getOrDefault(c,0) + 1);
        }

        for (int i = 0;i < n;i++){
            if (count.get(s.charAt(i)) == 1)
                return i;
        }
        return -1;
    }
}
