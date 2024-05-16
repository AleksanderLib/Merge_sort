package Merge_sort;

public class Merge {

    public static void mergeS(int[] arr,int p,int r){

        if (p< r)
        {
            //Поиск середины
            int q = (p+r)/2;
            //Сортировка первой и второй половины
            mergeS(arr,p, q);
            mergeS(arr , q+1, r);
            //Объединение
            merge(arr, p,q, r);
        }
    }
    public static void merge(int arr[], int p, int q, int r){
        //Поиск размера двух подмассивов для слияния
        int n1 = q - p + 1;
        int n2 = r - q;
        //Временные массивы
        int L[] = new int [n1];
        int R[] = new int [n2];
        //Копируем данные во временные массивы
        for (int i=0; i<n1; ++i)
            L[i] = arr[p + i];
        for (int j=0; j<n2; ++j)
            R[j] = arr[q + 1+ j];

        //Объединение временных массивов

        int i = 0, j = 0;

        int k = p;
        while (i < n1 && j < n2)
        {
            if (L[i] <= R[j])
            {
                arr[k] = L[i];
                i++;
            }
            else
            {
                arr[k] = R[j];
                j++;
            }
            k++;
        }
        //Копируем оставшиеся элементы в L[],если они есть
        while (i < n1)
        {
            arr[k] = L[i];
            i++;
            k++;
        }
        //Копируем оставшиеся элементы в R[],если они есть
        while (j < n2)
        {
            arr[k] = R[j];
            j++;
            k++;
        }

}
}

