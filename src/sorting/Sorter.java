package sorting;

public abstract class Sorter {

    protected final int DELAY = 150;
    protected int[] arr;
    protected GUI gui;

    public Sorter(int[] arr, GUI gui) {
        this.arr = arr;
        this.gui = gui;
    }

    public abstract void sort();

    protected int[] getArr() {
        return this.arr;
    }

    protected GUI getGUI() {
        return this.gui;
    }
}
