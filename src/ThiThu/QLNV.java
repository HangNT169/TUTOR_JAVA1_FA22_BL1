package ThiThu;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class QLNV {

    ArrayList<NhanVien> list = new ArrayList<>();
    Scanner sc = new Scanner(System.in);
    int chon;

    public void menu() {
        while (true) {
            System.out.println("--------Menu--------");
            System.out.println("1, Nhập danh sách nhân viên");
            System.out.println("2, Xuất danh sách nhân viên");
            System.out.println("3, Tìm nhân viên theo khoảng số ngày làm việc nhập từ bàn phím");
            System.out.println("4, Sắp xếp danh sách theo tên nhân viên");
            System.out.println("5, Sắp xếp danh sách theo lương");
            System.out.println("6, Kế thừa");
            System.out.println("0, Thoát");
            System.out.print("Mời bạn chon chương trình : ");
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
                    timKhoang();
                    break;
                case 4:
                    sapxep();
                    break;
                case 5:
                    sapXepluong();
                    break;
                case 6:
                    kethua();
                    break;
                case 0:

                    break;

                default:
                    System.out.print("Không có chương trình !!!");
            }
            if (chon == 0) {
                System.out.println("Tạm biệt quý khách !!!");
                break;
            }
        }
    }

    public void nhap() {
        for (int i = 0;; i++) {
            System.out.print("Mời bạn nhập mã : ");
            String ma = sc.nextLine();
            System.out.print("Mời bạn nhập tên : ");
            String ten = sc.nextLine();
            System.out.print("Mời bạn nhập lương : ");
            double luong = sc.nextDouble();
            sc.nextLine();
            System.out.print("Mời bạn nhập địa chỉ : ");
            String dc = sc.nextLine();
            System.out.print("Mời bạn nhập số ngày làm việc : ");
            int snlv = sc.nextInt();
            NhanVien nv = new NhanVien(ma, ten, luong, dc, snlv);
            list.add(nv);
            System.out.print("Bạn có muốn nhập tiếp không (Y/N) ? : ");
            String x = sc.nextLine();
            if (x.equalsIgnoreCase("n")) {
                System.out.println("Nhập Thành Công !!!");
                break;
            }
        }
    }

    public void xuat() {
        for (NhanVien nv : list) {
            nv.inThongTin();
            System.out.println("----------------------");
        }
    }

    public void timKhoang() {
        System.out.print("Mời bạn nhập số ngày làm Min : ");
        int min = sc.nextInt();
        System.out.print("Mời bạn nhập số ngày làm Max : ");
        int max = sc.nextInt();
        int check = 0;
        for (NhanVien nv : list) {
            if (nv.getSoNgayLamViec() >= min && nv.getSoNgayLamViec() <= max) {
                nv.inThongTin();
                check = 1;
            }
        }
        if (check == 0) {
            System.out.println("Không tông tại nhân viên có số ngày làm việc từ " + min + " đến " + max);
        } else {
            System.out.println("Nhân Viên Bạn Muốn Tìm !!!");
        }
    }

    void sapxep() {
        Comparator<NhanVien> comp = new Comparator<NhanVien>() {
            @Override
            public int compare(NhanVien o1, NhanVien o2) {
                return o1.getTenNv().compareToIgnoreCase(o2.getTenNv());
            }
        };
        Collections.sort(list, comp);
        System.out.println("Danh sách sắp xếp theo tên : ");
        xuat();
    }

    void sapXepluong() {
        Comparator<NhanVien> comp = new Comparator<NhanVien>() {
            @Override
            public int compare(NhanVien o1, NhanVien o2) {
                return Double.compare(o1.getLuong(), o2.getLuong());
            }
        };
        Collections.sort(list, comp);
        Collections.reverse(list);
        System.out.println("Danh sách sắp xếp theo lương : ");
        xuat();
    }

    public void kethua() {
        NhanVienVanphong nvvp = new NhanVienVanphong("NV99", "Quang Anh", 20000, "Hà Nội", 22, 5);
        nvvp.inThongTin();
    }
}
