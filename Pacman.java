package Pacman.game;
// Front end
import javax.swing.JFrame;
import java.awt.*;
public class Pacman extends JFrame{
	public Pacman() {
		initUI();
	}
	private void initUI() {
		add(new Board());
		setTitle("Pacman");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(300,420);
		setLocationRelativeTo(null);
	}

	public static void main(String[] args) {
		
	EventQueue.invokeLater(()-> {
			Pacman ex=new Pacman();
			ex.setVisible(true);
			
	  });	

	}

}
