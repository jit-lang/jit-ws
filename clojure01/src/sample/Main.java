package sample;

import clojure.java.api.Clojure;
import clojure.lang.IFn;
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
        TestController controller = (TestController)loader.getController();
        controller.setButton1Text("テキスト");
        primaryStage.setTitle("Hello World");
        primaryStage.setScene(new Scene(root, 300, 275));
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
