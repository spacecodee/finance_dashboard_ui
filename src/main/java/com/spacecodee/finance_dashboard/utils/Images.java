package com.spacecodee.finance_dashboard.utils;

import javafx.scene.SnapshotParameters;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.image.WritableImage;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;

import java.io.File;

public class Images {
    private static final String URL_MAIN = "com/spacecodee/finance_dashboard/assets/";

    public static void addImg(String url, ImageView imageView) {
        try {
            File fileImgBack = new File(Images.URL_MAIN + url);
            Image imgBack = new Image(fileImgBack.toURI().toString());
            imageView.setImage(imgBack);
        } catch (Exception ex) {
            System.out.println("I'm Sorry, an ocurrent error, not image\n");
            ex.printStackTrace(System.out);
        }
    }

    public static void addImg(String url, Label label) {
        File fileImgBack = new File(Images.URL_MAIN + url);
        Image imgBack = new Image(fileImgBack.toURI().toString());
        ImageView view = new ImageView(imgBack);
        view.setFitWidth(400);
        view.setPreserveRatio(true);
        label.setGraphic(view);
    }

    public static void borderRadiusImgProfile(ImageView imageView) {
        Rectangle clip = new Rectangle(
                imageView.getFitWidth(), imageView.getFitHeight()
        );
        clip.setArcWidth(150);
        clip.setArcHeight(150);
        imageView.setClip(clip);

        // snapshot the rounded image.
        SnapshotParameters parameters = new SnapshotParameters();
        parameters.setFill(Color.TRANSPARENT);
        WritableImage image = imageView.snapshot(parameters, null);

        // remove the rounding clip so that our effect can show through.
        imageView.setClip(null);

        // store the rounded image in the imageView.
        imageView.setImage(image);
    }

    public static void borderRadiusImgProfile(ImageView imageView, int radius) {
        Rectangle clip = new Rectangle(
                imageView.getFitWidth(), imageView.getFitHeight()
        );
        clip.setArcWidth(radius);
        clip.setArcHeight(radius);
        imageView.setClip(clip);

        // snapshot the rounded image.
        SnapshotParameters parameters = new SnapshotParameters();
        parameters.setFill(Color.TRANSPARENT);
        WritableImage image = imageView.snapshot(parameters, null);

        // remove the rounding clip so that our effect can show through.
        imageView.setClip(null);

        // store the rounded image in the imageView.
        imageView.setImage(image);
    }
}
