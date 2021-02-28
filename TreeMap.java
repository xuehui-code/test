import java.util.Map;

public class TreeMap {
    public static void TestMap1(){
        Map<String,String> m = new java.util.TreeMap<>();

        m.put("林冲","豹子头");
        m.put("鲁智深","花和尚");
        m.put("武松","行者");
        m.put("宋江","及时雨");
        String str =m.put("李逵","黑旋风");
        System.out.println(m.size());
        System.out.println(m);

        str = m.put("无名","null");
        System.out.println(m.size());
    }



}



