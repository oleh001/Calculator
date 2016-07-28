package view;

import configure.Config;

import javax.swing.*;
import java.awt.*;

/**
 * Created by user on 23.07.2016.
 */
public class Window{

    private Config configure= Config.getConfig();
    private JFrame jFrame=configure.getjFrame();
    //jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    //jFrame..setTitle("Foto");

    public void setjFrame(){
        Config conf=getConfigure();
        JFrame frame=getjFrame();
        frame.setVisible(true);
        frame.setTitle(conf.getTitle());
        frame.setSize(conf.getWidth(), conf.getHeight());
        frame.setLocationRelativeTo(null);//Centr window
        frame.setResizable(false);//Default size
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //Exit JFrame
        frame.setLayout(new FlowLayout());
        JButton butAdd=new JButton("+");
        JButton butMin=new JButton("-");
        JButton butMul=new JButton("*");
        JButton butdiv=new JButton("/");
        butAdd.setBackground(Color.RED);
        butMin.setBackground(Color.red);

        frame.add(butAdd);
        frame.add(butMin);
        frame.add(butMul);
        frame.add(butdiv);
        JLabel jLab1=new JLabel("Введіть дію");

        JTextField jTextField1=new JTextField(10);
        JLabel jLab2=new JLabel("Результат");
        frame.add(jLab1);
        frame.add(jTextField1);
        frame.add(jLab2);
        JTextField jTextField2=new JTextField(10);
        jTextField2.setBackground(Color.cyan);
        frame.add(jTextField2);

    }

    public JFrame getjFrame() {
        return jFrame;
    }

    public Config getConfigure() {
        return configure;
    }
}
