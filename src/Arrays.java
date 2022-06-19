
/*
                      Building a dynamic array where you can add , remove , search elements with no boundaries.

                                     Created by hussein shamas.
 */

public class Arrays {

    private int[] array;
    private int count;

    public Arrays(int length) {

        array = new int[length];

    }

    public void insert(int item) {
        if (array.length == count) {
            int[] newArray = new int[count * 2];
            for (int i = 0; i < count; i++)
                newArray[i] = array[i];

            array = newArray;
        }
        array[count] = item;
        count++;
    }

    public void removeAt(int index) {
        if (index < 0 || index >= count) throw new IllegalArgumentException();
        for (int i = index; i < count; i++)
            array[i] = array[i + 1];
        count--;

    }

    public int indexOf(int item) {
        for (int i = 0; i < count; i++)
            if (array[i] == item) {
                return i;
            }

        return -1;
    }

    public String toString() {

        StringBuilder sb = new StringBuilder(count).append(" [");
        for (int i = 0; i < count-1; i++)
            sb.append(array[i]).append(",");
        return sb.append(array[count-1]).append("]").toString();


    }
}
