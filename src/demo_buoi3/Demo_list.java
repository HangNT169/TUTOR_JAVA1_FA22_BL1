package demo_buoi3;

import java.util.ArrayList;
import java.util.Scanner;

public class Demo_list {

    public static void main(String[] args) {
        ArrayList<SinhVien> list = new ArrayList<>();
        //Tạo ra 1 đối tượng sinh viên
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
        
        //add vào list
        list.add(sv3);
        System.out.println("");
        System.out.println("------");
        
        for (SinhVien sinhVien : list) {
            sinhVien.inThongTin();
        }
    }
}
