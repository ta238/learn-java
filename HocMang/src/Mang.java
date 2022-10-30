import com.sun.tools.javac.Main;

import java.awt.desktop.SystemSleepEvent;
import java.util.ArrayList;

public class Mang {

    // BT1. trả về số lớn nhất trong mảng
    // [1, 3, 5, 4, 6, 7, 9, 1, 2, 4, 3 ,1 2, 4, 5, 6, 7, 8, 0]
    //  0  1  2  3  4  5
    // public int timSoLonNhat(int[] mang) {
    // if (mang.length == 0) {
    //       return 0;
    //  }

    //  int x = mang[0];
    // for (int i = 0; i < mang.length; i++) {
    //      if (mang[i] > x) {
    //         x = mang[i];
    //     }
    //  }

    //     return x;
    // }

    // BT2. trả về tổng các phần tử của mảng
    //public int tinhTong(int[] mang) {
    //    int tong = 0;
    //    for (int i = 0; i < mang.length; i++) {
    //       tong += mang[i];
    //   }
    //   return tong;
    //  }

    // BT3. trả về vị tri (index) của số lơn nhất trong mảng
    // public int timViTriSoLonNhat(int[] mang) {
    //   int max = timSoLonNhat(mang);

    //     for (int j = 0; j < mang.length; j++) {
    //        if (max == mang[j]) {
    //          return j;
    //      }
    //  }

    //  return 0;
    // }

    // 1, 2, 3, 4, 5, 6
    //  public int timSoNhoNhat(int[] mang) {
    //    int x = 99999999;
    //     for (int i = 0; i < mang.length; i++) {
    //      if (mang[i] < x) {
    //          x=mang[i] ;
    //       }
    //     }
    //    return x;
    // }

    //  public int timSoLuongPhanTu(int[] mang, int n) {
    //     int x=0;
    //     for(int i =0;i<mang.length;i++){
    //        if(mang[i]==n){
    //           x++;
    //       }
    //   }
    //    return x;
    // }

    // public int timSoLuongSoChan(int[] mang) {
    //     int n=0;
    //     for(int i =0;i<mang.length;i++){
    //         if(mang[i]%2==0){
    //           n++;
    //       }
    //    }
    //    return n;
    //}

    // [1, 4]
    // j = 0, mag = [1, 4], so luong so chan = 1, tong = 0; tong += 1 => tong = 1
    // j = 1, mang = [1, 4], so luong so chan = 1
    // public int tinhTongCacSoChan(int[] mang) {
    //     int tong=0;
    //    for(int j= 0;j<mang.length;j++) {
    //         if (mang[j] % 2 == 0) {
    //            tong += mang[j];
    //        }
    //     }
    //     return tong;
    // }

    // public int timSoLuongSoLonHon100(int[] mang) {
    //    int n=0;
    //    for(int i = 0;i<mang.length;i++){
    //       if(mang[i]>100){
    //          n++;
    //      }
    //   }
    //  return n;
    //  }

    public static void main(String[] args) {
        //tao mot ArrayList
        ArrayList<Integer>list=new ArrayList<Integer>();
        // them 1->10
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        list.add(7);
        list.add(8);
        list.add(9);
        list.add(10);
        System.out.println(list);
// in ra 3 phan tu dau tien
        System.out.println(+list.get(0));
        System.out.println(+list.get(1));
        System.out.println(+list.get(2));
        // xoa 3 phan tu dau tien
        System.out.println("xoa 3 phan tu dau");
        System.out.println(list.remove(0));
        System.out.println(list.remove(0));
        System.out.println(list.remove(0));
        // in lai ra 3 phan tu dau tien
        System.out.println("in lai ra 3 pan tu dau tien");
        System.out.println(+list.get(0));
        System.out.println(+list.get(1));
        System.out.println(+list.get(2));
    }
}