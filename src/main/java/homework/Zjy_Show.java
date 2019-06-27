package homework;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Zjy_Show {

	private JFrame frmShow;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Zjy_Show window = new Zjy_Show();
					
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
	public Zjy_Show() {
		
		initialize();
		
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		
		frmShow = new JFrame();
		frmShow.setTitle("Show");
		frmShow.setBounds(100, 100, 600, 600);
		frmShow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmShow.getContentPane().setLayout(null);
		
		JPanel panel = new MyPanelColor1();
		panel.setBounds(0, 0, 582, 200);
		frmShow.getContentPane().add(panel);	
		
		JPanel panel2 = new MyPanelColor2();
		panel2.setBounds(0,200, 582, 200);
		frmShow.getContentPane().add(panel2);
			
        JPanel panel_1 = new JPanel();
        panel_1.setBackground(Color.GRAY);
        panel_1.setForeground(Color.GRAY);
		panel_1.setBounds(0, 469, 582, 84);
		frmShow.getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		JButton b1 = new JButton("\u786E\u5B9A");
		b1.setBounds(150, 33, 79, 27);
		panel_1.add(b1);
		
		JButton b2 = new JButton("\u53D6\u6D88");
		b2.addMouseListener(new MouseAdapter() {
			
			
			int count2=0;
			@Override
			public void mouseClicked(MouseEvent e) {
				  count2++;
					Graphics g =panel2.getGraphics();
					 g.clearRect(0,0,1000,1000);
					g.setColor(Color.RED);
					g.setFont(new Font("Dialog",Font.BOLD,20));
					g.drawString("你点击了“取消”按钮"+count2+"次", 60,40);
			}
		});
		b2.setBounds(314, 33, 79, 27);
		panel_1.add(b2);
	
		b1.addMouseListener(new MouseAdapter() {
			int  count1 =0;

			@Override
			public void mouseClicked(MouseEvent e) {
			     count1++;
				Graphics g =panel.getGraphics();
			    g.clearRect(0,0,1000,1000);
				g.setColor(new Color(0,225,0));
				g.setFont(new Font("Dialog",Font.BOLD,20));
				g.drawString("你点击了“确定”按钮"+count1+"次", 60,180);
			
			}
		});
	}
}
	
	
	class MyPanelColor1 extends JPanel 
	{
		public void paintComponent(Graphics g)
		{
			super.paintComponent(g);
			g.setColor(new Color(0,225,0));
			g.setFont(new Font("Dialog",Font.BOLD,20));
			g.drawString("你点击了“确定”按钮0次",60,180);
			
		}
}
	class MyPanelColor2 extends JPanel 
	{
		public void paintComponent(Graphics g)
		{
			super.paintComponent(g);
			
			g.setColor(Color.RED);
			g.setFont(new Font("Dialog",Font.BOLD,20));
			g.drawString("你点击了“取消”按钮0次",60,40);
		}

	}
