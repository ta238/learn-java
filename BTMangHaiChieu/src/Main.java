import java.lang.reflect.Array;
import java.util.Arrays;

public class Main {


    public static void main(String[] args) {
        //  BTMangHaiChieu vidu = new BTMangHaiChieu();
        //bt3
        //  int sum = vidu.Sum(new int[]{-10, -11, -1, 0, 0, 1, 2});
        //  System.out.println(sum);
        //bt1
        // ViDu vidu=new ViDu();
        // int[][] mang = new int[][]{{1, -1}, {1, 2, -3}, {5, -3, -1, -1}, {1, 2, 3}, {10}};
        //int kq = vidu.Sum1(mang);
        // System.out.println(kq);
        //bt2
        // int[][] SumMax = new int[][]{{1},{1,1},{1,1,1,1,5}};

        // int kqa = vidu.SumMax(SumMax);
        // System.out.println(kqa);
        //  int[][]mang=new int[][]{{1,-1},{1,2,-3},{5,-3,-1,-1},{1,2,3},{10}};
        //   int kq= vidu.Sum1(mang);
        //   System.out.println(kq);
        //  int [][]mang1=new int[][]{{1},{1,1},{1,1,1,1,5}};
        //  int kq1= vidu.SumMax(mang1);
        //   System.out.println(kq1);

        for (int i = 0; i < 2; i++) {
            System.out.println(i);
            for (int j = 0; j < 2; j++) {
                System.out.print(i + j); // tổng nhé
                for (int t = 0; t < 2; t++) {
                    System.out.print(i + j + t);
                }
                System.out.print(j);
            }
            System.out.print("A");
        }

    }
}


