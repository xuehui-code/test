package LeetCode;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class code350 {
    public int[] intersect (int[]nums1,int[]nums2){
        if(nums1.length>nums2.length){
            return intersect(nums2,nums1);
        }
        Map<Integer,Integer>map = new HashMap<Integer, Integer>();
        for (int num:nums1){
            int count = map.getOrDefault(num,0)+1;
            map.put(num,count);
        }
        int[] intersect = new int[nums1.length];
        int index = 0;
        for (int num:nums2){
            int count = map.getOrDefault(num,0);
            if(count>0){
                intersect[index++] = num;
                count--;
                if (count > 0) {
                    map.put(num,count);
                }else{
                    map.remove(num);
                }
            }
        }
        return Arrays.copyOfRange(intersect,0,index);
    }
}
