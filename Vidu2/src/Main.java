import java.lang.reflect.Array;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Vid2 vidu = new Vid2();
        int mang[] = new int[]{1, 2, 3};
        vidu.BaiTap1(mang);
        System.out.println(Arrays.toString(mang));
        int[] mang1 = new int[]{1, 2, 3};
        vidu.BaiTap2(mang1);
        System.out.println(Arrays.toString(mang1));
        int[] mang2 = new int[]{11, 0, 71, 55, 2, 1};
        vidu.DaoVitri(mang2);
        System.out.println(Arrays.toString(mang2));
        int[] mang3 = new int[]{1, 2, 3, 4};
        vidu.DaoViTriDauVaCuoi(mang3);
        System.out.println(Arrays.toString(mang3));
        int[] mang4 = new int[]{1, 2, 3, 4};
        vidu.Sum(mang4);
        System.out.println(Arrays.toString(mang4));
        int[][] mang5 = new int[][]{{1, 1}, {1}, {1, 1, 1, 1, 1}};
       int kq= vidu.Sum1(mang5);
        System.out.println(kq);
        int sum1 = vidu.TongDoDai(new int[][]{{1, 2, 3}, {4, 5, 6}});
        System.out.println(sum1);
        int max=vidu.timSoLonNhat(new int[][]{{1,1,1},{1},{1,1,1,9,1}});
        System.out.println(max);
    }

}