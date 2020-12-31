package arraylist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListDemo {
    public static void main(String[] args){
        //构造空顺序表
        List<String> list1 = new ArrayList<>();
        //数组转List
        List<String> list2 = Arrays.asList(
                "我","是","中","国","人",
                "我","爱","我","的","祖","国"
        );
        System.out.println(list2);

        List<String> list3 = new ArrayList<>(list2);//复制一遍
        System.out.println(list3);
    }
}
