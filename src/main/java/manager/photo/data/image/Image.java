package manager.photo.data.image;

import java.awt.image.BufferedImage;

public class Image {
    private Integer id;
    private BufferedImage bufferedImage;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public BufferedImage getBufferedImage() {
        return bufferedImage;
    }

    public void setBufferedImage(BufferedImage bufferedImage) {
        this.bufferedImage = bufferedImage;
    }
}
