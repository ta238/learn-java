public class Vid2 {
    public void BaiTap1(int[] mang) {
        for (int i = 0; i < mang.length; i++) {
            mang[i] = 0;
        }
    }

    public void BaiTap2(int[] mang) {
        for (int i = 0; i < mang.length; i++) {
            mang[i] = -mang[i];

        }
    }

    public void DaoVitri(int[] mang) {
        int n;
        for (int i = 0; i < mang.length / 2; i++) {

            n = mang[i];
            mang[i] = mang[mang.length - 1 - i];
            mang[mang.length - 1 - i] = n;

        }
    }


    public void DaoViTriDauVaCuoi(int[] mang) {
        int n = mang[0];
        mang[0] = mang[mang.length - 1];
        mang[mang.length - 1] = n;
    }

    public void Sum(int[] mang) {
        int n = mang[0];
        mang[0] -= mang[mang.length - 1];
        mang[mang.length - 1] += n;
    }

    public int tong(int[] mang) {
        int tong = 0;
        for (int i = 0; i < mang.length; i++) {
            tong += mang[i];
        }
        return tong;
    }

    public int Sum1(int[][] mang) {
        int max = tong(mang[0]);
        for (int i = 0; i < mang.length; i++) {
            int n = tong(mang[i]);
            if (max < n) {
                max = n;
            }

        }
        return max;
    }

    public int TongDoDai(int[][] mang) {
        int tong = 0;
        for (int i = 0; i < mang.length; i++) {
            for (int j = 0; j < mang[i].length; j++) {
                tong += mang[i].length;

            }
        }
        return tong;
    }

    public int timSoLonNhat(int[][] mang) {
        int n = mang[0][0];
        for (int i = 0; i < mang.length; i++) {
            for (int j = 0; j < mang[i].length; j++) {
                if (mang[i][j] > n) {
                    n = mang[i][j];
                }
            }

        }
        return n;
    }
}

