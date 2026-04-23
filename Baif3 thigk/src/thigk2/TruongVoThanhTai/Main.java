package thigk2.TruongVoThanhTai;
import java.util.Random;
import java.util.Scanner;
public class Main {
    public static void main(String[] args){
// Khai báo hàm scanner
        Scanner sc = new Scanner(System.in);
        // Tạo mảng
        int[] ar = new int[100];
        // Nhap mang
        for(int i = 0; i < 100; i++){
            System.out.print("Nhap arr[" + i + "] = ");
            ar[i] = sc.nextInt();
        }
        // Nhap X
        System.out.print("Nhap X: ");
        int x = sc.nextInt();
        // Tim X
        boolean found = false;
//Tìm X ta tìm mảng từng mảng để so sánh từng phần tử xem có trùng kh
        for(int i = 0; i < 100; i++){
            if(ar[i] == x){
                found = true;
                break;
            }
        }
        // Ket qua
        if(found)
            System.out.println("Co trong mang");
        else
            System.out.println("Khong co");
    }
}