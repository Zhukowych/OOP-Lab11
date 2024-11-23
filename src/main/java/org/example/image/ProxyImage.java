package org.example.image;


public class ProxyImage {

    private RealImage image;
    private String path;

    public ProxyImage(String path) {
        this.path = path;
    }

    public void display() {
        if (image == null)
            image = new RealImage(this.path);
        image.display();
    }


}
