
package demo_buoi1;

import java.util.Scanner;


public class VongLap {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        //for
        //for(bien bắt đầu;điều kiện kết thúc; bước nhảy)
        
        for(int i=1;i<=10;i++){
            System.out.println(i);
        }
        
        //do...while
        int n;
        do{
            System.out.println("Nhập số nguyên dương n:");
            n=sc.nextInt();
        }while(n<0);
        
        //while
        int i=1;
        while(i<=10){
            System.out.println(i);
            i++;
        }
    }
}
