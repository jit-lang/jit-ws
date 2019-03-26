package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        //Parent root = FXMLLoader.load(getClass().getResource("test.fxml"));
        FXMLLoader loader = new FXMLLoader(getClass().getResource("test.fxml"));
        Parent root = loader.load();
        TestController2 controller = (TestController2)loader.getController();
        //controller.setButton1Text("テキスト");
        //splitPane.setDividerPosition(splitPane.getWidth()/2);
        controller.splitPane.widthProperty().addListener((obs, oldVal, newVal) -> {
            controller.splitPane.setDividerPosition(0, 0.5);
        });
        primaryStage.setTitle("Hello World");
        primaryStage.setScene(new Scene((Parent)root, 1024, 768));
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
        /*
        Clojure.var("clojure.core/require").invoke(Clojure.read("clojure01.core"));
        IFn func = Clojure.var("clojure01.core", "-main");
        func.invoke(new String[0]);
        */
    }
}
