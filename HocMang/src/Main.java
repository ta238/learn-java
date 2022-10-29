public class Main {
    public static void main(String[] args) {
        // Mang mang = new Mang();

        // 9
        // x = 0 < 1 => x = 1
        // x = 1 < 2 => x = 2
        // int max = mang.timSoLonNhat(new int[]{-1, -2, -3, -4, -5, -6, -7, -8, -9, -2});
        //  System.out.println(max);

        // 15
        // int sum = mang.tinhTong(new int[]{1, 2, 3, 4, 5});
        // System.out.println(sum);

        // int index = mang.timViTriSoLonNhat(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 2});
        // System.out.println(index);

        // 1
        // int min = mang.timSoNhoNhat(new int[]{1, 2, 3, 4, 5, 6});
        //  System.out.println(min);
       ViDumang vidu=new ViDumang();
       int timgiatrilonnhattrongmang= vidu.TimSoLonNhatTrongMang(new int[]{1,3,5,6,8,9});
       System.out.println(timgiatrilonnhattrongmang);
       //vidu.TongCacPhanTuTrongmang(new int[]{1,2,3,4,5});
       //System.out.println(vidu.TongCacPhanTuTrongmang(new int[]{1,2,3,4,5}));
        int tongsolonnhattrongmang=vidu.TongCacPhanTuTrongmang(new int[]{1,2,3,4,5});
        System.out.println(tongsolonnhattrongmang);
          vidu.BaiTap1(new int[]{1,2,3,4,5,6,7});
          System.out.println();
    }
}