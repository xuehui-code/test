package arraylist;

import java.util.ArrayList;
import java.util.List;

public class ArrayListCapacityDemo {
    public static void main(String[] args){
        List<String> list = new ArrayList<>(100);
        list.set(98,"hello");
        System.out.println(list);   //元素个数为0个，下标越界
    }
}
