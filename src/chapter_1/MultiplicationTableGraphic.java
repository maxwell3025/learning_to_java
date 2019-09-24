package chapter_1;

import java.applet.Applet;
import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;

import javax.swing.JFrame;



@SuppressWarnings("serial")
public class MultiplicationTableGraphic extends Applet{
	
	public void paint(Graphics g){
		int f=3;
		int size = 15;
		for (int i=1; i<size+1; i++){
			for (int o=1; o<size+1; o++){
				g.setFont(new Font("special1",Font.PLAIN, f*20));
				g.drawString(String.valueOf(i*o), ((o*35)+4)*f, (i*20)*f);
				g.setFont(new Font("special2",Font.PLAIN, f*25));
				g.drawString("|", ((o*35)+35)*f, (i*20)*f);
				g.setFont(Font.getFont("special1"));
				g.drawString("___", (o*35)*f, (i*20)*f);
			}
			
		}
		g.drawString("Memorize your facts", 0, ((f*size)*20)+(24*f));
	}
	public static void main(String ad[]) {
		 JFrame jp1 = new JFrame();
		 MultiplicationTableGraphic a = new MultiplicationTableGraphic ();
	        jp1.getContentPane().add(a, BorderLayout.CENTER);
	        jp1.setSize(new Dimension(1920,1080));
	        jp1.setVisible(true);
	}

}
