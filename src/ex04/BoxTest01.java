package ex04;

 class Box1{
    int width;
    int length;
    int height;
    double getVoume(){ return(double) width*height*length;}
}
public class BoxTest01 {
    public static void main(String[] args) {
        Box1 b;
        b = new Box1();
        b.width = 20;
        b.length = 20;
        b.height = 30;
        System.out.println("상자의 가로, 세로, 높이는 " + b.width + "," +
                b.length + "," + b.height + "입니다.");
        System.out.println("상자의 부피는 " + b.getVoume() + "입니다.");
    }
}
