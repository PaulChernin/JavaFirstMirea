package ru.mirea.task8;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;

public class ImageWindow extends Application {
    static String uri;

    public static void main(String[] args) {
        uri = args[0];

        Application.launch();
    }

    int width = 500;
    int height = 400;

    @Override
    public void start(Stage stage) throws Exception {
        stage.setTitle("Image application");

        Group root = new Group();

        Image image = new Image(uri);
        ImageView imageView = new ImageView(image);

        imageView.setFitHeight(height);
        imageView.setFitWidth(width);

        root.getChildren().add(imageView);

        Scene scene = new Scene(root, width, height);
        stage.setScene(scene);
        stage.show();
    }
}
