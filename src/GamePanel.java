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
	Timer timer = new Timer(1000 / 6, this);
	GameObject gameObject;

	final int MENU_STATE = 0;
	final int GAME_STATE = 1;
	final int END_STATE = 2;
	int currentState = MENU_STATE;
	Font titleFont = new Font("Ariel", Font.PLAIN, 48);
	

	public void updateMenuState() {

	}

	public void updateGameState() {

	}

	public void updateEndState() {

	}

	public void drawMenuState(Graphics g) {
		g.setColor(Color.BLUE);
		g.fillRect(0, 0, LeagueInvaders.WIDTH, LeagueInvaders.HEIGHT);
		//g.setFont(titleFont);
		//g.drawString("text", Font.PLAIN, 48);
		//g.setColor(Color.BLACK);
	}

	public void drawGameState(Graphics g) {
		g.setColor(Color.BLACK);

	}

	public void drawEndState(Graphics g) {
		g.setColor(Color.RED);
		//text for gameover screen
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
		timer.start();
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

		if (e.getKeyCode() == 10) {
			currentState ++;
			
			if(currentState > END_STATE) {
				currentState = MENU_STATE;
			}
			
		}

		// System.out.println("b");
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		// System.out.println("c");
	}
}
