import java.util.Scanner ;

public class LSandV {
    static class Circle{
        private double Radius;
        public void setRadius(double r)
        {
            this.Radius=r;
        }
        public Circle(){
            this.Radius = 0;
        }
        public Circle(double Radius) {
            this.Radius = Radius;
        }
        public double getRadius()
        {
            return Radius;
        }
        public double getArea(){
            double r = this.Radius;
            return r*r*3.14;
        }
        public double getPerimeter(){
            return 3.14 * 2 * this.Radius;
        }
        public void  show(){
            Scanner cin=new Scanner(System.in);
            System.out.println("请输入半径:");
            this.setRadius(cin.nextDouble());
            System.out.println("Radius:" + this.Radius);
            System.out.println("area:" + this.getArea());
            System.out.println("Perimeter：" + this.getPerimeter());
        }
    }
    static class Cylinder extends Circle{
        private double hight;
        public void  setHight(double h){
            this.hight = h;
        }
        Cylinder (double r, double  h){
            this.hight = h;
            this.setRadius(r);
        }
        public double getHeight(){
            return hight;
        }
        public double getVolume(){
            return this.getArea() * this.hight;
        }
        public void  showVolume(){
            Scanner cin=new Scanner(System.in);
            System.out.println("请输入底面圆半径:");
            this.setRadius(cin.nextDouble());
            System.out.println("请输入高:");
            this.setHight(cin.nextDouble());
            System.out.println("底面半径="+this.getRadius());
            System.out.println("高="+this.getHeight());
            System.out.println("圆柱的体积="+this.getVolume());
        }
    }
    public static void main(String[] args){
        Circle cl = new Circle();
        cl.show();
        Cylinder cd = new Cylinder(2.0,3.0);
        cd.showVolume();
    }
}