package thigk2.TruongVoThanhTai;
import java.util.Scanner;

class Main_Bai1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Hỏi ng dùng về thông tin chiều cao, cân nặng từ bàn phím
		// Dùng Scanner để nhập thông tin từ bàn phím 
		Scanner sc = new Scanner(System.in);

		System.out.print("Nhap chieu cao (m): ");
		double h = sc.nextDouble();

		System.out.print("Nhap can nang (kg): ");
		double w = sc.nextDouble();
		// Xuất ra màn hình chỉ số BMI
		// Dùng System out 
		double bmi = w / (h * h);

		System.out.println("BMI = " + bmi);
		// Thông tin tình trạng cơ thể tương ứng
		// Tùy vào chỉ số sẽ xuất ra màn hình các tình trạng tương ứng
		// Có điều kiện nên dùng hàm If else
		// Phan loai
        if(bmi < 18.5){
            System.out.println("Tinh trang: Thieu can");
        }
        else if(bmi < 25){
            System.out.println("Tinh trang: Binh thuong");
        }
        else if(bmi < 30){
            System.out.println("Tinh trang: Thua can");
        }
        else{
            System.out.println("Tinh trang: Beo phi");
        }
    }
}


