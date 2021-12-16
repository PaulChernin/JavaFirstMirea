package ru.mirea.task12;

public class MergeSort {
    public static Student[] join(Student[] a1, Student[] a2) {
        Student[] joined = new Student[a1.length + a2.length];
        for (int i = 0; i < a1.length; i++) {
            joined[i] = a1[i];
        }
        for (int i = 0; i < a2.length; i++) {
            joined[i + a1.length] = a2[i];
        }

        sort(joined, 0, joined.length);
        return joined;
    }

    public static void sort(Student[] array, int left, int right) {
        if (right - left <= 1) return;

        int delimiter = left + ((right - left) / 2);
        if (right - left > 2) {
            sort(array, left, delimiter);
            sort(array, delimiter, right);
        }

        Student[] buffer = new Student[right - left];
        int leftPos = left;
        int rightPos = delimiter;
        for (int i = 0; i < buffer.length; i++) {
            if (rightPos < right && (array[rightPos].GPA < array[leftPos].GPA || leftPos == delimiter)) {
                buffer[i] = array[rightPos];
                rightPos++;
            } else {
                buffer[i] = array[leftPos];
                leftPos++;
            }
        }

        for (int i = 0; i < buffer.length; i++) {
            array[i + left] = buffer[i];
        }
    }
}
