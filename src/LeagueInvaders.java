import java.awt.Dimension;

import javax.swing.JFrame;

public class LeagueInvaders {
	JFrame frame;
	GamePanel gamePanel;
	final int WIDTH = 500;
	final int HEIGHT = 800;
	
	public static void main(String[] args) {
		LeagueInvaders game = new LeagueInvaders();
		
		game.setup();
		
	}

	public LeagueInvaders() {
		frame = new JFrame();
		gamePanel = new GamePanel();
	
	}
	
	public void setup() {
		frame.add(gamePanel);
		frame.setVisible(true);
		frame.setTitle("League Invaders Game");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setPreferredSize(new Dimension(WIDTH, HEIGHT));
        frame.pack();
        gamePanel.startGame();
	}

}
