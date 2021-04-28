package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;

import java.io.FileInputStream;
/*
     #####     #####     #####
     @author: Abdul Al Mamun (Munna)
     #####     #####     #####
*/

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        primaryStage.setTitle("Calculator");
        primaryStage.setScene(new Scene(root, 250, 300));
        primaryStage.setMinWidth(250);
        primaryStage.setMinHeight(300);
        primaryStage.setMaxWidth(400);
        primaryStage.setMaxHeight(500);

        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
