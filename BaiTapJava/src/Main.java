import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        BaiTapOnTapJava ketqua = new BaiTapOnTapJava();
        int mang = ketqua.BT1(new int[]{-1, -2, -2, -7, -9});
        System.out.println(mang);

        int mang1 =ketqua.BT2(new int[][]{{5},{2,2},{3}});
      System.out.println(mang1);

      int mang2= ketqua.bt3(new int[][]{{1,2},{-1,2,3},{0,7,1},{88,-9,0}});
      System.out.println(mang2);
        boolean mang2a= ketqua.toanSoDuong(new int[]{1,-1});
        System.out.println(mang2a);
      int mang3= ketqua.bt4(new int[]{2, 2, 2, 1, 2, 2, 2});
System.out.println(mang3);
boolean mang4= ketqua.bt5(new int[][]{{-1, 1}, {-1, -2, 3}, {-5, 1, 1, 1, 2}});
System.out.println(mang4);
int mang5=ketqua.bt6(new int[]{1, 1, 2, 2, 3, 1});
System.out.println(mang5);
int mang6=ketqua.bt7(new int[][]{{ 2, 2, 3, 3}, {2}, {3}, {5, 6}});
System.out.println(mang6);
int mang7=ketqua.bt8(new int[][]{{1, 1, 1, 1, 1}, {1, 2, 3}, {1, 10}},1);
System.out.println(mang7);
ketqua.bt9(new int[][]{{1, 1, 11, 1}, {1, 2, 3}, {1, 10}},1);

 System.out.println();

    }
}