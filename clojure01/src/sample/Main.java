package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parameters params = getParameters();
        FXMLLoader loader = new FXMLLoader(getClass().getResource("test.fxml"));
        Parent root = loader.load();
        TestController controller = (TestController)loader.getController();
        controller.splitPane.widthProperty().addListener((obs, oldVal, newVal) -> {
            controller.splitPane.setDividerPosition(0, 0.5);
        });
        System.out.println(params.getNamed().get("left"));
        System.out.println(params.getNamed().get("right"));
        controller.textLeft.setText(params.getNamed().get("left"));
        controller.textRight.setText(params.getNamed().get("right"));
        primaryStage.setTitle("Hello World");
        primaryStage.setScene(new Scene((Parent)root, 1024, 768));
        primaryStage.show();
    }


    public static void main(String[] args) {
        //launch(args);
        launch("--left=abc\nxyz", "--right=def\n漢字");
        /*
        Clojure.var("clojure.core/require").invoke(Clojure.read("clojure01.core"));
        IFn func = Clojure.var("clojure01.core", "-main");
        func.invoke(new String[0]);
        */
    }
}
