import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Main {

	public static void main(String[] args){
		JFrame frame = new JFrame("Space War");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(400, 650);
		frame.getContentPane().setLayout(new BorderLayout());

		JPanel gp = new JPanel();
		gp.setBackground(Color.BLACK);
		frame.getContentPane().add(gp, BorderLayout.CENTER);
		frame.setVisible(true);
	}

}