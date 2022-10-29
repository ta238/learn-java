public class ViDu {
    //bt1tra ve gia tri cac pan tu tong=0 mang 2c
    public int Sum(int[] mang) {
        int tong = 0;
        for (int i = 0; i < mang.length; i++) {
            tong += mang[i];
        }
        return tong;
    }

    public int Sum1(int[][] mang) {
        int n = 0;
        for (int i = 0; i < mang.length; i++) {
            if (Sum(mang[i]) == 0) {
                n += mang[i].length;
            }
        }
        return n;
    }

    //bt 2 tinh do dai nhat trong mang 2c
    public int SumMax(int[][] mang) {
        int n=Sum(mang[0]);
        int LenghtMax=mang[0].length;
        for(int i=0;i< mang.length;i++){
            if(mang[i].length>LenghtMax){
                LenghtMax= mang[i].length;
                n=Sum(mang[i]);
            }
        }
        return n;
    }
}