package software.ulpgc.imageviewer.view;

import javax.swing.*;
import java.awt.*;

public class ImageView extends JFrame {
    private JLabel imageLabel;
    private JButton nextButton;
    private JButton prevButton;
    private JButton openButton;

    public ImageView() {
        setTitle("Image Viewer");
        setSize(800, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        imageLabel = new JLabel();
        add(imageLabel, BorderLayout.CENTER);

        JPanel buttonPanel = new JPanel();
        nextButton = new JButton("Next");
        prevButton = new JButton("Previous");
        openButton = new JButton("Open Image");

        buttonPanel.add(prevButton);
        buttonPanel.add(nextButton);
        buttonPanel.add(openButton);

        add(buttonPanel, BorderLayout.SOUTH);
    }

    public void displayImage(String imagePath) {
        ImageIcon icon = new ImageIcon(imagePath);
        imageLabel.setIcon(icon);
    }

    public JButton getNextButton() {
        return nextButton;
    }

    public JButton getPrevButton() {
        return prevButton;
    }

    public JButton getOpenButton() {
        return openButton;
    }
}
