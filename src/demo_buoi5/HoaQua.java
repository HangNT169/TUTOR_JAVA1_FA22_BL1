package demo_buoi5;

import java.util.Scanner;

public class HoaQua {

    private String MaHq;
    private String TenHq;
    private double DonGia;
    private String NguonGoc;

    public HoaQua() {
    }

    public HoaQua(String MaHq, String TenHq, double DonGia, String NguonGoc) {
        this.MaHq = MaHq;
        this.TenHq = TenHq;
        this.DonGia = DonGia;
        this.NguonGoc = NguonGoc;
    }

    public String getMaHq() {
        return MaHq;
    }

    public void setMaHq(String MaHq) {
        this.MaHq = MaHq;
    }

    public String getTenHq() {
        return TenHq;
    }

    public void setTenHq(String TenHq) {
        this.TenHq = TenHq;
    }

    public double getDonGia() {
        return DonGia;
    }

    public void setDonGia(double DonGia) {
        this.DonGia = DonGia;
    }

    public String getNguonGoc() {
        return NguonGoc;
    }

    public void setNguonGoc(String NguonGoc) {
        this.NguonGoc = NguonGoc;
    }

    public void inThongTin() {
        System.out.println("Thông Tin Hoa Quả : ");
        System.out.println("Mã : " + MaHq);
        System.out.println("Tên : " + TenHq);
        System.out.println("Giá : " + DonGia);
        System.out.println("Nguồn Gốc : " + NguonGoc);
    }

    public void input() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Mời bạn nhập mã hoa quả: ");
        MaHq = sc.nextLine();
        System.out.print("Mời bạn nhập tên hoa quả : ");
        TenHq = sc.nextLine();
        System.out.print("Mời bạn nhập đơn giá : ");
        DonGia = sc.nextDouble();
        sc.nextLine();
        System.out.print("Mời bạn nhập nguồn gốc : ");
        NguonGoc = sc.nextLine();
    }

    @Override
    public String toString() {
        return "HoaQua{" + "MaHq=" + MaHq + ", TenHq=" + TenHq + ", DonGia=" + DonGia + ", NguonGoc=" + NguonGoc + '}';
    }
    
}
