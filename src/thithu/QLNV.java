
package thithu;

import java.util.ArrayList;
import java.util.Scanner;


public class QLNV {
    ArrayList<NhanVien> list=new ArrayList<>();
    void menu(){
        Scanner sc=new Scanner(System.in);
        int chon;
        while(true){
            System.out.println("=================MENU============");
            System.out.println("1. Nhập danh sách nhân viên");
            System.out.println("2. Xuất danh sách nhân viên");
            System.out.println("3. Tìm nhân viên theo khoảng số ngày làm việc");
            System.out.println("4. Sắp xếp danh sách nhân viên theo tên");
            System.out.println("5. Sắp xếp danh sách nhân viên theo lương giảm dần");
            System.out.println("6. Kế thừa");
            System.out.println("0. Thoát");
            System.out.println("==================================");
            System.out.println("Mời ch");
        }
    }
}
