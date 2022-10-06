
package demo_buoi1;

import java.util.Scanner;


public class KieuDuLieu {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String MaNv="PH28990";
        int a,b,c=5;
        System.out.println("Hello Poly");
        //có 3 kiểu xuất ra màn hình:
        // xuất có xuống dòng
        System.out.println(MaNv);
        //xuất không xuống dòng
        System.out.print("Hello ");
        System.out.print("PoLy");
        System.out.println("");
        //xuất có định dạng
//        System.out.printf();
        
        //Nhập từ bàn phím
        String ma;
        int tuoi;
        double diem;
        System.out.println("Mời bạn nhập tuổi:");
        tuoi=Integer.parseInt(sc.nextLine());//nhập số nguyên
        System.out.printf("Tuổi:%d",tuoi);
        System.out.println("");
//        sc.nextLine(); chống trôi lệnh
        System.out.println("Mời bạn nhập mã sinh viên:");
        ma=sc.nextLine();//nhập chuỗi
        System.out.printf("Mã sinh viên:%s",ma);
        System.out.println("");
        System.out.println("Mời nhập điểm:");
        diem=sc.nextDouble();//nhập số thực
        System.out.printf("điểm:%.2f",diem);//xuất có định dạng
        System.out.println("");
        
    }
    
}
