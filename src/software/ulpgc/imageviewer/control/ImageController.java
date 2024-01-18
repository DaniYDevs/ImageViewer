package software.ulpgc.imageviewer.control;



import software.ulpgc.imageviewer.model.ImageModel;
import software.ulpgc.imageviewer.view.ImageView;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class ImageController {
    private ImageModel model;
    private ImageView view;

    public ImageController(ImageModel model, ImageView view) {
        this.model = model;
        this.view = view;

        view.displayImage(model.getCurrentImage());

        view.getNextButton().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                model.nextImage();
                view.displayImage(model.getCurrentImage());
            }
        });

        view.getPrevButton().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                model.prevImage();
                view.displayImage(model.getCurrentImage());
            }
        });

        view.getOpenButton().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JFileChooser fileChooser = new JFileChooser();
                int result = fileChooser.showOpenDialog(view);

                if (result == JFileChooser.APPROVE_OPTION) {
                    String imagePath = fileChooser.getSelectedFile().getAbsolutePath();
                    model.addImage(imagePath);
                    view.displayImage(imagePath);
                }
            }
        });
    }

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
