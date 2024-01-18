package software.ulpgc.imageviewer;


import software.ulpgc.imageviewer.control.ImageController;
import software.ulpgc.imageviewer.model.ImageModel;
import software.ulpgc.imageviewer.view.ImageView;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                ImageModel model = new ImageModel();
                ImageView view = new ImageView();
                ImageController controller = new ImageController(model, view);
                view.setVisible(true);
            }
        });
    }
}