public class BaiTap {
    // tinh tong tu 1 toi n

    public int tinhTong(int n) {
        int tong = 0;
        for (int i = 1; i <= n; i++) {
            tong = tong + i;
        }
        return tong;
    }

    public int kiemTraSoNguyenTo(int n) {
        // các số từ 1 trở xuống k là snt
        if (n <= 1) return 0;
        // 2 là số nt
        if (n == 2) return 1;
        // dưới đây sẽ chạy từ 2 tới n -1 nên
        // nếu n = 1 thì sẽ chạy từ 2 tới 0 (vô lý vì i tăng)
        // nếu n = 2 thì sẽ chạy từ 2 tới 1 (vô lý nốt)
        // cho nên phải kiểm tra điều kiện n như bên trên
        // code ở đây
        for (int i = 2; i <= n - 1; i++) {
            if (n % i == 0) return 0;

        }
        return 1;

    }

    // !CHÚ Ý: tên hàm phải để chữ thường ở đầu
    public void lietKeSoNguyenTo(int n) {
        for (int i = 2; i <= n - 1; i++) {
            if (kiemTraSoNguyenTo(i) == 1) {
                System.out.println(i + " la so nguyen to.");
            }
        }
    }

    //min,max
    // !CHú ý: tên hàm phải để chữ thường ở đầu
    public int min(int a, int b) {
        if (a < b) return a;
        else return b;
    }

    public int max(int a, int b) {
        // SAI: a < b return a thì a là số nhỏ hơn b => a ko phải số lớn nhất
        if (a > b) return a;
        else return b;
    }

    // Hàm này là giải phương trình bậc 2 đã in ra màn hình ở trong thân hàm rồi
    // k cần trả về kết quả gì, vì mục đích của bài toán ko cần trả về kết quả
    public void giaiPhuongTrinhBacHai(double a, double b, double c) {
        double x1, x2, delta;

        delta = Math.pow(b, 2) - 4 * a * c;
        if (a < 0) return;

        if (delta > 0) {
            x1 = (-b - Math.sqrt(delta)) / (2 * a);
            x2 = (-b + Math.sqrt(delta)) / (2 * a);
            System.out.println("phuong trinh co x1=" + x1);
            System.out.println("phuong trinh co x2=" + x2);
        } else if (delta == 0) {
            x1 = -b / (2 * a);
            System.out.println("phuong trinh co nghiem kep x1=x2=" + x1);

        } else {
            System.out.println("phuong trinh vo nghiem");
        }
    }
    // fibolasi
    /*F(0) = 0

    F(1) = 1

    F(n) = F(n-1) + F(n-2)
*/
    public int fiBoNaSi(int x){
        if(x==0)return 0;
        if(x==1)return 1;
        else return fiBoNaSi(x-1)+fiBoNaSi(x-2);
    }




}




