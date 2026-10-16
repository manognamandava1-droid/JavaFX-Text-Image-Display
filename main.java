import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage stage) {

        stage.setTitle("Text and Image Display");

        Label label = new Label("Hello, JavaFX!");

        Image image = new Image(
            "https://placehold.co/250x150/png"
        );

        ImageView imageView = new ImageView(image);
        imageView.setFitWidth(250);
        imageView.setFitHeight(150);
        imageView.setPreserveRatio(true);

        VBox root = new VBox(15);
        root.getChildren().addAll(label, imageView);

        Scene scene = new Scene(root, 350, 250);

        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
