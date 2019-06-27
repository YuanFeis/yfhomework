package homework;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class ZJY_Show2 {

	private JFrame frmShow;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ZJY_Show2 window = new ZJY_Show2();
					window.frmShow.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public ZJY_Show2() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmShow = new JFrame();
		frmShow.setTitle("Show");
		frmShow.setBounds(100, 100, 450, 300);
		frmShow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmShow.getContentPane().setLayout(null);
		
		JPanel panel = new Mypanel();
		
		panel.setBounds(0, 0, 432, 253);
		frmShow.getContentPane().add(panel);
	}
class Mypanel extends JPanel{
	@Override
	protected void paintComponent(Graphics g) {
		// TODO Auto-generated method stub
		super.paintComponent(g);
		g.setColor(Color.GREEN);
		g.drawLine(100, 100, 200, 100);
		g.setColor(Color.RED);
		g.drawOval(50, 50, 100, 100);
	}
}
}
