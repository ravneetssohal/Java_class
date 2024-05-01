package Assignments.mediaPlayer;

import Assignments.Sort;

public class ImageDisplay extends MediaDevice{
    String imageName;
    String resolution;

    public ImageDisplay(String name, String imageName, String resolution) {
        super(name);
        this.imageName = imageName;
        this.resolution = resolution;
    }

    @Override
    public void displayDetails() {
        System.out.println("Name of the device: " + name);
        System.out.println("Image Name: " + imageName);
        System.out.println("Resolution: " + resolution + " pixels");
    }
}
