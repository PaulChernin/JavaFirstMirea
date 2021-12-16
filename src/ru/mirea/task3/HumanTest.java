package ru.mirea.task3;

public class HumanTest {
    public static void main(String[] args) {
        Human human = new Human();
        human.setEyesColor("green");
        human.setHeadSize(30.0);
        human.setHandsLength(50.0);
        human.setLegsLength(70.0);

        System.out.println(human);
    }
}
