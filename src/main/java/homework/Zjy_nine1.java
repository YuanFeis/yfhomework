package homework;
import java.awt.EventQueue;
import java.awt.FlowLayout;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;

public class Zjy_nine1 {

	private JFrame frmShow;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Zjy_nine1 window = new Zjy_nine1();
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
	public Zjy_nine1() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmShow = new JFrame();
		frmShow.setTitle("Show");
		frmShow.setBounds(100, 100, 676, 202);
		frmShow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmShow.getContentPane().setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		JRadioButton select1 = new JRadioButton("\u9009\u98791");
		select1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				JOptionPane.showMessageDialog(frmShow, "你选择了选项1","消息", 
						JOptionPane.INFORMATION_MESSAGE);
				select1.setVisible(false);
			}
		});
		frmShow.getContentPane().add(select1);
		
		JRadioButton select2 = new JRadioButton("\u9009\u98792");
		select2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				JOptionPane.showMessageDialog(frmShow, "你选择了选项2","消息", 
						JOptionPane.INFORMATION_MESSAGE);
				select2.setVisible(false);
			}
		});
		frmShow.getContentPane().add(select2);
		
		JRadioButton select3 = new JRadioButton("\u9009\u98793");
		select3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				JOptionPane.showMessageDialog(frmShow, "你选择了选项3","消息", 
						JOptionPane.INFORMATION_MESSAGE);
				select3.setVisible(false);
			}
		});
		frmShow.getContentPane().add(select3);
	}

}
