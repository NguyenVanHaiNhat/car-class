public class MayBay extends PhuongTienDiChuyen{
    private String loaiNhienLieu;

    public MayBay(String tenLoaiPhuongTien, HangSanXuat hangSanXuat) {
        super("Máy Bay", hangSanXuat);
        this.loaiNhienLieu = tenLoaiPhuongTien;
    }

    @Override
    public double layVanToc() {
        return 500;
    }

    public String getLoaiNhienLieu() {
        return loaiNhienLieu;
    }

    public void setLoaiNhienLieu(String loaiNhienLieu) {
        this.loaiNhienLieu = loaiNhienLieu;
    }

    public void catCanh(){
        System.out.println("Cất cánh...");
    }

    public void haCanh(){
        System.out.println("Hạ cánh...");
    }
}
