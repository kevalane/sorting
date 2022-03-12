package sorting;

public class Sorter {
    protected int[] arr;
    protected GUI gui;

    public Sorter(int[] arr, GUI gui) {
        this.arr = arr;
        this.gui = gui;
    }

    protected int[] getArr() {
        return this.arr;
    }

    protected GUI getGUI() {
        return this.gui;
    }
}
