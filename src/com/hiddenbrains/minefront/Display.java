package com.hiddenbrains.minefront;

import com.hiddenbrains.minefront.Utils.DisplayUtils;

import javax.swing.*;
import java.awt.*;

public class Display extends Canvas{

    public static void main(String[] args) {
        Display game = new Display();
        JFrame frame = new JFrame(DisplayUtils.TITLE_MINE_FRONT);
        frame.add(game);
        frame.setSize(DisplayUtils.WINDOW_WIDTH_800,DisplayUtils.WINDOW_HEIGHT_600);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}
