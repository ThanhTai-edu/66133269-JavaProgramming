package truongvothanhtai;

public class HocSinh {

    private String tenHS;
    private short tuoiHS;
    private int lopHS;

    public HocSinh(){}

    public HocSinh(String tenHS, short tuoiHS, int lopHS){
        this.tenHS = tenHS;
        this.tuoiHS = tuoiHS;
        this.lopHS = lopHS;
    }

    public void setTenHS(String ten){
        this.tenHS = ten;
    }

    public void setTuoiHS(short tuoi){
        this.tuoiHS = tuoi;
    }

    public void setLopHS(int lop){
        this.lopHS = lop;
    }

    public String getTenHS(){
        return tenHS;
    }

    public void hienThiThongTin(){
        System.out.println(tenHS + " - " + tuoiHS + " - " + lopHS);
    }
}
