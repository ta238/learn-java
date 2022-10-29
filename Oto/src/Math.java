import java.util.Arrays;

public class Math {
    // Vi Du:{1, 2, 3, 4}, 0, 3 -> {4, 2, 3, 1}
    // mang[i] = ... ;
    // mang[j] = ...;
    public void doiViTri(int[] mang, int i, int j) {
        // n ~ mang[i], m ~ mang[j]
        int x = mang[i];

        mang[i] = mang[j];

        mang[j] = x;
    }

    // ham sort truyền vào 1 mảng các số nguyên
    // sắp xếp lại các biến trong mảng sao cho thứ tự tăng dần
    //   {5 ,4, 3, 2, 1} -> {1, 2, 3, 4, 5}
    // i: 0  1  2  3  4

    // {10, 50, 30, 100, 5, 1, 2, 7, 8} -> 2 ng cuoc to nhat
    // -> {1, 3, 5, 7, 8, 10, 30, 50, 100} -> 50, 100
    public void sapXepMang(int[] mang) {
        // sắp xếp
//        for (int i = 0; i < mang.length - 1; i++) {
//            for (int j = i + 1; j < mang.length; j++) {
//                if (mang[i] > mang[j]) {
//                    int x = mang[i];
//                    mang[i] = mang[j];
//                    mang[j] = x;
//                }
//            }
//        }
        Arrays.sort(mang);
    }

    // truyền vào 1 mảng gồm n phần tử kiểu int
    // in ra màn hình các số chỉ xuất hiện 1 lần
    // Ví dụ: [1, 1, 1, 2, 6, 7, 8, 8, 5] -> in ra màn hình 2, 6, 7, 5
    public void baiTap1(int[] mang) {
        int soLuong = demSoLuong(new int[]{1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 3},4);
    }

    // truyền vào mảng và n
    // trả về số lượng phần trử trong mảng có giá trị bằng n
    // n = 1 mang = [1, 1, 1, 1, 2, 2, 4] -> trả về 4
    //  -> m = 0
    //  -> i = 0 -> mang[i] = mang[0] = 1 = n => m++ => m = 1
    // n phan tu  trong mang
    // n = 1 mang = [2, 2, 2, 2, 3, 4,] -> trả về 0
    public int demSoLuong(int[] mang, int n) {
        //tao bien m =0
        int m = 0;
        for (int i = 0; i < mang.length; i++) {
            if (mang[i] == n) {
                m++;
            }
        }
        return m;
    }
}