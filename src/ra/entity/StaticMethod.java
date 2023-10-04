package ra.entity;

public class StaticMethod {
    private static Double PI=3.14;

    public StaticMethod() {
    }

    public static Double getPI() {
        return PI;
    }

    public static void setPI(Double PI) {
        StaticMethod.PI = PI;
    }
    public static double calCircleArea(double R){ //tính diện tích hình tròn.
        return PI * R * R;
    }
    public static double calRectangleArea(double width,double height){//tính diện tích hình chữ nhật.
        return width * height;
    }
    public static double calTriangleArea (double a, double b, double c){ //tính diện tích của tam giác
        double s = (a + b + c) / 2;
        return Math.sqrt(s * (s - a) * (s - b) * (s - c));
    }
}
