import javafx.application.Application;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.layout.BorderPane;
import javafx.scene.paint.Color;
import javafx.scene.Scene;
import javafx.scene.shape.Polygon;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;


public class TicTacToe extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {
        stage.setTitle(getClass().getSimpleName());

        // Use Border pane to center content
        BorderPane pane = new BorderPane();
        Canvas canvas = new Canvas(300, 300);
        pane.setCenter(canvas);
        GraphicsContext graphicsContext = canvas.getGraphicsContext2D();
        graphicsContext.setFill(Color.GRAY);
        draw(graphicsContext);
        stage.setScene(new Scene(pane));
        stage.show();
    }
    
    private void draw(GraphicsContext g) {
      Color red = Color.RED;
      Color black = Color.BLACK;
      // YOUR CODE GOES HERE
    }
    
}
