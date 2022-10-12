
package BTVN_Buoi3;


public class GiangVien {
    private String maGV;
    private String tenGV;
    private int tuoi;
    private String nganh;

    public GiangVien() {
    }

    public GiangVien(String maGV, String tenGV, int tuoi, String nganh) {
        this.maGV = maGV;
        this.tenGV = tenGV;
        this.tuoi = tuoi;
        this.nganh = nganh;
    }

    public String getMaGV() {
        return maGV;
    }

    public void setMaGV(String maGV) {
        this.maGV = maGV;
    }

    public String getTenGV() {
        return tenGV;
    }

    public void setTenGV(String tenGV) {
        this.tenGV = tenGV;
    }

    public int getTuoi() {
        return tuoi;
    }

    public void setTuoi(int tuoi) {
        this.tuoi = tuoi;
    }

    public String getNganh() {
        return nganh;
    }

    public void setNganh(String nganh) {
        this.nganh = nganh;
    }
    
}
