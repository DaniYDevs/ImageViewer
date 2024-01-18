package software.ulpgc.imageviewer.model;

import java.util.ArrayList;
import java.util.List;

public class ImageModel {
    private List<String> images;
    private int currentIndex;

    public ImageModel() {
        images = new ArrayList<>();
        currentIndex = 0;
    }

    public void addImage(String imagePath) {
        images.add(imagePath);
    }

    public String getCurrentImage() {
        if (images.isEmpty()) {
            return null;
        }
        return images.get(currentIndex);
    }

    public void nextImage() {
        if (!images.isEmpty()) {
            currentIndex = (currentIndex + 1) % images.size();
        }
    }

    public void prevImage() {
        if (!images.isEmpty()) {
            currentIndex = (currentIndex - 1 + images.size()) % images.size();
        }
    }
}
