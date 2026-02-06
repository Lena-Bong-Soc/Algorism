//Bai 1
//Input: mot so nguyen n(n co the am)
//Output: 1. So luong chu so cua |n| (neu n=0 thi la 1)
//2. Tong cac chu so cua |n|
//So dao cua n (giu so am neu co)

import java.util.Scanner;

public class Bai1 {
   public static void main(String[] args) {
    Scanner scanner= new Scanner(System.in);

    //Input so nguyen n
    System.out.println("Nhap so n: ");
    int n = scanner.nextInt();

    //So luong chu so cua n
    //abs cua n
    //Chuyen qua string roi lay n.length
    String [] chars = String.valueOf(Math.abs(n)).split("");
    System.out.println(chars.length);

    //Tong cac chu so cua n
    //+ cac chu so trong array chars
    int tong=0;
    for(String x:chars){
        tong+=Integer.parseInt(x);
    }
    System.out.println("Tong bang: " +tong);

    //3. Dao so truoc
    //Neu la so am thi nhan voi -1
   String reversed="";
    for(int i=chars.length-1;i>=0;i--){
        reversed+=chars[i];
    }
    int result;
    if(n<0){
        result=-1*(Integer.parseInt(reversed));
    }
    else{
        result=Integer.parseInt(reversed);
    }
    System.out.println("Reversed: "+ result);

    scanner.close();

    


    

   } 
}
