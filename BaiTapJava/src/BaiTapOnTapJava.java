public class BaiTapOnTapJava {
    //bt1Viết hàm truyền vào một mảng, trả về giá trị lớn nhất trong mảng.
    public int BT1(int[] mang) {
        int n = mang[0];
        for (int i = 0; i < mang.length; i++) {
            if (mang[i] > n) {
                n = mang[i];
            }
        }
        return n;
    }

    //bt2 Viết hàm truyền vào một mảng 2 chiều, trả về mảng con có tổng lớn nhất.
    public int Tong(int[] mang) {
        int tong = 0;
        for (int i = 0; i < mang.length; i++) {
            tong += mang[i];
        }
        return tong;
    }

    public int BT2(int[][] mang) {
        int n = Tong(mang[0]);

        for (int i = 0; i < mang.length; i++) {
            if (Tong(mang[i]) > n) {

                n = Tong(mang[i]);
            }
        }
        return n;
    }

    public boolean toanSoDuong(int[] mang) {

        for (int i = 0; i < mang.length; i++) {
            if (mang[i] < 0) {

                return false;
            }
        }
        return true;

    }

    public int bt3(int[][] mang) {
        int n = 0;
        for (int i = 0; i < mang.length; i++) {
            if (toanSoDuong(mang[i])) {
                n += Tong(mang[i]);
            }
        }
        return n;
    }

    //bt4 tra ve vitri nho nhat
    public int bt4(int[] mang) {
        int n = mang[0];
        int x = 0;
        for (int i = 0; i < mang.length; i++) {
            if (mang[i] < n) {
                n = mang[i];
                x = i;

            }
        }
        return x;
    }

    public boolean bt5(int[][] mang) {
        int tong = 0;
        for (int i = 0; i < mang.length; i++) {
            for (int j = 0; j < mang[i].length; j++) {
                tong += mang[i][j];
            }
        }
        if (tong == 0) {
            return true;
        } else return false;
    }


    //dem so luong pan tu trong mang
    public int bt6(int[] mang) {
        int n = 0;
        for (int i = 0; i < mang.length; i++) {
            if (mang[i] == 1) {
                n++;
            }
        }
        return n;
    }

    //dem so luong pan tu tron mang 2c
    public int bt7(int[][] mang) {
        int n = 0;
        for (int i = 0; i < mang.length; i++) {
            for (int j = 0; j < mang[i].length; j++) {
                if (mang[i][j] == 1) {
                    n++;
                }
            }
        }
        return n;

    }

    public int bt8(int[][] mang, int n) {
        int x = 0;
        for (int i = 0; i < mang.length; i++) {
            for (int j = 0; j < mang[i].length; j++) {
                if (mang[i][j] == n) {
                    x++;
                }
            }
        }
        return x;
    }

    public void bt9(int[][] mang, int n) {

        for (int i = 0; i < mang.length; i++) {
            for (int j = 0; j < mang[i].length; j++) {
                mang[i][j] = n;

            }
        }
    }
    // Viết hàm truyền vào mảng 2 chiều, trừ giá trị của các phần từ đi 1 đơn vị

    public void bt10(int[][] mang) {
        int n = 0;
        for (int i = 0; i < mang.length; i++) {
            for (int j = 0; j < mang[i].length; j++) {
                mang[i][j] = mang[i][j] - 1;
            }
        }
    }

    public void bt11(int[][] mang, int n) {
        for (int i = 0; i < mang.length; i++) {
            for (int j = 0; j < mang[i].length; j++) {
                mang[i][j] = mang[i][j] - n;
            }
        }
    }

    public void bt12(int[][] mang) {

        for (int i = 0; i < mang.length; i++) {
            for (int j = 0; j < mang[i].length; j++) {
                if (mang[i][j] < 0) {
                    mang[i][j]=0;

                }
            }
        }
    }
}