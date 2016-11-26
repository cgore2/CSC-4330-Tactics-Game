package dolphingame;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

//MAIN CLASS, DO NOT EDIT!!!

public class SDMC extends JFrame {


	/**
	 * Create the frame.
	 */
	public SDMC() {
		
		initiateUI();
		
	}
	
	private void initiateUI(){
		add(new Board());
		setTitle("Sub Dolphin Machine Cannon");
		setSize(500, 540);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setVisible(true);
	}
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SDMC frame = new SDMC();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
}
