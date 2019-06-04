import java.awt.Color;
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

	public void updateMenuState() {

	}

	public void updateGameState() {

	}

	public void updateEndState() {

	}

	public void drawMenuState(Graphics g) {
		g.setColor(Color.BLUE);
		g.fillRect(0, 0, LeagueInvaders.WIDTH, LeagueInvaders.HEIGHT);

	}

	public void drawGameState(Graphics g) {
		g.setColor(Color.BLACK);

	}

	public void drawEndState(Graphics g) {
		g.setColor(Color.RED);
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
		if (currentState == MENU_STATE) {
			drawMenuState(g);
		}

		else if (currentState == GAME_STATE) {
			drawGameState(g);
		}

		else if (currentState == END_STATE) {
			drawEndState(g);
		}
	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		// System.out.println("hi");
	}

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub

		if (currentState > MENU_STATE) {
			currentState = GAME_STATE;
		}

		else if (currentState > GAME_STATE) {
			currentState = END_STATE;
		}
		
		else if (currentState > END_STATE) {
			currentState = MENU_STATE;
		}

		System.out.println("hello");
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		// System.out.println("hii");
	}
}
