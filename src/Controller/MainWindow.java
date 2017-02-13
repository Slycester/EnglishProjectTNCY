package Controller;


import Model.*;
import View.*;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

/**
 * Main window class
 * @author gauthier
 *
 */
public class MainWindow {

	// Application main frame/stage
	private Stage stage;
	
	public MainWindow(Stage s, String urlStyle) {
		// Defines stage
        this.stage = s;
        this.stage.setTitle("English Project App");
        
        // Suppresses window's borders
        this.stage.initStyle(StageStyle.UNDECORATED);

        // Defines main layout and scene
        BorderPane mainPane = new BorderPane();
        mainPane.setTop(new Menu(mainPane, stage));
        mainPane.getStyleClass().add("mainPane");
        // Sets default text on opening application
        mainPane.setCenter(new Label("Welcome on our app!"));
        MainScene scene = new MainScene(mainPane, 800, 600);

        // Sets style sheet and scene
        scene.getStylesheets().add(urlStyle);
		stage.setScene(scene);
		
		// Only way I found to prevent resizing
		this.stage.setMaxWidth(800);
		this.stage.setMaxHeight(600);
		this.stage.setMinWidth(800);
		this.stage.setMinHeight(600);
		
		stage.show();
	}

    /**
     * Returns the main stage.
     * @return stage
     */
    public Stage getStage() {
        return stage;
    }
	
}