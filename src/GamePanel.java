import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JPanel;
import javax.swing.Timer;

public class GamePanel extends JPanel implements ActionListener, KeyListener {
	Timer frameDraw = new Timer(1000 / 6, this);
	GameObject gameObject;
	Rocketship rocketship = new Rocketship(250, 700, 50, 50);
	
	
	final int MENU_STATE = 0;
	final int GAME_STATE = 1;
	final int END_STATE = 2;
	int currentState = MENU_STATE;
	Font titleFont = new Font("Ariel", Font.PLAIN, 48);
	Font startFont = new Font("Ariel", Font.PLAIN, 24);
	Font spaceFont = new Font("Ariel", Font.PLAIN, 24);
	Font gameOverFont = new Font("Ariel", Font.PLAIN, 48);
	Font enemiesFont = new Font("Ariel", Font.PLAIN, 24);
	Font restartFont = new Font("Ariel", Font.PLAIN, 24);
	

	public void updateMenuState() {

	}

	public void updateGameState() {

	}

	public void updateEndState() {

	}

	public void drawMenuState(Graphics g) {
		g.setColor(Color.BLUE);
		g.fillRect(0, 0, LeagueInvaders.WIDTH, LeagueInvaders.HEIGHT);
		
		g.setColor(Color.YELLOW);
		g.setFont(titleFont);
		g.drawString("LEAGUE INVADERS", 50, 200);
		
		g.setFont(startFont);
		g.drawString("Press ENTER to start", 150, 350);
		
		g.setFont(spaceFont);
		g.drawString("Press SPACE for instructions", 100, 500);
		
	}

	public void drawGameState(Graphics g) {
		g.setColor(Color.BLACK);
		g.fillRect(0, 0, LeagueInvaders.WIDTH, LeagueInvaders.HEIGHT);
		
		rocketship.draw(g);
		
	}

	public void drawEndState(Graphics g) {
		g.setColor(Color.RED);
		g.fillRect(0, 0, LeagueInvaders.WIDTH, LeagueInvaders.HEIGHT);
		
		g.setColor(Color.BLACK);
		g.setFont(gameOverFont);
		g.drawString("Game Over", 125, 200);
		
		g.setFont(enemiesFont);
		g.drawString("You killed 0 enemies", 130, 350);
		
		g.setFont(restartFont);
		g.drawString("Press ENTER to restart", 125, 500);
		
		
	}

	public GamePanel() {
		// gameObject = new GameObject(10, 10, 250, 600);
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		repaint();
		repaint();

		if (currentState == MENU_STATE) {
			updateMenuState();
		}

		else if (currentState == GAME_STATE) {
			updateGameState();
		}

		else if (currentState == END_STATE) {
			updateEndState();
		}

	}

	public void startGame() {
		frameDraw.start();
	}

	@Override
	public void paintComponent(Graphics g) {
		if (currentState == MENU_STATE) { // blue
			drawMenuState(g);
		}
		
		else if (currentState == GAME_STATE) { // black
			drawGameState(g);
		}

		else if (currentState == END_STATE) { // red
			drawEndState(g);
		}
	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		// System.out.println("a");
	}

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub

		if (e.getKeyCode() == KeyEvent.VK_ENTER) {
		    if (currentState == END_STATE) {
		        currentState = MENU_STATE;
		    } else {
		        currentState++;
		    }
		}   
		
		else if (e.getKeyCode() == KeyEvent.VK_UP) {
		    System.out.println("UP");
		    rocketship.up();
		    
		}
		
		else if (e.getKeyCode() == KeyEvent.VK_DOWN) {
		    System.out.println("DOWN");
		    rocketship.down();
		    
		}
		
		else if (e.getKeyCode() == KeyEvent.VK_LEFT) {
		    System.out.println("LEFT");
		    rocketship.left();
		    
		}
		
		else if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
		    System.out.println("RIGHT");
		    rocketship.right();
		    
		}

		
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		// System.out.println("c");
	}
}
