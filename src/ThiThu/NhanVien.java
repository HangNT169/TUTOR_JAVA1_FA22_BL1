package ThiThu;
public class NhanVien {
   private String MaNv;
   private String TenNv;
   private double luong;
   private String DiaChi;
   private int SoNgayLamViec;

    public NhanVien() {
    }

    public NhanVien(String MaNv, String TenNv, double luong, String DiaChi, int SoNgayLamViec) {
        this.MaNv = MaNv;
        this.TenNv = TenNv;
        this.luong = luong;
        this.DiaChi = DiaChi;
        this.SoNgayLamViec = SoNgayLamViec;
    }

    public String getMaNv() {
        return MaNv;
    }

    public void setMaNv(String MaNv) {
        this.MaNv = MaNv;
    }

    public String getTenNv() {
        return TenNv;
    }

    public void setTenNv(String TenNv) {
        this.TenNv = TenNv;
    }

    public double getLuong() {
        return luong;
    }

    public void setLuong(double luong) {
        this.luong = luong;
    }

    public String getDiaChi() {
        return DiaChi;
    }

    public void setDiaChi(String DiaChi) {
        this.DiaChi = DiaChi;
    }

    public int getSoNgayLamViec() {
        return SoNgayLamViec;
    }

    public void setSoNgayLamViec(int SoNgayLamViec) {
        this.SoNgayLamViec = SoNgayLamViec;
    }
   
   public void inThongTin(){
       System.out.println("\nThông tin nhân viên");
       System.out.println("Mã : "+MaNv);
       System.out.println("Tên : "+TenNv);
       System.out.println("Lương : "+luong);
       System.out.println("Địa Chỉ : "+DiaChi);
       System.out.println("Số Ngày Làm Việc : "+SoNgayLamViec);
   }
}
