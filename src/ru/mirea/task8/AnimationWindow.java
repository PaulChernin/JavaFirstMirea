package ru.mirea.task8;

import javafx.animation.Animation;
import javafx.application.Application;
import javafx.geometry.Rectangle2D;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;

public class AnimationWindow extends Application {
    public static void main(String[] args) {
        Application.launch();
    }

    @Override
    public void start(Stage stage) throws Exception {
        stage.setTitle("Animation application");

        Image image = new Image("Walk.png");

        final ImageView imageView = new ImageView(image);
        imageView.setViewport(new Rectangle2D(0, 0, 48, 48));
        imageView.setX(90);
        imageView.setY(90);

        final Animation animation = new SpriteAnimation(
                imageView
        );
        animation.setCycleCount(Animation.INDEFINITE);
        animation.play();

        stage.setScene(new Scene(new Group(imageView), 200, 200));
        stage.show();
    }
}
