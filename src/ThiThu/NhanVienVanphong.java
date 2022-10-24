package ThiThu;
public class NhanVienVanphong extends NhanVien{
    private int NgayNghiPhep;

    public NhanVienVanphong() {
    }

    public NhanVienVanphong(String MaNv, String TenNv, double luong, String DiaChi, int SoNgayLamViec,int NgayNghiPhep) {
        super(MaNv, TenNv, luong, DiaChi, SoNgayLamViec);
        this.NgayNghiPhep = NgayNghiPhep;
    }

    public int getNgayNghiPhep() {
        return NgayNghiPhep;
    }

    public void setNgayNghiPhep(int NgayNghiPhep) {
        this.NgayNghiPhep = NgayNghiPhep;
    }

    @Override
    public void inThongTin() {
        super.inThongTin();
        System.out.println("Số ngày nghỉ phép : "+NgayNghiPhep);
    }
       
}
