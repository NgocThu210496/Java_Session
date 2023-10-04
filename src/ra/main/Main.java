package ra.main;

import ra.entity.MyClass;

//Tạo lớp Main có phương thức main()
public class Main {
    public static void main(String[] args) {
        //Khởi tạo 1 đối tượng từ lớp MyClass và hiển thị giá trị thuộc tính myString
        MyClass myObject=new MyClass("Hello, Thu");
        System.out.println("Giá trị ban đầu của myString: " + myObject.getMyString());
        //Thay đổi giá trị thuộc tính myString của đối tượng vừa tạo, sau đó hiển thị lại giá trị mới.

        myObject.setMyString("Thu đã được thay dổi giá trị mới là Ngọc Thư ");
        System.out.println("Giá trị myString đã được thay đổi: " + myObject.getMyString());
    }
}
