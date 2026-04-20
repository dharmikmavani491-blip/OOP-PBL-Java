import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.GridPane;
import javafx.stage.FileChooser;
import javafx.stage.Stage;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class RegistrationForm extends Application {

    @Override
    public void start(Stage stage) {

        // Layout
        GridPane grid = new GridPane();
        grid.setPadding(new Insets(20));
        grid.setHgap(10);
        grid.setVgap(10);

        // Fields
        TextField rollField = new TextField();
        TextField nameField = new TextField();
        TextField ageField = new TextField();
        TextField emailField = new TextField();

        // Labels
        grid.add(new Label("Roll No:"), 0, 0);
        grid.add(rollField, 1, 0);

        grid.add(new Label("Name:"), 0, 1);
        grid.add(nameField, 1, 1);

        grid.add(new Label("Age:"), 0, 2);
        grid.add(ageField, 1, 2);

        grid.add(new Label("Email:"), 0, 3);
        grid.add(emailField, 1, 3);

        // Submit Button
        Button submitBtn = new Button("Submit");
        grid.add(submitBtn, 1, 4);

        submitBtn.setOnAction(e -> {
            try {
                // Validation
                int rollNo = Integer.parseInt(rollField.getText());
                int age = Integer.parseInt(ageField.getText());
                String name = nameField.getText();
                String email = emailField.getText();

                if (!email.contains("@") || !email.contains(".")) {
                    throw new Exception("Invalid email format!");
                }

                // Save to file using FileChooser
                FileChooser fc = new FileChooser();
                fc.setTitle("Save Registration Data");
                fc.getExtensionFilters().add(
                        new FileChooser.ExtensionFilter("Text Files", "*.txt")
                );

                File file = fc.showSaveDialog(stage);

                if (file != null) {
                    BufferedWriter bw = new BufferedWriter(new FileWriter(file, true));
                    bw.write("RollNo: " + rollNo + ", Name: " + name +
                             ", Age: " + age + ", Email: " + email);
                    bw.newLine();
                    bw.close();
                }

                // Success Alert
                Alert success = new Alert(Alert.AlertType.INFORMATION);
                success.setTitle("Success");
                success.setHeaderText("Registration Successful");
                success.setContentText(
                        "RollNo: " + rollNo + "\nName: " + name +
                        "\nAge: " + age + "\nEmail: " + email
                );
                success.showAndWait();

            } catch (NumberFormatException ex) {
                // Numeric validation error
                Alert error = new Alert(Alert.AlertType.ERROR);
                error.setTitle("Error");
                error.setHeaderText("Invalid Input");
                error.setContentText("Roll No and Age must be integers.");
                error.showAndWait();

            } catch (Exception ex) {
                // Other validation errors
                Alert error = new Alert(Alert.AlertType.ERROR);
                error.setTitle("Error");
                error.setHeaderText("Validation Failed");
                error.setContentText(ex.getMessage());
                error.showAndWait();
            }
        });

        Scene scene = new Scene(grid, 400, 250);
        stage.setTitle("Student Registration Form");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
