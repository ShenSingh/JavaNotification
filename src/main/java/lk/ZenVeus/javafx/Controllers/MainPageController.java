package lk.ZenVeus.javafx.Controllers;

import javafx.event.ActionEvent;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import org.controlsfx.control.Notifications;

import java.net.URL;

public class MainPageController {
    public void clickBtn(ActionEvent actionEvent) {
        showSuccessNotify("Notification is working");
    }
    public static void showSuccessNotify(String contentText) {
        Image icon = new Image("file:///home/shen/Documents/CCCCCCCCCCCCCCCCCCCCCc/javaNotification/src/main/resources/icon/successIcon.png");

        Notifications notifications = Notifications.create()
                .title("Success")
                .text(contentText)
                .graphic(new ImageView(icon)) // Set the image as the graphic
                .hideAfter(javafx.util.Duration.seconds(5))
                .position(javafx.geometry.Pos.BOTTOM_RIGHT);
        playSound(); // invoke the playSound method
        notifications.show();
    }

    private static void playSound() {
        String soundPath = "/sounds/notifySound01.mp3";
        try {
            URL url = MainPageController.class.getResource(soundPath);
            if (url != null) {
                Media media = new Media(url.toExternalForm());
                MediaPlayer mediaPlayer = new MediaPlayer(media);
                mediaPlayer.play();
            }
        } catch (Exception e) {
        }
    }
}
