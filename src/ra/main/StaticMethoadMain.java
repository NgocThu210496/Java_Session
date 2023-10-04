package ra.main;

import ra.entity.StaticMethod;

public class StaticMethoadMain {
    public static void main(String[] args) {
       double R= 3.5;
       double area = StaticMethod.calCircleArea(R);
       System.out.printf("Diện tích hình tròn: %.2f", area);
        double width=2.5;
        double height = 6.0;
        double cRLArea = StaticMethod.calRectangleArea(width,height);
        System.out.printf("\nDiện tích hình chữ nhật: %.2f", cRLArea);
        double a=4.5;
        double b=7;
        double c=6;
        double cTLArea= StaticMethod.calTriangleArea(a,b,c);
        System.out.printf("\nDiện tích hình tam giác : %.2f", cTLArea);
    }
}
