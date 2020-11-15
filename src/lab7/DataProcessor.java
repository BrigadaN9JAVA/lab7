package lab7;

public class DataProcessor {
    private Sorter sorter;
    private Printer printer;
    private Randomiser randomiser;

    public DataProcessor(){
        sorter = new BubbleSort();
        printer = new RawPrinter();
        randomiser = new RandomiserOfFloatNumbers();
    }

    public DataProcessor(Sorter sorter, Printer printer, Randomiser randomiser){
        this.sorter = sorter;
        this.printer = printer;
        this.randomiser = randomiser;
    }

    public void setSorter(Sorter sorter) {
        this.sorter = sorter;
    }

    public void setPrinter(Printer printer) {
        this.printer = printer;
    }

    public void setRandomiser(Randomiser randomiser) {
        this.randomiser = randomiser;
    }

    public void processData(int N){
        try {
            if (N <= 0) throw new IllegalArgumentException("> Param N must be above zero!!!");

            float[] arr = new float[N];
            randomiser.fillArray(arr);
            System.out.println("\n> Массив перед сортировкой:\n");
            printer.print(arr);
            sorter.sort(arr);
            System.out.println("\n> Массив после сортировки:\n");
            printer.print(arr);
        } catch (Exception err){
            System.out.println(err.getMessage() + "\n");
        }
    }
}
