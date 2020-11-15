package lab7;

public class Lab7 {
    public static void main(String[] args) {
        DataProcessor dataProcessor = new DataProcessor(new BubbleSort(), new RawPrinter(), new RandomiserOfFloatNumbers());
        dataProcessor.processData(0);
        dataProcessor.processData(-10);

        dataProcessor.processData(10);

        dataProcessor.setSorter(new InsertionSort());
        dataProcessor.processData(100);

        dataProcessor.setSorter(new SelectionSort());
        dataProcessor.processData(1000);
    }
}
