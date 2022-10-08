package demo_buoi3;
public class SinhVien {
    private String tenSv;
    private int tuoi;
    private String maSv;

    public SinhVien() {
        //Constructor là phương thức khởi tạo dùng 
        //để khởi tạo giá trị cho thuộc tính.
        //Constructor không tham số: các thuộc tính được khởi 
        //tạo giá trị mặc định(nếu số=0;String=null).
    }
     //Constructor cùng tên với Class;không có kiểu dữ liệu trả về 
    
    public SinhVien(String tenSv, int tuoi, String maSv) {
        this.tenSv = tenSv;
        //trái thuộc tính , phải đối số truyền vào
        this.tuoi = tuoi;
        this.maSv = maSv;
    }

    public String getTenSv() {
        return tenSv;
        //Trả lại giá trị cho thuộc tính 
    }
    //Get cho người dùng có thế nhìn thấy 
    //Set thiết lập giá trị cho thuộc tính
    public void setTenSv(String tenSv) {
        this.tenSv = tenSv;
    }

    public int getTuoi() {
        return tuoi;
    }

    public void setTuoi(int tuoi) {
        this.tuoi = tuoi;
    }

    public String getMaSv() {
        return maSv;
    }

    public void setMaSv(String maSv) {
        this.maSv = maSv;
    }
    
    public void inThongTin(){
        System.out.println(tenSv);
        System.out.println(tuoi);
        System.out.println(maSv);
    }   
}
