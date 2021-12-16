package ru.mirea.task22;

public class MagicFactory implements ChairFactory {

    @Override
    public Chair createChair() {
        return new Chair() {
            @Override
            public void use() {
                System.out.println("using magic chair");
            }
        };
    }
}
