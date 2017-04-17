package ${package};

import com.vibridi.fxmlutils.FXUtils;

import ${package}.utils.AppContext;

import javafx.application.Application;
import javafx.stage.Stage;

public class JavaFXApplication extends Application {

	public static void main(String[] args) {
		launch();
	}

	public JavaFXApplication() throws Exception {
	}

	@Override
	public void start(Stage primaryStage) throws Exception {	
		FXUtils.newView(this.getClass(), "view/mainview.fxml")
			.makeStage("${artifactId} " + AppContext.VERSION_NUMBER)
			.build()
			.show();
	}

}

