package lab7;

public class BubbleSort implements Sorter {

    @Override
    public void sort(float[] arr) {
        float temp;
        int N = arr.length;
        for (int i = 0; i < N-1; i++) {
            for (int j = 0; j < N-1-i; j++) {
                if (arr[j] > arr[j+1]){
                    temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }
}
