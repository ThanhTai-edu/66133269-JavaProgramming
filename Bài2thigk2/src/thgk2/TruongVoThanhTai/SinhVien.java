package thgk2.TruongVoThanhTai;
import java.util.Scanner;
// Xây dựng lớp Sinh Viên, với tối thiểu 3 thuộc tính thể hiện được mã số sinh viên,họ tên đầy đủ và năm sinh.Sinh viên tự thêm thuộc tính thứ 4
// Khai báo SinhVien với các biến maSV,ten,tuoi,diem(tu them)
class SinhVien {
    String maSV;
    String ten;
    int tuoi;
    double diem;
// Xây dựng các hàm Getter/Setter,Constructor với đầy đủ các tham số
// Xây dụng hàm Constructor trước
    public SinhVien(){}

    public SinhVien(String maSV, String ten, int tuoi, double diem){
        this.maSV = maSV;
        this.ten = ten;
        this.tuoi = tuoi;
        this.diem = diem;
    }
 // Xây dựng Getter/Setter với Source Generate Getter and Setter
	public String getMaSV() {
		return maSV;
	}

	public void setMaSV(String maSV) {
		this.maSV = maSV;
	}

	public String getTen() {
		return ten;
	}

	public void setTen(String ten) {
		this.ten = ten;
	}

	public int getTuoi() {
		return tuoi;
	}

	public void setTuoi(int tuoi) {
		this.tuoi = tuoi;
	}

	public double getDiem() {
		return diem;
	}

	public void setDiem(double diem) {
		this.diem = diem;
	}
// Xây dựng hàm nhập thông tin sinh viên
// public void  Nhap()
	public void nhap() {
		Scanner sc = new Scanner(System.in);

        System.out.print("Ma SV: ");
        maSV = sc.nextLine();

        System.out.print("Ten: ");
        ten = sc.nextLine();

        System.out.print("Tuoi: ");
        tuoi = sc.nextInt();

        System.out.print("Diem: ");
        diem = sc.nextDouble();
        sc.nextLine();
    }
// Xây dựng xuất ra thông tin sinh viên
// public void xuat()
	public void xuat(){
        System.out.println(maSV + " - " + ten + " - " + tuoi + " - " + diem);
    }
}
	
    
