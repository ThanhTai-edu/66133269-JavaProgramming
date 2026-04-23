package thgk2.TruongVoThanhTai;

class Main2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//3.In lại ra màn hình danh sách các sinh viên ta dùng system out 
        System.out.println("Danh sach:");
        for(SinhVien sv : ds){
            sv.xuat();
        }
//4. In ra màn hình các sinh viên lớn hơn 20 tuổi
//Cần điều kiện sinh viên phải lớn hơn 20 tuổi ta dùng hàm if
            System.out.println("SV tuoi > 20:");
                if(sv.tuoi > 20){
                    sv.xuat();

	}
}
