package org.main;

import javafx.application.Application;
import javafx.stage.Stage;

public class StageInstance extends Application {
    private static Stage stageInstance;
    public static Stage getStage() {
        if(stageInstance == null) {
            stageInstance = new Stage();

        }
        return stageInstance;
    }
    @Override
    public void start(javafx.stage.Stage stage) {
        throw new UnsupportedOperationException("Stage");
    }
}
