package demo_buoi4;
public class HocSinh {
    private String tenHS;
    private int tuoiHs;
    private double diem;
    private String diaChi;

    public HocSinh() {
    }

    public HocSinh(String tenHS, int tuoiHs, double diem, String diaChi) {
        this.tenHS = tenHS;
        this.tuoiHs = tuoiHs;
        this.diem = diem;
        this.diaChi = diaChi;
    }

    public String getTenHS() {
        return tenHS;
    }

    public void setTenHS(String tenHS) {
        this.tenHS = tenHS;
    }

    public int getTuoiHs() {
        return tuoiHs;
    }

    public void setTuoiHs(int tuoiHs) {
        this.tuoiHs = tuoiHs;
    }

    public double getDiem() {
        return diem;
    }

    public void setDiem(double diem) {
        this.diem = diem;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }
    
    public void inThongTin(){
        System.out.println("Ten : "+tenHS);
        System.out.println("Tuoi : "+tuoiHs);
        System.out.println("Diem :"+diem);
        System.out.println("Dia Chi : "+diaChi);
    }
}
