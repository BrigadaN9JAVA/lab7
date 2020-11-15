package lab7;

public class InsertionSort implements Sorter{
    @Override
    public void sort(float[] arr) {
        int N = arr.length;
        float key;
        int j;
        for (int i = 1; i < N; i++) {
            key = arr[i];
            j = i - 1;
            while(j >= 0 && arr[j] > key){
                arr[j+1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key;
        }
    }
}
