/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package demo_buoi3;

import java.util.Scanner;

/**
 *
 * @author kazee
 */
public class Main {
    public static void main(String[] args) {
//        SinhVien sv = new SinhVien("Quang Anh",19,"PH29035");
//        SinhVien sv1 = new SinhVien("Phương Anh",19,"PH28990");
//        sv.inThongTin();
//        sv1.inThongTin();
        Scanner sc = new Scanner(System.in);
        SinhVien sv3 = new SinhVien();
        System.out.println("Mời nhập tên : ");
        String ten = sc.nextLine();
        System.out.println("Mời nhập tuổi : ");
        int tuoisv = sc.nextInt();
        sc.nextLine();
//          int tuoisv = Integer.parseInt(sc.nextLine());
        System.out.println("Nhập Mã Sv : ");
        String ma = sc.nextLine();
        
        sv3.setTenSv(ten);
        sv3.setTuoi(tuoisv);
        sv3.setMaSv(ma);
        
        sv3.inThongTin();
    }
}
