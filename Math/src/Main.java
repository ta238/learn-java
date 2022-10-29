public class Main {
    public static void main(String[] args) {
        BaiTap toanHoc = new BaiTap();
        int ketQua = toanHoc.tinhTong(10);
        System.out.println(ketQua);
        // call tiep o day
        // ! CHÚ Ý: k tạo thêm đối tượng nữa, dùng lại đối tượng đã tạo ở dòng 3
        int KiemTraSoNuyenTo = toanHoc.kiemTraSoNguyenTo(7);
        System.out.println(KiemTraSoNuyenTo);
        //liet ke so nguyen to
        // !CHU Y: tên biến phải để chữ thường ở đầu (cho code nó đẹp)
        toanHoc.lietKeSoNguyenTo(100);

        // tim min
        int min = toanHoc.min(2, 3);
        System.out.println("Min: " + min);
        // tim max
        int max = toanHoc.max(2, 3);
        System.out.println("Max: " + max);
        // Ví dụ như này là lỗi
        System.out.println("viết như này sẽ k bị lỗi nữa");
        // ! CHÚ Ý: k tạo thêm đối tượng nữa
        // dùng lại đối tượng toanHoc đã tạo ở dòng 3
        toanHoc.giaiPhuongTrinhBacHai(2, 3, 1);
        //fibinasi
        int kq =toanHoc.fiBoNaSi(10);
        System.out.println("fiBoNaSi"+kq);

    }
}