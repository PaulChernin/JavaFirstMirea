package ru.mirea.task22;

public class MultifunctionalFactory implements ChairFactory {

    @Override
    public Chair createChair() {
        return new Chair() {
            @Override
            public void use() {
                System.out.println("using multifunctional chair");
            }
        };
    }
}
