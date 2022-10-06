
package demo_buoi1;

import java.util.Scanner;


public class CauDieuKien {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        double diem;
        System.out.println("Mời nhập điểm:");
        diem=sc.nextDouble();
//        //if else
        if(diem>9){
            System.out.println("Xuất sắc");
        }else if(diem>8){
            System.out.println("giỏi");
        }else if(diem>5){
            System.out.println("Khá");
        }else{
            System.out.println("Kém");
        }
        //toán tử 3 ngôi
        int gtinh;
        do{
        System.out.println("Mời nhập giới tính");
        gtinh=sc.nextInt();
        }while(gtinh<1 || gtinh>2);
        String gt= gtinh==1?"Nam":"Nữ";
        System.out.println(gt);
        
    }
}
