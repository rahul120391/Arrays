public class PronicNumber {

    public static boolean checkIfPronicNumber(int n){
        int sqrt = (int)Math.sqrt(n);
        return sqrt * (sqrt + 1) == n;
    }

    public static int forA(int n){
        int sqrt = (int)Math.sqrt(n);
        if(sqrt*(sqrt+1) < n)
            return sqrt;
        else return sqrt-1;
    }

    public static int forB(int n){
        int sqrt = (int)Math.sqrt(n);
        if(sqrt*(sqrt+1) <= n)
            return sqrt;
        else return sqrt-1;
    }

    public static int findCount(int A, int B){
        int a = forA(A);
        int b = forB(B);
        return b-a;
    }



    public static void main(String[] args){
        int count = 0;
      /*  for (int i = 1; i <=1000000000 ; i++) {
            if(i%2 == 0 && checkIfPronicNumber(i)){
                count++;
            }
        }
        System.out.println("count = "+count)*/;
        System.out.println("count is = "+findCount(1,1000000000));
    }
}
