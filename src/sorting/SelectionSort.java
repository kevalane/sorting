package sorting;

public class SelectionSort {

    private int[] arr;
    private GUI gui;

    public SelectionSort(int[] arr, GUI gui) {
        this.arr = arr;
        this.gui = gui;
    }  

    public void sort() {
        for (int i = 0; i < this.arr.length-1; i++) {
            int indexToSwap = i;
            for (int k = i+1; k < this.arr.length; k++) {
                if (this.arr[k] < this.arr[indexToSwap])
                    indexToSwap = k;
            }
            int temp = this.arr[indexToSwap];
            this.arr[indexToSwap] = this.arr[i];
            this.arr[i] = temp;
            this.gui.changeArr(this.arr);
            try {
                Thread.sleep(50);
                this.gui.repaint();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        

        for (int i = 0; i < this.arr.length; i++) {
            System.out.print(String.valueOf(this.arr[i]) + " ");
        }
    }

    private int[] getArr() {
        return this.arr;
    }
}
