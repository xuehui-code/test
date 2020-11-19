package frank.jdbc.test2;

import java.sql.SQLException;

public class Test2 {

    public static void main(String[] args) {
//        System.out.println(test(1));
        System.out.println(test(2));
    }

    public static int test(int i){
        try {
            if(i == 0)
                throw new SQLException();
            if(i == 1)
                return 1;
            if(i == 2)
                throw new ArrayIndexOutOfBoundsException();

        }catch (SQLException e){
            throw new RuntimeException("1");
        }catch (Exception e){
            throw new RuntimeException("2");
        }finally {
            //这里一般不写return，如果写的话，就是笔试面试题
        }
        //不管return还是抛异常，方法有返回值，一定要把所有逻辑分支覆盖完整
        return 0;
    }
}
