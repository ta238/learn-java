import java.util.ArrayList;

public class ViDumang {
    // tra ve so lon nhat  trong mang
    public int TimSoLonNhatTrongMang(int[] mang){
        int n=mang[0];
        for(int i=0;i<mang.length;i++){
            if(mang[i]>n){
                n=mang[i];
            }
        }
        return n;
    }

    public int TimSoLonNhatTrongMang(ArrayList<Integer> mang) {
        int n = mang.get(0);
        for(int i = 0; i < mang.size(); i++) {
            if(mang.get(i) > n) {
                n = mang.get(i);
            }
        }
        return n;
    }

// tra ve tong cac pan tu trong mang
    public int TongCacPhanTuTrongmang(int []mang){
        int tong=0;
        for(int i=0;i< mang.length;i++){
            tong+=mang[i];
        }
        return tong;
    }
    public int TongCacPhanTuTrongMang(ArrayList<Integer>mang){
        int tong= 0;
        for (int i = 0; i < mang.size();i++){
                tong+= mang.get(i);


        }

            return tong;

    }
    public void BaiTap1(int []mang){
        int mang1[]=mang.clone();
        mang[0]=0;
        mang[1]=0;
        mang[2]=0;
        mang[3]=0;
        mang[4]=0;
        mang[5]=0;
        mang[6]=0;
    }
}
