package lab7;

public class RawPrinter implements Printer {
    @Override
    public void print(float[] arr) {
        System.out.print("[ ");
        for (float a : arr) {
            System.out.print(a + " ");
        }
        System.out.print(" ]" + "\n");
    }
}
