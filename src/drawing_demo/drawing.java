package drawing_demo;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class drawing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Frame f=new Frame();//form window 
		f.setSize(800, 600);//set window size
		f.addWindowListener(new WindowAdapter() {


			@Override
			public void windowClosing(WindowEvent e) {
				// TODO Auto-generated method stub
				System.exit(0);//click close button event
				super.windowClosing(e);
			}
			//new window-listener
			
		});
		mycanvas c=new mycanvas();
		c.setSize(800,600);
		f.add(c);
		f.setVisible(true);//set window visible
	}

}

class mycanvas extends Canvas
{
	@Override
	public void paint(Graphics g) {
		// TODO Auto-generated method stub
		super.paint(g);
		
		Star star=new Star(100,100);
		star.draw(g);
		
//		int []X= {116,183,47,205,78};
//		int []Y= {22,179,88,75,184};
//		int s=1;
//		int mx=50;
//	    int my=50;
//	    
//	    for(int j=0;j<20;j++) {
//		    g.setColor(Color.BLACK);
//			for(int n=0;n<X.length;n++) 
//				g.drawLine(mx+s*X[n], my+s*Y[n], mx+s*X[(n+1)%X.length], my+s*Y[(n+1)%X.length]);
//			mx=mx+10;
//			my=my+10;
//	    }
	    
	    
//	for(int n=0;n<X.length;n++) {	
//		
//		g.drawLine(X[n], Y[n], X[(n+1)%X.length], Y[(n+1)%X.length]);
//		
//	}
//	
	
	
	
//		g.drawLine(116, 22, 183, 179);
//		g.drawLine(183, 179, 47, 88);
//		g.drawLine(47, 88, 205, 75);
//		g.drawLine(205, 75, 78, 184);
//		g.drawLine(78, 184, 116, 22);// command+/
		
	}
	
}
