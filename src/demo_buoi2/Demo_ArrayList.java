package demo_buoi2;

import java.util.ArrayList;

public class Demo_ArrayList {

    public static void main(String[] args) {
        //Khong dinh kieu
        ArrayList ds = new ArrayList();
        //Khai bao phan tu mang
        ds.add("Hello");
        ds.add(1);
        ds.add(true);
        //In ra mang
        System.out.println(ds);
        //In ra so phan tu trong mang
        System.out.println("So phan tu trong mang : "+ds.size());
        
        //DInh kieu       
        ArrayList<String> list = new ArrayList<>();
        list.add("Helo Poly");
        list.add("1");
        list.add("FPT Polytechnic");
        list.add("FPT");
        //dung vong for de in phan tu trong mang
        System.out.println(list.get(0));
        for(int i=0;i<list.size();i++){
            System.out.println(list.get(i));
        }
        //dung vong for de in phan tu trong mang
//        for (<kiểu dữ liệu> <tên biến chạy> : <tên mảng>) {
//
//    <Khối lệnh lặp lại>
//
//}
        for(String comp : list){
            System.out.println(comp);
        }
    }
}
