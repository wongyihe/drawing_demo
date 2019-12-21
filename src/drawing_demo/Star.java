package drawing_demo;

import java.awt.Graphics;
import java.awt.Point;
import java.util.ArrayList;
import java.util.List;

public class Star extends drawelement {

	public Star(Point p) {
		super(p);
	}
	public Star(int x,int y) {
		
		super(x,y);
	}
	@Override
	void draw(Graphics g) {
		double t,deg;
		double delta=360/5;
		List<Point> list=new ArrayList<Point>();
		Point P;
		double r=100;
		for(deg=0;deg<360;deg+=delta) {
			P=new Point();
			t=deg*Math.PI/180;
			P.x=(int) (p.x+r*Math.cos(t));
			P.y=(int) (p.y+r*Math.sin(t));
			list.add(P);
		}
		for(int i=0;i<5;i++) {
			g.drawLine(list.get(i).x, list.get(i).y, list.get((i+2)%5).x, list.get((i+2)%5).y);
			
		}
	}

}
