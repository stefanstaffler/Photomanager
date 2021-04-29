package manager.photo.data.file;

import javafx.stage.DirectoryChooser;
import javafx.stage.Window;

import java.io.File;

public class DirectoryControl {
    private DirectoryChooser directoryChooser;

    public DirectoryControl(String title) {
        directoryChooser = new DirectoryChooser();
        directoryChooser.setTitle(title);
        directoryChooser.setInitialDirectory(new File(System.getProperty("user.home")));
    }

    public File openDirectoryChooser(Window window) {
        return directoryChooser.showDialog(window);
    }
}
