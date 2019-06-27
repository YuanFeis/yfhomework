package homework;
import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Zjy_APP {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Zjy_APP window = new Zjy_APP();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Zjy_APP() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton b1 = new JButton("\u84DD\u6309\u94AE");
		b1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				b1.setText("已按过");
			//	b1.setForeground(Color.gray);
				b1.setBackground(Color.gray);
			}
		});
		b1.setForeground(Color.BLUE);
		b1.setBounds(69, 72, 113, 40);
		frame.getContentPane().add(b1);
		
		JButton b2 = new JButton("\u7EA2\u6309\u94AE");
		b2.setForeground(Color.RED);
		b2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				b2.setText("已按过");
			//	b2.setForeground(Color.gray);
				b2.setBackground(Color.gray);
			}
		});
		b2.setBounds(226, 72, 113, 40);
		frame.getContentPane().add(b2);
	}}


