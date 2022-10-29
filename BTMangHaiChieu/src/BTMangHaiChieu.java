public class BTMangHaiChieu {
    public int Sum1(int[]mang){
        int tong=0;
        for(int i=0;i< mang.length;i++){
            tong+=mang[i];
        }
        return tong;
    }
    //bt1 tra ve tong c dai cac ptu cua mang co tong =0
    public int BaiTap1(int[][]mang){
        int n=0;
        for(int i=0;i< mang.length;i++){

            if(Sum1(mang[i])==0){
            n+= mang[i].length;

            }

        }
        return n;
    }
    //bt2 tinh tong lenght nhat
    public int SumMax(int[][]mang){
        int n=Sum1(mang[0]);
        int lenghtMax= mang[0].length;
        for(int i=0;i<mang.length;i++) {
            if(mang[i].length>lenghtMax){
                lenghtMax=mang[i].length;
                n=Sum1(mang[i]);
            }
        }
        return n;
    }
    // bt3 m1c tong cac phan tu >0
    public int Sum(int[]mang){
        int tong=0;
        for(int i =0;i< mang.length;i++){
            if(mang[i]>0){
                tong+=mang[i];
            }
        }
        return tong;
    }
    public boolean ToanSoDuong(int[]mang){
        for(int i=0;i< mang.length;i++){
            if(mang[i]>0||mang.length>0){
                return true;
            }if(mang[i]<0||mang.length<0)
                return false;

        }return true;
    }

}
