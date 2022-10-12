
package BTVN_Buoi3;


public class SinhVien {
    private String maSV;
    private String tenSV;
    private int tuoi;
    private double diem;

    public SinhVien() {
    }

    public SinhVien(String maSV, String tenSV, int tuoi, double diem) {
        this.maSV = maSV;
        this.tenSV = tenSV;
        this.tuoi = tuoi;
        this.diem = diem;
    }

    public String getMaSV() {
        return maSV;
    }

    public void setMaSV(String maSV) {
        this.maSV = maSV;
    }

    public String getTenSV() {
        return tenSV;
    }

    public void setTenSV(String tenSV) {
        this.tenSV = tenSV;
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
    public void inTT(){
        System.out.println("Mã: "+maSV);
        System.out.println("Tên: "+tenSV);
        System.out.println("Tuổi: "+tuoi);
        System.out.println("Điểm: "+diem);
    }
}
