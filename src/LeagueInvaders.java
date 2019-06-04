import java.awt.Dimension;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;

public class LeagueInvaders implements KeyListener {
	JFrame frame;
	GamePanel gamePanel;
	static final int WIDTH = 500;
	static final int HEIGHT = 800;
	
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
        frame.addKeyListener(gamePanel);
	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

}
