/*//有一组数据，只有一个数字是出现一次，其他是两次，请找出这个数字
public class Working {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 4, 3, 2, 1};
        findOwnNum(array);
    }
    public static void findOwnNum(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int count = 0;
            int j = 0;
            for (j = 0; j < arr.length; j++) {
                if(arr[i] == arr[j]) {
                    count++;
                }
                if(count == 2) {
                    break;
                }
            }
            if(j == arr.length) {
                System.out.println(arr[i] + ", 下标是: " + i);
            }
        }
    }
}*/

/*//求斐波那契数列的第n项。(迭代实现) 
import java.util.Scanner;
public class Working{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int sum=Feibo(n);
        System.out.println(sum);
        sc.close();
    }
    public static int Feibo(int n){
        int sum=0;
        int n1;
        int n2;
        if(n1||n2){
            sum=n;
        }int a=1;int b=1;
        for(int i=3;i<=n;i++){
            sum=a+b;
            a=b;
            b=sum;
        }
        return sum;
    }
}*/

public class Person{

    private String name = "Person";

    int age=0;

}

public class Child extends Person{

    public String grade;

    public static void main(String[] args){

        Person p = new Child();

        System.out.println(p.name);

    }

}