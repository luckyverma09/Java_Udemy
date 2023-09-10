public class SharedDigit {
    public static boolean hasSharedDigit(int a, int b) {
        if ((a < 10 || a > 99) || (b < 10 || b > 99)) return false;
        int fa = a/10;
        int la = a%10;
        int fb = b/10;
        int lb = b%10;

        if(fa == fb || fa == lb) {
            return true;
        }else if(la == fb || la == lb){
            return true;
        }else return false;

    }
}
