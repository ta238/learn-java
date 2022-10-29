import java.lang.reflect.Array;
import java.util.Arrays;

public class ViDu {
    public static void main(String[] args) {
        // kieu nguyen thuy
        int[]mang1={1,2,3};
        //copy mang c1
      int[]mang1a=mang1;
       mang1a[0]=100;
       System.out.println("mang1:"+Arrays.toString(mang1));
       System.out.println("mang1a:"+Arrays.toString(mang1a));
        // copy mang c2 dung clone
        int[]mang1b=mang1.clone();
        mang1a[0]=50;
        System.out.println("mang1b:"+Arrays.toString(mang1a));
        // copy mang c3 dung ham System.Arrayscopy
        int[]mang1c= new int[mang1.length];
        System.arraycopy(mang1,0,mang1c,0,mang1.length);
        mang1c[0]=90;
        System.out.println("mang1c:"+Arrays.toString(mang1c));
        // kieu doi tuong
        String[]mang_doi_tuong={"vutuananh","123"};
        String[]mang_doi_tuong1=mang_doi_tuong;
        mang_doi_tuong1[0]="a";
        System.out.println("mang doi tuong="+Arrays.toString(mang_doi_tuong));
        System.out.println("mang doi tuong1="+Arrays.toString(mang_doi_tuong1));
        //copy kieu 2 dung ham clone
        String[]mang_doi_tuong2=mang_doi_tuong.clone();
        mang_doi_tuong2 [0]="tuananh";
        System.out.println("mang doi tuong 2="+Arrays.toString(mang_doi_tuong2));
    }
}
