package zadanieBinaryGap;

public class Main {
    public static void main(String[] args) {
        System.out.println(maxZeroSequence(37));

    }

    //100101 = 37 = n(na tej liczbie działamy)
    /* max = 0  curr = 0  q =false bit =1  n= 18
                curr = 1           bit = 0 n=9
                                    bit=1

     */
    private static int maxZeroSequence (int n){
        int max = 0; //kandydat na maksimum - długość aktualnie najdłuższego podciągu zer pomiędzy jedynkami //będę to max akutaulizować
        int current = 0; //aktualna liczba zer w badanym podciągu "zerowym" //jeśli napotkam 1, to zwiększam liczbę 0
        boolean q =false; //jeśli true to znaczy że już natrafiliśmy na 1

        while (n>0){ //jak dzielimy ciągle przez 0, to w końcu dojdzie do 0
            int bit = n %2; //ekstrakcja bitu

            if(bit==0) {
                if (q) { //jeśli wcześniej wystąpiła jedynka, to mogę zliczyć to zero (warunek zadania - treść)
                    current++;
                }

                else {//znaczy to że natrafiliśmy na 1
                    q = true; //natrafiliśmy na 1 więc mogę teraz sprawdzić czy liczba 0 do tej pory nie jest większa nić zliczone maksimum

                    //ta jedynka konczy pewien zerowy ciąg i mogę sprawdzić czy długość tego ciągu jest większa niż długość najdłuższego?
                    //dotychczasowego (wcześniejszego) ciągu 0
                    if (current > max){
                        max = current;
                    }
                    current = 0; //restart licznika żeby od nowa zliczać zera kolejnego podciągu
                }
                //n = n/2; //żeby mieć dostęp do kolejnego bitu w kolejnej iteracji
            }
            n = n/2; //żeby mieć dostęp do kolejnego bitu w kolejnej iteracji
        }
        return max;
    }
}









//    A binary gap within a positive integer N is any maximal sequence of consecutive zeros that is surrounded by ones at both ends in the binary representation of N.
//
//        For example, number 9 has binary representation 1001 and contains a binary gap of length 2. The number 529 has binary representation 1000010001 and contains two binary gaps: one of length 4 and one of length 3. The number 20 has binary representation 10100 and contains one binary gap of length 1. The number 15 has binary representation 1111 and has no binary gaps.
//
//        Write a function:
//
//        int solution(int N);
//
//        that, given a positive integer N, returns the length of its longest binary gap. The function should return 0 if N doesn't contain a binary gap.
//
//        For example, given N = 1041 the function should return 5, because N has binary representation 10000010001 and so its longest binary gap is of length 5.
//
//        Assume that:
//
//        N is an integer within the range [1..2,147,483,647].
//        Complexity:
//
//        expected worst-case time complexity is O(log(N));
//        expected worst-case space complexity is O(1).