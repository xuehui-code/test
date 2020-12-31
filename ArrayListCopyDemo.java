package arraylist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListCopyDemo {
    public static void main(String[] args){
        List<String> list2 = Arrays.asList(
                "我", "是", "中", "国", "人",
                "我", "爱", "我", "的", "祖", "国"
        );

        List<String> list3 = list2;
        List<String> list4 = new ArrayList<>(list3);

        list3.set(0,"你");

        System.out.println(list2);
        System.out.println(list3);
        System.out.println(list4);
    }
}
