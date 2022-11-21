package BTVN_Buoi4;
public class Vaccine {
    private String MaVc;
    private String TenVc;
    private float ThoiGianTacDung;
    private String NgayHetHan;

    public Vaccine() {
    }

    public Vaccine(String MaVc, String TenVc, float ThoiGianTacDung, String NgayHetHan) {
        this.MaVc = MaVc;
        this.TenVc = TenVc;
        this.ThoiGianTacDung = ThoiGianTacDung;
        this.NgayHetHan = NgayHetHan;
    }

    public String getMaVc() {
        return MaVc;
    }

    public void setMaVc(String MaVc) {
        this.MaVc = MaVc;
    }

    public String getTenVc() {
        return TenVc;
    }

    public void setTenVc(String TenVc) {
        this.TenVc = TenVc;
    }

    public float getThoiGianTacDung() {
        return ThoiGianTacDung;
    }

    public void setThoiGianTacDung(float ThoiGianTacDung) {
        this.ThoiGianTacDung = ThoiGianTacDung;
    }

    public String getNgayHetHan() {
        return NgayHetHan;
    }

    public void setNgayHetHan(String NgayHetHan) {
        this.NgayHetHan = NgayHetHan;
    }
    
    public void inThongTin(){
        System.out.println("Thông Tin Vaccine :");
        System.out.println("Mã : "+MaVc);
        System.out.println("Tên : "+TenVc);
        System.out.println("TG Tác Dụng : "+ThoiGianTacDung);
        System.out.println("Ngày Hết Hạn : "+NgayHetHan);
        System.out.println("--------------------");
    }
}
