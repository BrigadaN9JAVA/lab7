package lab7;

public class SelectionSort implements Sorter {
    @Override
    public void sort(float[] arr) {
        int N = arr.length;
        int minIndex;
        float temp;
        for (int i = 0; i < N-1; i++) {
            minIndex = i;
            for (int j = i+1; j < N; j++) {
                if (arr[j] < arr[minIndex]){
                    minIndex = j;
                }
            }
            temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }
    }
}
