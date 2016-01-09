/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package myclient;

import javax.swing.JFrame;

/**
 *
 * @author Safi
 */
public class MyClient {

    
    public static void main(String[] args) {
        ServerBoard frame = new ServerBoard();

    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    frame.pack();

    frame.setVisible(true);

    }
    
}
