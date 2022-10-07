package BTVN_Buoi1;

public class VongLap {

    public static void main(String[] args) {
        int tong = 0;
        int tich = 1;
//        for (int i = 1; i < 11; i++) {         
//            tong += i;
//            tich *= i;
//        }
       int i=1;
       while(i<11){
              tong += i;
              tich *= i;
              i++;          
       }
        System.out.println("Tổng các số từ 1 đến 10 : "+tong);
        System.out.println("Tích các số từ 1 đến 10 : "+tich);
    }
}
