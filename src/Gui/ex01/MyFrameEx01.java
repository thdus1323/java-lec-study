package Gui.ex01;

import javax.swing.*;

public class MyFrameEx01 extends JFrame {
    public MyFrameEx01(){
        setSize(300,200);
        setTitle("MyFrame");
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        MyFrameEx01 f = new MyFrameEx01();
    }
}
