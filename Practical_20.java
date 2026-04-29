import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.shape.Circle;
import javafx.scene.control.Button;
import javafx.scene.control.Slider;
import javafx.scene.layout.VBox;
import javafx.animation.AnimationTimer;

public class BallFX extends Application {

    double x = 50;
    double dx = 3;
    boolean run = false;

    public void start(Stage stage) {

        Pane pane = new Pane();
        pane.setPrefSize(400, 200);

        Circle ball = new Circle(20);
        ball.setCenterY(100);

        Button start = new Button("Start");
        Button stop = new Button("Stop");

        Slider speed = new Slider(1, 10, 3);

        start.setOnAction(e -> run = true);
        stop.setOnAction(e -> run = false);

        pane.getChildren().add(ball);

        VBox root = new VBox(10, pane, start, stop, speed);

        AnimationTimer timer = new AnimationTimer() {
            public void handle(long now) {
                if (run) {
                    x += dx;

                    if (x > pane.getWidth() - 20 || x < 20)
                        dx = -dx;

                    dx = dx > 0 ? speed.getValue() : -speed.getValue();

                    ball.setCenterX(x);
                }
            }
        };

        timer.start();

        Scene scene = new Scene(root, 450, 320);
        stage.setScene(scene);
        stage.setTitle("Bouncing Ball");
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
