package brickBreaker;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        JFrame obj = new JFrame();
        Gameplay yuh = new Gameplay();
        obj.setBounds(10, 10, 695, 600);
        obj.setTitle("Brick Breaker");
        obj.setResizable(false);
        obj.setVisible(true);
        obj.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        obj.add(yuh);
        obj.setVisible(true);
    }
}
