package ru.mirea.task8;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

import java.util.Random;

public class ShapesWindow extends Application {
    public static void main(String[] args) {
        Application.launch();
    }

    int width = 500;
    int height = 400;

    @Override
    public void start(Stage stage) throws Exception {
        stage.setTitle("Shapes application");

        stage.setWidth(width);
        stage.setHeight(height);

        int n = 10;
        Group root = new Group();
        Random rand = new Random();

        for (int i = 0; i < n; i++) {
            MyShape shape;
            Color color = getRandomColor();

            int choice = rand.nextInt(2);
            if (choice == 0) {
                shape = new MyCircle(color, rand.nextFloat((float) width), rand.nextFloat((float) height));
            } else {
                shape = new MySquare(color, rand.nextFloat((float) width), rand.nextFloat((float) height));
            }

            root.getChildren().add(shape.getFXShape());
        }


        Scene scene = new Scene(root, width, height);

        stage.setScene(scene);
        stage.show();
    }

    private Color getRandomColor() {
        Random rand = new Random();

        return Color.rgb(rand.nextInt(256), rand.nextInt(256), rand.nextInt(256));
    }
}
