import java.util.Scanner;

public class qiannhe {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        if(x<=0){
            System.out.println("输入的数据有错误！");
        }
        int res = 0;
        for(int i=1;i<=x;i++){
            res += i;
        }
        System.out.println(res);
    }
}
