public class HoaDonCaFe {
    private String tenLoaiCaFe;
    private double giaTien1kg;
    private double khoiLuong;

    public HoaDonCaFe(String ten, double kl, double gt) {
        this.tenLoaiCaFe = ten;
        this.giaTien1kg = gt;
        this.khoiLuong = kl;
    }

    public double TinhTongTien() {
        return this.khoiLuong * this.giaTien1kg;
    }

    public boolean KiemTraKhoiLuonglonHon(double kl) {
        return this.khoiLuong > kl;
    }

    public boolean KiemTraTongTienLonHon500k() {
        return this.TinhTongTien() > 500000;
    }

    public double GiamGia(double x) {
        if (this.TinhTongTien() > 500000) {
            return (x / 100) * this.TinhTongTien();
        } else {
            return 0;
        }

    }

    public double GiaSauKhiGiam(double x) {
        return this.TinhTongTien() - this.GiamGia(x);
    }
}