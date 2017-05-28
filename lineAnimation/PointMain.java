/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java2dgraphics.points.ex01;

import java.awt.EventQueue;

public class PointMain {
    
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
           
                new LineComponentFrame().setVisible(true);
            }
        });
    }
}
