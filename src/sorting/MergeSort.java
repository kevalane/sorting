package sorting;

public class MergeSort extends Sorter {

    public MergeSort(int[] arr, GUI gui) {
        super(arr, gui);
    }

    public void sort() {
        int[] tmp = new int[this.arr.length];
        sort(tmp, 0, this.arr.length-1);
    }

    private void sort(int[] tempArray, int first, int last) {
        if (first < last) {
            int mid = first + (last - first)/2;
            sort(tempArray, first, mid);
            this.gui.changeArr(this.arr);
            try {
                Thread.sleep(50);
                this.gui.repaint();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            sort(tempArray, mid+1, last);
            this.gui.changeArr(this.arr);
            try {
                Thread.sleep(50);
                this.gui.repaint();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            merge(tempArray, first, mid + 1, last);
            this.gui.changeArr(this.arr);
            try {
                Thread.sleep(50);
                this.gui.repaint();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    private void merge(int[] tmpArray, int leftPos, int rightPos, int rightEnd) {
		int leftEnd = rightPos - 1;
		int tmpPos = leftPos;
		int leftStart = leftPos;

		while(leftPos <= leftEnd && rightPos <= rightEnd) {
			if (this.arr[leftPos] <= this.arr[rightPos]) {
				tmpArray[tmpPos++] = this.arr[leftPos++];
			} else {
				tmpArray[tmpPos++] = this.arr[rightPos++];
			}
		}

		while (leftPos <= leftEnd) {
			tmpArray[tmpPos++] = this.arr[leftPos++];
		}
		
		while (rightPos <= rightEnd) {
			tmpArray[tmpPos++] = this.arr[rightPos++];
		}
		
		for (int i = leftStart; i <= rightEnd; i++) {
			this.arr[i] = tmpArray[i];
		}
	}
}
