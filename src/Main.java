public class Main {
    public static void main(String[] args) {
        HangSanXuat h1 = new HangSanXuat("Hãng 1", "Việt Nam");
        HangSanXuat h2 = new HangSanXuat("Hãng 2", "USA");
        HangSanXuat h3 = new HangSanXuat("Hãng 3", "Nhật bản");

        PhuongTienDiChuyen p2 = new MayBay("Xăng", h2);
        PhuongTienDiChuyen p1 = new XeOto("Trường Hải", h1);
        PhuongTienDiChuyen p3 = new XeDap(h3);

        System.out.println();
    }
}