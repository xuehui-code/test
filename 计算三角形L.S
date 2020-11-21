import java.io.*;

public class Main{
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        String[] scores = str.split(" ");
        double a = Double.parseDouble(scores[0]);
        double b = Double.parseDouble(scores[1]);
        double c = Double.parseDouble(scores[2]);
        double L = a+b+c;
        double p = L/2;
        double S = Math.sqrt(p*(p-a)*(p-b)*(p-c));
        System.out.printf("circumference=%.2f area=%.2f",L,S);
    }
}
