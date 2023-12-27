package Gui.ex01;

import ex04.MyFrame;

import javax.swing.*;
import java.awt.*;

public class MyFrameEx02 extends JFrame {
    public MyFrameEx02(){
        setSize(300,200);
        setTitle("MyFrame");

        setLayout(new FlowLayout());
        JButton button = new JButton("버튼");
        add(button);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        MyFrameEx02 f = new MyFrameEx02();
    }

}
