package demo_buoi5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class QLHQ {

    ArrayList<HoaQua> list = new ArrayList<>();
    Scanner sc = new Scanner(System.in);
    int chon;

    public void menu() {
        while (true) {
            System.out.println("\n\n-----------Menu------------");
            System.out.println("1, Nhập danh sách");
            System.out.println("2, Xuất danh sách");
            System.out.println("3, Cập nhật thông tin ");
            System.out.println("4, Tìm hoa quả theo tên nhập vào");
            System.out.println("5, Sắp xếp hoa quả theo nguồn gốc giảm dần ");
            System.out.println("6, Xóa hoa quả theo mã nhập vào");
            System.out.println("7, NhapKhau");
            System.out.println("8, Tìm hoa quả có đơn giá lớn nhất ");
            System.out.println("9, Thoát");
            System.out.print("Mời bạn chọn chương trình : ");
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
                    sua();
                    break;
                case 4:
                    tim();
                    break;
                case 5:
                    sapxep();
                    break;
                case 6:

                    break;
                case 7:

                    break;
                case 8:

                    break;
                case 9:

                    break;
                default:
                    System.out.print("Không có chương trình !!!");
            }
            if (chon == 9) {
                System.out.println("Tạm biệt quý khách !!!");
                break;
            }
        }
    }

    public void nhap() {
        for (int i = 0;; i++) {
            HoaQua hq = new HoaQua();
            hq.input();
            list.add(hq);
            System.out.print("Bạn có muốn nhập tiếp không (Y/N): ");
            String x = sc.nextLine();
            if (x.equalsIgnoreCase("N")) {
                System.out.println("Nhập Thành Công !!!");
                break;
            }
        }
    }

    public void xuat() {
        for (HoaQua hq : list) {
            hq.inThongTin();
        }
    }

    public void sua() {
        System.out.print("Nhập mã hoa quả muốn đổi : ");
        String ma = sc.nextLine();
        int check = 0;
        for (HoaQua hq : list) {
            if (hq.getMaHq().equalsIgnoreCase(ma)) {
                hq.input();
                check = 1;
            }
        }
        if (check == 0) {
            System.out.println("Không tìm thấy hoa quả !!");
        } else {
            System.out.println("Đã thay đổi");
        }
    }

    public void tim() {
        int none = 0;
        System.out.print("Mời bạn nhập tên hoa quả muốn tìm : ");
        String check = sc.nextLine();
        for (HoaQua hq : list) {
            if (check.equalsIgnoreCase(hq.getTenHq())) {
                hq.inThongTin();
                none = 1;
            }
        }
        if (none == 0) {
            System.out.println("Không tồn tại hoa quả tên : " + check + " !!!");
        }
    }

    void sapxep() {
        Comparator<HoaQua> comp = new Comparator<HoaQua>() {
            @Override
            public int compare(HoaQua o1, HoaQua o2) {
                return o1.getTenHq().compareToIgnoreCase(o2.getTenHq());
            }
        };
        Collections.sort(list, comp);
        Collections.reverse(list);
        this.xuat();
    }
}
