 //Tinh tong cac so tu 1 den n, voi n la so nguyen

import java.util.Scanner;

public class Bai3 {
    public static void main(String[] args) {
        //Chia cap: cong dau cuoi nhan voi so cap
        //Khong dung vong lap for
        //n=1; 1 2 3 4 5 6 7 8 9 10
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap so nguyen n: ");
        int n=scanner.nextInt();
        int tong=0;
        if(n%2==0){
            tong+=(1+n)*n/2;
        }
        else{
            tong+=(1+(n-1))*(n/2+1);
        }
        System.out.println("Tong: "+ tong);
        scanner.close();
       

    }
}
