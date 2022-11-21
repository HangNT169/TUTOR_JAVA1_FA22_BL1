
package thithu;

import java.util.Scanner;


public class NhanVien {
    private String MaNv;
    private String TenNv;
    private double Luong;
    private String DiaChi;
    private int SoNgayLamViec;

    public NhanVien() {
    }

    public NhanVien(String MaNv, String TenNv, double Luong, String DiaChi, int SoNgayLamViec) {
        this.MaNv = MaNv;
        this.TenNv = TenNv;
        this.Luong = Luong;
        this.DiaChi = DiaChi;
        this.SoNgayLamViec = SoNgayLamViec;
    }

    public String getMaNv() {
        return MaNv;
    }

    public void setMaNv(String MaNv) {
        this.MaNv = MaNv;
    }

    public String getTenNv() {
        return TenNv;
    }

    public void setTenNv(String TenNv) {
        this.TenNv = TenNv;
    }

    public double getLuong() {
        return Luong;
    }

    public void setLuong(double Luong) {
        this.Luong = Luong;
    }

    public String getDiaChi() {
        return DiaChi;
    }

    public void setDiaChi(String DiaChi) {
        this.DiaChi = DiaChi;
    }

    public int getSoNgayLamViec() {
        return SoNgayLamViec;
    }

    public void setSoNgayLamViec(int SoNgayLamViec) {
        this.SoNgayLamViec = SoNgayLamViec;
    }
    void nhap(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Mời nhập mã nhân viên: ");
        MaNv=sc.nextLine();
        System.out.println("Mời nhập tên nhân viên: ");
        TenNv=sc.nextLine();
        System.out.println("Mời nhập lương: ");
        Luong=Double.parseDouble(sc.nextLine());
        System.out.println("Mời nhập địa chỉ: ");
        DiaChi=sc.nextLine();
        System.out.println("Mời nhập số ngày làm việc: ");
        SoNgayLamViec=Integer.parseInt(sc.nextLine());
    }
    void inThongTin(){
        System.out.println("Mã NV: "+MaNv);
        System.out.println("Tên NV: "+TenNv);
        System.out.println("Lương: "+Luong);
        System.out.println("Địa chỉ: "+DiaChi);
        System.out.println("Số ngày làm việc: "+SoNgayLamViec);
    }
}
