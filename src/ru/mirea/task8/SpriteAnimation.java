package ru.mirea.task8;

import javafx.animation.Interpolator;
import javafx.animation.Transition;
import javafx.geometry.Rectangle2D;
import javafx.scene.image.ImageView;
import javafx.util.Duration;

public class SpriteAnimation extends Transition {
    private final ImageView imageView;
    private final int number = 6;

    public SpriteAnimation(ImageView imageView) {
        this.imageView = imageView;
        setCycleDuration(Duration.millis(1000));
        setInterpolator(Interpolator.LINEAR);
    }

    @Override
    protected void interpolate(double k) {
        final double index = ((double) number) * k;

        if (index < number) {
            final int x =  48 * (int) index;
            imageView.setViewport(new Rectangle2D(x, 0, 48, 48));
        }
    }
}
