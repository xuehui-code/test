import java.util.Scanner;

public class Switch {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int a = 0;
        if((x <= 100) && (x >= 90)){
            a = 1;
        }else if((x < 90) && (x >= 80)){
            a = 2;
        }else if((x < 80) && (x >= 70)){
            a = 3;
        }else if((x < 70) && (x >= 60)){
            a = 4;
        }

        switch (a){
            case 1:
                System.out.println("A");
                break;
            case 2:
                System.out.println("B");
                break;
            case 3:
                System.out.println("C");
                break;
            case 4:
                System.out.println("D");
                break;
            default:
                System.out.println("不及格");
        }
    }
}
