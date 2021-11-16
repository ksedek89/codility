package sort;
public class MergeSort {
    public static void main(String[] arg){
        int[] tableToSort = {1,2,3,4,5,6,7,8,9,10};
        //O( log2element * n)

        MergeSort mergeSort = new MergeSort();
        mergeSort.mergeSort(tableToSort, tableToSort.length);
        System.out.println();
    }


    public void mergeSort(int[] a, int n) {
        if (n < 2) {
            return;
        }
        int mid = n / 2;
        int[] l = new int[mid];
        int[] r = new int[n - mid];

        for (int i = 0; i < mid; i++) {
            l[i] = a[i];
        }
        for (int i = mid; i < n; i++) {
            r[i - mid] = a[i];
        }
        mergeSort(l, mid);
        mergeSort(r, n - mid);

        merge(a, l, r, mid, n - mid);
    }

    public static void merge(int[] a, int[] l, int[] r, int left, int right) {
        //dwie tablice i i j wrzucamy do a
        int i = 0, j = 0, k = 0;
        while (i < left && j < right) {
            //sprawdzamy dwa pierwsze elementy, i wstawiamy większy podnosząć licznik i lub j.
            // W następnej iteracji powrównujemy kolejny element l lub right (w zaleznosci od tego który był mniejszy
            // i porównujemy go z użytym wcześniej elementem z drugiej tablicy. Powtarzamy dopóki się nie skończą elementy z jednej tablicy.
            if (l[i] <= r[j]) {
                a[k++] = l[i++];
            }
            else {
                a[k++] = r[j++];
            }
        }
        // na koniec a dodajemy te elementy które zostały w tablicy l lub r w zaleznosci
        // od tego w której zostały niewykorzystane elementy to znaczy tak naprawdę tam gdzie jest największy/największe elementy
        while (i < left) {
            a[k++] = l[i++];
        }
        while (j < right) {
            a[k++] = r[j++];
        }
    }

}
