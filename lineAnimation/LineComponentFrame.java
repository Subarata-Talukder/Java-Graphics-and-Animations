/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java2dgraphics.points.ex01;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.JFrame;

public class LineComponentFrame extends JFrame {

    public LineComponentFrame() {

        initUi();
    }

    private void initUi() {

        setTitle("Line Window");
        setSize(350, 350);
        //setUndecorated(true);
        //setLayout(new GridBagLayout());
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        //Add a sample button.
        //add(new JButton("I am a Button"));
        add(new LineComponentsPanel());

        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                super.windowClosing(e);

                new LineComponentsPanel().getTimer().stop();
            }
        });

//        JButton jb = new JButton("Exit");
//        jb.setPreferredSize(new Dimension(100, 40));
//        jb.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent e) {
//
//                new LineComponentFrame().dispose();
//            }
//        });
//        
//        add(jb);
        // Try different shapes
        // Normal rounded rectangle
        //setShape(new RoundRectangle2D.Double(0, 0, getWidth(), getHeight(), 20, 40));
        //Ellipse shape
        //setShape(new Ellipse2D.Double(0, 0, 400, 400));
        // Quad Curve
        //setShape(new QuadCurve2D.Double(0, 0, 400, 50, 400, 400));
        // Cubic Curve. Looks funny:)
        //setShape(new CubicCurve2D.Double(0, 0, 500, 5, 200, 0, 500, 500));
        // For three-fourth circle
        //setShape(new Arc2D.Double(new Rectangle2D.Double(0, 0, 500, 500), 90, 270, Arc2D.PIE));
        // For round circle shape
        //setShape(new Arc2D.Double(new Rectangle2D.Double(0, 0, 500, 500), 90, 360, Arc2D.PIE));
    }
}
