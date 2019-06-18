import java.awt.Graphics;

public class GameObject {
	
	int x;
	int y;
	int width;
	int height;
	
	public GameObject(int x, int y, int width, int height) {
		x = 300;
		y = 700;
		width = 10;
		height = 10;
		
		
	}
	
	public void update() {
		y+=1;
		x+=1;
	}
	
	public void draw(Graphics g) {
		g.fillRect(x, y, 100, 100);
		
	}
}
//I ENDED ON Pt.7 #3 but I didn't finish Pt. 6 #10 and 11