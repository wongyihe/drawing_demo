package drawing_demo;

import java.awt.Graphics;
import java.awt.Point;

public abstract class drawelement {
	protected Point p;
	
	public drawelement(Point p) {
		super();
		this.p = p;
	}
	public drawelement (int x,int y) {
		super();
		p.x=x;
		p.y=y;
	}
	abstract void draw(Graphics g);

}
