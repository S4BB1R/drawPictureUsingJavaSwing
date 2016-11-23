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
public class Draw extends JPanel{
    
    public void drawing(){
        repaint();
    }
    
    public void paint(Graphics g){
        super.paint(g);
        
        g.setColor(new Color(135, 206, 250));
        
        g.fillRect(0, 0, 1366, 768); 
                        
  
        
        g.setColor(Color.white);
        g.fillOval(40, 80, 130, 80);
        g.fillOval(120, 110, 130, 80);
        g.fillOval(80, 140, 100, 60);
        g.fillOval(200, 80, 130, 80);
        g.fillOval(120, 70, 100, 100);
       
        g.setColor(Color.white);
        g.fillOval(840, 80, 130, 80);
        g.fillOval(920, 110, 130, 80);
        g.fillOval(880, 140, 100, 60);
        g.fillOval(950, 80, 130, 80);
        g.fillOval(820, 70, 100, 100);
        
        g.setColor(Color.white);
        g.fillOval(1240, 180, 130, 80);
        g.fillOval(1320, 210, 130, 80);
        g.fillOval(1280, 240, 100, 60);
        g.fillOval(1400, 180, 130, 80);
        g.fillOval(1320, 170, 100, 100);
        
      
        
        g.setColor(new Color(26, 238, 238));//river
        g.fillOval(50, 520, 1616, 200);
        
        
        g.setColor(Color.black);//boat
        g.fillOval(570, 530,300,75);
        g.setColor(new Color(26, 238, 238));//override on boat
        g.fillOval(570, 530,300,50);
        
                
        g.setColor(new Color(16, 63, 4));//bush
        g.fillOval(300, 550, 300, 200);
        g.fillOval(500, 600, 300, 200);
        g.fillOval(670, 600, 300, 200);
        g.fillOval(800, 600, 300, 200);
        g.fillOval(1000, 600, 300, 200);
        g.fillOval(1200, 560, 300, 200);
        
        g.setColor(new Color(0, 128, 128));//homeside
        g.fillArc(180, 114, 380, 370, -125, 70);
        g.fillRect(-1, 300, 370, 163);
        g.setColor(Color.ORANGE);
        g.setColor(Color.getHSBColor(50, 60, 120));
        g.fillArc(170, 125, 380, 370, -125, 70);
        g.fillRect(0, 463, 470, 300);
        
        
        g.setColor(new Color(178, 34, 34));//home infront
        g.fillArc(80, 80, 380, 370, -125, 70);
        g.fillRect(-1, 266, 270, 163);
        g.setColor(Color.LIGHT_GRAY);
        g.fillArc(77, 100, 380, 370, -125, 70);
        g.fillRect(0, 429, 370, 250);
        g.setColor(Color.BLACK);
        g.setColor(Color.getHSBColor(50, 60, 120));
        g.fillRect(363, 417, 16, 263);
        g.setColor(Color.orange);
        g.drawLine(362, 417, 362, 680);
        g.drawLine(173, 417, 173, 680);
        g.fillRect(230, 460, 80, 300);
        g.setColor(Color.orange);
        g.setColor(Color.getHSBColor(80, 20, 220));
        g.fillRect(231, 465, 75, 300);
        g.setColor(Color.black);
        g.drawLine(268, 463, 268, 700);
        g.fillRect(362, 463, 40, 80);
        g.setColor(new Color(63, 88, 97));
        g.fillRect(362, 467, 36, 76);
        
        g.setColor(new Color(16, 63, 4));//bush infront river
        g.fillArc(400, 350, 380, 370, -100, 20);
        g.fillArc(1050, 320, 380, 370, -100, 20);
        g.fillArc(500, 350, 380, 370, -100, 20);
        g.fillArc(950, 370, 380, 370, -100, 20);
        g.fillArc(600, 330, 380, 370, -100, 20);
        g.fillArc(750, 350, 380, 370, -100, 20);
        g.fillArc(700, 340, 380, 370, -100, 20);
        g.fillArc(850, 330, 380, 370, -100, 20);
        
        g.setColor(new Color(30, 30, 5));//timber
        g.fillRect(455, 450, 40, 680);
        g.setColor(new Color(16, 78, 3));//greentree
        g.fillArc(283, 130, 380, 370, -110, 40);
        g.fillArc(283, 64, 380, 370, -110, 40);
        
        g.setColor(new Color(16, 63, 4));//bush infron home
        g.fillArc(100, 350, 380, 370, -100, 20);
        g.fillArc(-50, 320, 380, 370, -100, 20);
        g.fillArc(200, 350, 380, 370, -100, 20);
        g.fillArc(-10, 370, 380, 370, -100, 20);
        g.fillArc(150, 330, 380, 370, -100, 20);
        g.fillArc(12, 350, 380, 370, -100, 20);
        g.fillArc(-90, 340, 380, 370, -100, 20);
        g.fillArc(-150, 330, 380, 370, -100, 20);
                        
        g.setColor(new Color(55, 148, 48));
        g.fillOval(-1050, 600, 2075, 180);
        g.fillOval(700, 640, 575, 180);
        g.fillOval(1100, 600, 775, 180);

        
        g.setColor(new Color(30, 30, 5));
        g.fillRect(1215, 450, 60, 230);
        g.setColor(new Color(16, 78, 3));
        g.fillOval(1065, 400,220,140);
        g.fillOval(1190, 400, 220, 140);
        g.fillOval(1140, 300, 200, 120);
        
        g.setColor(Color.YELLOW);//RAY
        g.drawLine(900, 250, 600, 520);
        g.drawLine(650, 180, 900, 520);
        g.drawLine(650, 365, 900, 365);
        
        g.setColor(Color.YELLOW);
        g.fillOval(730, 310, 100, 100);
        
        
        g.setColor(new Color(165, 42, 42));//homeside
    int xpoints[] = {220, 120, 300, 400, 220,320};
    int ypoints[] = {600,650, 800, 800, 650,600};
    int npoints = 6;
    g.fillPolygon(xpoints, ypoints, npoints);
        //g.draw(rect1);
        
        
    }
}
