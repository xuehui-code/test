public class Rectangle {
    private double width;
    private double height;
    private String color;
    public double getWidth() {
        return width;
    }
    public double getHeight() {
        return height;
    }
    public String getColor() {
        return color;
    }
    public double getArea(){
        return this.height*this.width;
    }
    public double getPerimeter(){
        return (this.height+this.width)*2;
    }

    public void setWidth(double width) {
        this.width=width;
    }
    public void setHeight(double height) {
        this.height=height;
    }
    public void setColor(String color) {
        this.color=color;
    }

    public Rectangle(double width,double height,String color) {
        this.width=width;
        this.height=height;
        this.color=color;
    }

    public static void main(String[] args) {
        Rectangle rec=new Rectangle(7,9,"black");
        System.out.println("矩形的高是"+rec.getHeight()+"米");
        System.out.println("矩形的宽是"+rec.getWidth()+"米");
        System.out.println("矩形的颜色是"+rec.getColor());
        System.out.println("矩形的面积是"+rec.getArea()+"平方米");
        System.out.println("矩形的周长是"+rec.getPerimeter()+"米");
    }

}