package ru.mirea.task20;

import java.util.Date;

public class Task {
    public String developer;
    public Date openingDate;
    public Date closingDate;
    public boolean isOpen = true;

    public Task(String developer) {
        this.developer = developer;
        this.openingDate = new Date();
    }

    public void close() {
        isOpen = false;
        closingDate = new Date();
    }

    public void print() {
        System.out.print(developer + " " + openingDate + " ");
        if (isOpen) {
            System.out.println("open");
        } else {
            System.out.println("- " + closingDate);
        }
    }
}
