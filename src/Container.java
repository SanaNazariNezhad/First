public class Container {
    private int length;
    private Integer[] arrays;

    public int getLength() {
        return length;
    }

    public Container(Integer... array) {
        this.length = array.length;
        this.arrays = array;
    }

    public void sortAscending() {
        int temp;
        boolean change;
        for (int i = 0; i < this.arrays.length - 1; i++) {
            change = false;
            for (int j = 0; j < this.arrays.length - i - 1; j++) {
                if (this.arrays[j] > this.arrays[j + 1]) {
                    temp = this.arrays[j];
                    this.arrays[j] = this.arrays[j + 1];
                    this.arrays[j + 1] = temp;
                    change = true;
                }
            }
            if (!change)
                break;

        }
    }

    public void sortDescending() {
        int temp;
        boolean change;
        for (int i = 0; i < this.arrays.length - 1; i++) {
            change = false;
            for (int j = 0; j < this.arrays.length - i - 1; j++) {
                if (this.arrays[j] < this.arrays[j + 1]) {
                    temp = this.arrays[j];
                    this.arrays[j] = this.arrays[j + 1];
                    this.arrays[j + 1] = temp;
                    change = true;
                }
            }
            if (!change)
                break;

        }
    }

    public void insert(int element) {
        this.length += 1;
        Integer[] newArray = new Integer[this.length];
        for (int i = 0; i < this.arrays.length; i++) {
            newArray[i] = this.arrays[i];
        }
        newArray[this.length - 1] = element;
        this.arrays = newArray;

    }

    public void removeIndex(int index) {
        this.length -= 1;
        Integer[] newArray = new Integer[this.length];
        for (int i = 0; i < index; i++) {
            newArray[i] = this.arrays[i];
        }
        for (int i = index + 1; i < this.arrays.length; i++) {
            newArray[i - 1] = this.arrays[i];
        }
        this.arrays = newArray;
    }

    public void removeElement(int element) {
        int counter = 0;
        for (Integer array : this.arrays) {
            if (array.equals(element))
                counter++;
        }
        if (counter != 0) {
            this.length -= counter;
            Integer[] newArray = new Integer[this.length];
            for (int i = 0, j = 0; i < this.arrays.length; i++) {
                if (this.arrays[i] != element) {
                    newArray[j] = this.arrays[i];
                    j++;
                }
            }
            this.arrays = newArray;
        }

    }

    public int search(int element) {
        int index = -1;
        for (int i = 0; i < this.arrays.length; i++) {
            if (this.arrays[i] == element) {
                index = i;
                break;
            }
        }
        return index;
    }

    public void show() {
        System.out.print("{");
        for (int i = 0; i < arrays.length - 1; i++) {
            System.out.print(arrays[i] + ", ");
        }
        System.out.print(arrays[arrays.length - 1] + "}");
    }
}
