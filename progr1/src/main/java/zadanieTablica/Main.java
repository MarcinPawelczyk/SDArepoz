package zadanieTablica;

public class Main {

    public static void main(String[] args) {
        int[] myArray = {-1, -2, 0, 2, 7, 10, 11};
        System.out.println(trueOrFalse(myArray));
    }

    //i: 0  1   2  3
//   2, 4, 6, 4  //tutaj bardziej optymalnie można pomyśleć, że 2+4 nie będzie nigdy równe 2
    //O(n) jest to funkcja liniowa (przyrost liniowy) więc O(n)

    public static boolean trueOrFalse(int[] Array) {
        int sum = Array[0] + Array[Array.length - 1];
        for (int i = 0; i <= Array.length; i++) { //można by od int i = 1 aż do Array.length - 2
            if (sum == Array[i]) {
                return true;
            }

        }
        return false;
    }
}


//
//    Zadanie rozgrzewkowe
//    Napisz funkcję która dla podanego argumentu - tablicy jednowymiarowej liczb całkowitych
//        zwróci true gdy istnieje taka liczba należąca do tej tablicy że jest ona równa sumie pierwszego i ostatniego  elementu tej tablicy
//        false - w przeciwnym wypadku
//
//        Np. dla tablicy [1,-1 ,0, 2]   - false
//        ---                  [3,  5, 1  ,-2] - true (bo 3 + (-2) = 1 które należy do tablicy)
//
//        !!!tak zaimplemenować zeby byla minimalna liczba wszystkich operacji

//liczby naturalne: 1,2,3,4,5,
//liczby całkowite: −3,−2,−1, 0, 1, 2, 3


//Zadanie jest ok zrobione, ale chodzi o to żeby było optymalnie zrobione, to znaczy żeby jak najmiej obciążyć procesor
//więc tam powyżej można by pominąć indeks 1 i drugi od końca (czyli nie length -1, bo to ostatni tylko length -2).