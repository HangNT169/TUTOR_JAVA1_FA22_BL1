
package BTVN_Buoi3;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        ArrayList<SinhVien> dssv=new ArrayList<>();
       ArrayList<GiangVien> dsgv=new ArrayList<>();
       //Tạo ra đối tượng sinh viên với đầy đủ tham số truyền vào
       SinhVien sv1=new SinhVien("SV01","Nguyễn Văn A", 18, 9);
       SinhVien sv2=new SinhVien("SV02","Nguyễn Văn B", 19, 8.5);
       SinhVien sv3=new SinhVien("SV03","Nguyễn Văn C", 19, 8);
       SinhVien sv4=new SinhVien("SV04","Nguyễn Thị D", 18, 7);
       SinhVien sv5=new SinhVien("SV05","Nguyễn Văn D", 20, 6.5);
       //Add các sinh viên vào list
       dssv.add(sv1);
       dssv.add(sv2);
       dssv.add(sv3);
       dssv.add(sv4);
       dssv.add(sv5);
       //Duyệt list
       for(SinhVien sv:dssv){
           sv.inTT();
           System.out.println("-------------------");
       }
       //Làm tương tự với giảng viên
       
       
    }
}
