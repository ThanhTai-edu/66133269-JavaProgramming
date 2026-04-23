package thgk2.TruongVoThanhTai;
import java.util.Scanner;
import java.util.ArrayList;

class Main {
//Hard-code trong hàm Main tạo danh sách 3 sinh viên, in ra màn hình danh sách đó
	 public static void main(String[] args){
//Hard-code nhập dữ liệu trực tiếp vào code
//Tạo danh sách để lưu 3 sinh viên với ArrayList
	        ArrayList<SinhVien> ds = new ArrayList<>();
// 1.Hardcode
	        ds.add(new SinhVien :"SinhVienBinh"+"18");
	        ds.add(new SinhVien : "SinhVienAn"+"19", null, 0, 0 );
	        ds.add(new SinhVien : "SinhVienVo"+"20");
// 2.nhap them sinh vien tu ban phim
// muốn nhập thêm trước hết khai báo hàm Scanner
	        Scanner sc = new Scanner(System.in);
// Nhập thêm từ bàn phím ta dùng system out
	        System.out.print("Nhap so luong them: ");
	        int n = sc.nextInt();
	        sc.nextLine();
// Khai báo cho sinh viên mới 
	        for(int i=0;i<n;i++){
	            SinhVien sv = new SinhVien();
	            sv.nhap();
	            ds.add(sv);
	        
	    }
	}