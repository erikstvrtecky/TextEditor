package balik;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {


        @Override
        public void start(Stage primaryStage) throws Exception{
            Parent root = FXMLLoader.load(getClass().getClassLoader().getResource("lubos/sukup/main/guidb/MainWindow.fxml"));
            primaryStage.setTitle("vlozit do Databaze");
            primaryStage.setScene(new Scene(root));
            primaryStage.show();
            primaryStage.setResizable(false);
            int expression = 2;

            // switch statement to check size
            switch (expression) {
                case 1:
                    System.out.println("Case 1");

                    // matching case
                case 2:
                    System.out.println("Case 2");

                case 3:
                    System.out.println("Case 3");

                default:
                    System.out.println("Default case");

                    int number = 24;

                    String result = (number > 0) ? "Positive Number" : "Negative Number";
                    System.out.println(result);
            }
        }


        public static void main(String[] args) {
            launch(args);
        }}


