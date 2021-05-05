package manager.photo.data.file;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.LinkedList;
import java.util.List;

public class FileReader {
    public static List<BufferedImage> getBufferedImages(File file) {
        List<BufferedImage> bufferedImageList = new LinkedList<>();

        if (file.exists() && file.isDirectory()) {
            for (File f : file.listFiles()) {
                if (f.isFile()) {
                    try {
                        bufferedImageList.add(ImageIO.read(f));
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                } else if (f.isDirectory()) {
                    bufferedImageList.addAll(getBufferedImages(f));
                }
            }
        }

        return bufferedImageList;
    }
}
