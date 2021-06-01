import java.io.*;
import java.util.Arrays;
import java.util.Scanner ;
public class wenjian {
    public static void main(String[] args)throws Exception{
        writeFile();
        System.out.println("success!");

        ReadFile();
        Change();
    }
    public static void writeFile()
    {
        FileOutputStream fos = null;
        DataOutputStream dos = null;
        BufferedOutputStream bos = null;
        try {
            fos = new FileOutputStream("Studentsdata.txt");
            bos = new BufferedOutputStream(fos);
            dos = new DataOutputStream(bos);
            System.out.println("请输入3个学生的成绩(0~100):");
            float x;
            for(int i=1;i<=3;i++)
            {
                Scanner in = new Scanner(System.in);
                x = in.nextFloat();
                if(x<= 100 && x>=0)
                {
                    dos.writeFloat(x);
                }else {
                    System.out.println("输入的数不在范围之内，重新输入:");
                    i--;
                }
            }
            System.out.println("输入结束！");
        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            try {
                dos.close();
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
    }

    public static void ReadFile() {
        try(DataInputStream dis = new DataInputStream(new BufferedInputStream(new FileInputStream("Studentsdata.txt")))) {
            float a[] = new float[3], b, sum=0,ave;
            for(int i=0; i<3;i++)
            {
                a[i] = dis.readFloat(); sum += a[i];
                System.out.print(a[i]+" ");
            }
            ave =sum/3;
            System.out.println("\n3个学生的平均成绩："+ave);
            System.out.println("排序后的成绩：");
            Arrays.sort(a);
            for(float num : a)
            {
                System.out.print(num+" ");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void Change() {
        try(DataInputStream dis = new DataInputStream(new BufferedInputStream(new FileInputStream("data.txt")))) {
            float a[] = new float[3],sum=0,ave;
            for(int i=0; i<3;i++)
            {
                a[i] = dis.readFloat();
                sum +=a[i];
            }
            ave=sum/3;
            a[2] = ave;
            System.out.print("修改后的数据：\n");
            for(float num : a)
            {
                System.out.print(num+" ");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
