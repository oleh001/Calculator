package configure;

import javax.swing.*;

/**
 * Created by user on 23.07.2016.
 */
public class Config {
    private final static Config config = new Config();

    private Config() {
    }

    private String title = "Calkulator";
    private int width = 400;
    private int height = 400;

    private JFrame jFrame = new JFrame();

    public JFrame getjFrame() {
        return jFrame;
    }

    public static Config getConfig() {
        return config;
    }

    public String getTitle() {
        return title;
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }
}
