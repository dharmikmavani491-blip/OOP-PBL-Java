import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Text;
import javafx.geometry.Pos;
import javafx.stage.Stage;

public class GradeBarChart extends Application {

    // Method to create a bar with label
    private VBox createBar(String label, int percentage, Color color) {
        double heightFactor = 3; // scale factor for visibility

        Rectangle bar = new Rectangle(50, percentage * heightFactor);
        bar.setFill(color);

        Text text = new Text(label + " — " + percentage + "%");

        VBox vbox = new VBox(5);
        vbox.setAlignment(Pos.BOTTOM_CENTER);
        vbox.getChildren().addAll(bar, text);

        return vbox;
    }

    @Override
    public void start(Stage stage) {

        // Create bars
        VBox projects = createBar("Projects", 20, Color.RED);
        VBox quizzes = createBar("Quizzes", 10, Color.BLUE);
        VBox midterm = createBar("Midterm Exams", 30, Color.GREEN);
        VBox finalExam = createBar("Final Exam", 40, Color.ORANGE);

        // Arrange bars horizontally
        HBox root = new HBox(20);
        root.setAlignment(Pos.BOTTOM_CENTER);
        root.getChildren().addAll(projects, quizzes, midterm, finalExam);

        Scene scene = new Scene(root, 500, 300);

        stage.setTitle("Grade Distribution Bar Chart");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
