/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java2dgraphics.points.ex01;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;
import javax.swing.JPanel;
import javax.swing.Timer;

public class LineComponentsPanel extends JPanel {

    private final int INTERVAL = 200;
    private Timer timer;

    public LineComponentsPanel() {
        timer = new Timer(INTERVAL, actionListener);
        timer.start();
    }

    public Timer getTimer() {
        return timer;
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g); //To change body of generated methods, choose Tools | Templates.

        Graphics2D g2d = (Graphics2D) g;
        //g2d.drawLine(50, 50, 150, 150);

        g2d.setPaint(Color.BLUE);

        int windowWidth = getWidth();
        int windowHeight = getHeight();

        for (int i = 1; i < 100; i++) {

            int x = Math.abs(new Random().nextInt()) % windowWidth;
            int y = Math.abs(new Random().nextInt()) % windowHeight;

            g2d.drawLine(x, y, x*i, y);
        }
    }

    ActionListener actionListener = new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            repaint();
        }
    };
}
