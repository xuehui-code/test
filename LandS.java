import java.util.Scanner ;
public class LandS {
    static class Circle{
        private double Radius;
        public void setRadius(double r)
        {
            this.Radius=r;
        }
        public Circle(){
            this.Radius = 0;
        }
        public void Circle(double Radius) {
            this.Radius = Radius;
        }
        public double getRadius()
        {
            return Radius;
        }
        public double getArea(double Radius){
            return 3.14 * this.Radius * this.Radius;
        }
        public double getPerimeter(double Radius){
            return 3.14 * 2 * this.Radius;
        }
        public void  show(){
            Scanner cin=new Scanner(System.in);
            System.out.println("请输入半径:");
            this.setRadius(cin.nextDouble());
            System.out.println("Radius:" + this.Radius);
            System.out.println("area:" + this.getArea(Radius));
            System.out.println("Perimeter：" + this.getPerimeter(Radius));
        }
    }
    public static void main(String[] args){
        Circle cl = new Circle();
        cl.show();
    }
}