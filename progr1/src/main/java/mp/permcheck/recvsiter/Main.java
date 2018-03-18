package mp.permcheck.recvsiter;

public class Main { //ciąg Fibonacciego
    private static int fibRec(int n) {
        if (n < 3) {
            return 1;
        }

        return fibRec(n - 2) + fibRec(n - 1);

    }

    private static int fibIter(int n) {
        int f1 = 1;
        int f2 = 1;

        //for (int i = 3; i <= n; i++){

        //while(n > 2)
        for(int i = 3; i <=n; i++){
            int temp = f2;
            f2 = f1 + f2; //ale nadpisała się wartość więc
            f1 = temp; //musimy to skopiować, bo potrzebue stare f2 żeby nim stało się f1 (to stara wartość f2?)
            //n--
        }

        return f2;
    }

    public static void main(String[] args) {
        System.out.println(fibRec(6)); //wersja rekurencyjna
        System.out.println(fibIter(6)); //wersja iteracyjna

    }
}
