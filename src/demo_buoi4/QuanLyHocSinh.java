package demo_buoi4;

import java.util.ArrayList;
import java.util.Scanner;

public class QuanLyHocSinh {

    Scanner sc = new Scanner(System.in);
    ArrayList<HocSinh> list = new ArrayList<>();

    //Tao Menu
    public void menu() {
        while (true) {
            int chon;
            System.out.println("\n\n-------MENU--------");
            System.out.println("1, Nhap");
            System.out.println("2, Xuat");
            System.out.println("3, Tim theo ten");
            System.out.println("4, Tim theo khoang");
            System.out.println("0, Thoat");
            System.out.println("-------------------");
            System.out.println("Moi ban chon chuong trinh : ");
            chon = sc.nextInt();
            sc.nextLine();
            switch (chon) {
                case 1:
                    nhap();
                    break;
                case 2:
                    xuat();
                    break;
                case 3:
                    tim();
                    break;
                case 4:
                    timKhoang();
                    break;
                case 0:
                    System.exit(0);
                default:
                    System.out.println("Khong co chuong trinh !!!");
            }
        }
    }

    //Nhap
    public void nhap() {
        for (int i = 0;; i++) {
            System.out.println("Moi nhap ten : ");
            String ten = sc.nextLine();
            System.out.println("Moi nhap tuoi : ");
            int tuoi = sc.nextInt();
            System.out.println("Moi nhap diem : ");
            double diem = sc.nextDouble();
            sc.nextLine();
            System.out.println("Moi nhap dia chi");
            String dc = sc.nextLine();
            HocSinh dt = new HocSinh(ten, tuoi, diem, dc);
            list.add(dt);
            //list.add(new HocSinh(ten, tuoi, diem, dc));
            System.out.println("Ban co muon nhap tiep khong (Y/N) : ");
            String x = sc.nextLine();
            if (x.equalsIgnoreCase("N")) {
                System.out.println("Nhap Thanh Cong");
                break;
            }
        }
    }

    //Xuat
    public void xuat() {
        for (HocSinh hocSinh : list) {
            hocSinh.inThongTin();
            System.out.println("--------------");
        }
    }

    //Tim
    public void tim() {
        System.out.println("Moi ban nhap ten muon tim : ");
        String check = sc.nextLine();
        for (HocSinh hocSinh : list) {
            if (check.equalsIgnoreCase(hocSinh.getTenHS())) {
                System.out.println("Thong Tin Hoc Sinh : ");
                hocSinh.inThongTin();
            } else {
                System.out.println("Khong Co Hoc Sinh !!!");
            }
        }
    }

    //Tim theo khoang 
    public void timKhoang() {
        System.out.println("Nhap diem min : ");
        double min = sc.nextDouble();
        System.out.println("Nhap diem max : ");
        double max = sc.nextDouble();
        for (HocSinh hocSinh : list) {
            if(hocSinh.getDiem()>=min&&hocSinh.getDiem()<=max){
                System.out.println("Hoc sinh co diem tu "+min+"-"+max);
                hocSinh.inThongTin();
            }
        }
    }
}
