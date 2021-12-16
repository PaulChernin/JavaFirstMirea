package ru.mirea.task20;

import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class TaskManager {
    private static Scanner in = new Scanner(System.in);

    private ArrayList<Task> tasks = new ArrayList<>();

    public void addTask(String developer) {
        tasks.add(new Task(developer));
    }

    public void closeTask(String developer) {
        findTask(developer).close();
    }

    private Task findTask(String developer) {
        for (int i = 0; i < tasks.size(); i++) {
            if (tasks.get(i).developer.equals(developer)) {
                return tasks.get(i);
            }
        }

        return null;
    }

    public static void main(String[] args) {
        TaskManager tm = new TaskManager();

        for (String command = in.nextLine(); !command.equals("exit"); command = in.nextLine()) {
            switch (command) {
                case "add":
                    tm.addTask(in.nextLine());
                    break;
                case "close":
                    tm.closeTask(in.nextLine());
                    break;
                case "print":
                    tm.printTasks();
                    break;
            }
        }
    }

    private void printTasks() {
        for (int i = 0; i < tasks.size(); i++) {
            tasks.get(i).print();
        }
    }
}
