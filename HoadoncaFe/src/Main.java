public class Main {
    public static void main(String[] args) {
        HoaDonCaFe kq = new HoaDonCaFe("trung nguyen",1.5,10000);
        System.out.println("tong gia tien:"+kq.TinhTongTien());
        System.out.println("kiemTraKhoiluong:"+kq.KiemTraKhoiLuonglonHon(2));
        System.out.println("kiemTraTongTienColonhon500k:"+kq.KiemTraTongTienLonHon500k());
        System.out.println("Giam Gia:"+kq.GiamGia(10));
        System.out.println("GiấukhiGiam"+kq.GiaSauKhiGiam(10));
    }
}