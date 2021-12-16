package ru.mirea.task22;

public class Client {
    public void sit(Chair chair) {
        System.out.println("sit");
        chair.use();
    }

    public static void main(String[] args) {
        ChairFactory factory = new MagicFactory();
        Chair chair = factory.createChair();

        Client client = new Client();
        client.sit(chair);
    }
}
