package ru.mirea.task12;

import java.util.Arrays;

public class SortTest {
    public static void main(String[] args) {
        Student[] students = generateStudents();
        print(students);

        int[] idNumbers = new int[students.length];
        for (int i = 0; i < students.length; i++) {
            idNumbers[i] = students[i].idNumber;
        }
        InsertionSort.sort(idNumbers);
        print(idNumbers);

        Student[] joined = MergeSort.join(students, generateStudents2());
        print(joined);
    }

    private static void print(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    private static Student[] generateStudents() {
        int count = 5;
        Student[] students = new Student[count];
        students[0] = new Student("Vanya", 80, 5);
        students[1] = new Student("Kolya", 90, 3);
        students[2] = new Student("Nastya", 70, 2);
        students[3] = new Student("Katya", 80, 4);
        students[4] = new Student("Zhenya", 60, 1);

        return students;
    }

    private static Student[] generateStudents2() {
        int count = 3;
        Student[] students = new Student[count];
        students[0] = new Student("Max", 85, 10);
        students[1] = new Student("Glob", 95, 9);
        students[2] = new Student("Mike", 75, 11);

        return students;
    }

    private static void print(Student[] students) {
        for (int i = 0; i < students.length; i++) {
            System.out.println(students[i].idNumber + " " +
                    students[i].name + " " +
                    students[i].GPA);
        }
    }
}
