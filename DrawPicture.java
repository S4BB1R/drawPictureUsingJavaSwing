/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package drawpicture;
import javax.swing.*;
import java.awt.*;
/**
 *
 * @author sabbir13301109
 */
public class DrawPicture {
        /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        JFrame frame = new JFrame ("Picture");
        frame.setVisible(true);
        frame.setSize(1366, 768);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Draw obj = new Draw();
        frame.add(obj);      
        
        obj.drawing();
    }
    
}
