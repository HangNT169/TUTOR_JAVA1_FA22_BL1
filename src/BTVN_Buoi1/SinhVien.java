package BTVN_Buoi1;

import java.util.Scanner;

public class SinhVien {

    public static void main(String[] args) {
        //Tạo đối tượng scanner
        Scanner scan = new Scanner(System.in);
        //Khai báo biến
        String tenSv;
        int tuoi;
        String diaChi;
        double diem;
        String xepLoai;
        int gioiTinh;
        String checkGt;
        
        //Nhập thông tin
        System.out.println("Nhập thông tin sinh viên");
        System.out.print("Mời nhập tên sinh viên : ");
        tenSv = scan.nextLine();
        System.out.print("Mời nhập tuổi sinh viên : ");
        tuoi = scan.nextInt();
        scan.nextLine();
        System.out.print("Mời nhập địa chỉ : ");
        diaChi = scan.nextLine();
        //Check và nhập điểm từ 0-10
        do {
            System.out.print("Mời nhập điểm : ");
            diem = scan.nextDouble();
        } while (diem < 0 || diem > 10);
        do {
            System.out.print("Mời nhập giới tính (1:Nam - 2:Nữ) : ");
            gioiTinh = scan.nextInt();
        } while (gioiTinh < 1 || gioiTinh > 2);
        
        //In giới tính là nam hoặc nữ
        checkGt = gioiTinh == 1 ? "Nam" : "Nữ";
        
        //Xếp loại bằng điểm
        if (diem >= 9) {
            xepLoai = "Xuất Sắc";
        } else if (diem >= 8) {
            xepLoai = "Giỏi";
        } else if (diem >= 7) {
            xepLoai = "Khá";
        } else if (diem >= 6) {
            xepLoai = "TB Khá";
        } else if (diem >= 5) {
            xepLoai = "Trung Bình";
        } else {
            xepLoai = "Yếu";
        }
        //In thông tin
        System.out.println("/n-----------------");
        System.out.println("Thông tin sinh viên");
        System.out.println("Tên : " + tenSv);
        System.out.println("Tuổi : " + tuoi);
        System.out.println("Địa chỉ  : "+ diaChi);
        System.out.println("Điểm : "+diem);
        System.out.println("Xếp Loại : "+xepLoai);
        System.out.println("Giới tính : "+checkGt);

    }
}
