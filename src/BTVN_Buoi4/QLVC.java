package BTVN_Buoi4;

import java.util.ArrayList;
import java.util.Scanner;

public class QLVC {

    ArrayList<Vaccine> list = new ArrayList<>();
    Scanner sc = new Scanner(System.in);
    int chon;

    public void menu() {
        while (true) {
            System.out.println("\n\n---------Menu---------");
            System.out.println("1,Nhập danh sách");
            System.out.println("2,Xuất danh sách");
            System.out.println("3,Tìm theo tên");
            System.out.println("4,Tìm theo khoảng thời gian tác dụng");
            System.out.println("5,Thoát");
            System.out.println("-----------------------");
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
                    tim();
                    break;
                case 4:
                    timKhoang();
                    break;
                case 5:
                    break;
                default:
                    System.out.print("Không có chương trình !!!");
            }
            if (chon == 5) {
                System.out.println("Tạm biệt quý khách !!!");
                break;
            }
        }
    }

    public void nhap() {
        for (int i = 0; i < 10; i++) {

            System.out.print("Mời bạn nhập mã Vaccine : ");
            String ma = sc.nextLine();
            System.out.print("Mời bạn nhập tên Vaccine : ");
            String ten = sc.nextLine();
            System.out.print("Mời bạn nhập thời gian tác dụng : ");
            float tg = sc.nextFloat();
            sc.nextLine();
            System.out.print("Mời bạn nhập ngày hết hạn : ");
            String nhh = sc.nextLine();
            Vaccine vc = new Vaccine(ma, ten, tg, nhh);
            list.add(vc);
            System.out.print("Bạn có muốn nhập tiếp không (Y/N): ");
            String x = sc.nextLine();
            if (x.equalsIgnoreCase("N")) {
                System.out.println("Nhập Thành Công !!!");
                break;
            }
        }

    }

    public void xuat() {
        for (Vaccine vc : list) {
            vc.inThongTin();
        }
    }
    
    public void tim() {
        int none =0;
        System.out.print("Mời bạn nhập tên Vaccine muốn tìm : ");
        String check = sc.nextLine();
        for (Vaccine vc : list) {
            if (check.equalsIgnoreCase(vc.getTenVc())) {               
               vc.inThongTin();
               none=1;
            }
        }
        if(none==0){
            System.out.println("Không tồn tại Vaccine tên : "+check+" !!!");
        }
    }
    
     public void timKhoang() {
         int none =0;
        System.out.print("Nhập thời gian TD Min : ");
        double min = sc.nextDouble();
        System.out.print("Nhập thời gian TD Max : ");
        double max = sc.nextDouble();
        for (Vaccine vc : list) {
            if(vc.getThoiGianTacDung()>=min&&vc.getThoiGianTacDung()<=max){
                System.out.println("Vaccine có thời gian tác dụng từ "+min+"-"+max);
                vc.inThongTin();
                none= 1;
            }
        }
        if(none==0){
            System.out.println("Không tồn tại Vaccine có thời gian tác dụng từ "+min+"-"+max);
        }
    }
}
