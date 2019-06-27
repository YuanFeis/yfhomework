package homework;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Zjy_caculate {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Zjy_caculate window = new Zjy_caculate();
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
	public Zjy_caculate() {
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
		
		JLabel lblNewLabel = new JLabel("\u8FD9\u662F\u4E00\u4E2A\u6C42\u6574\u6570\u5E73\u65B9\u7684\u5C0F\u5DE5\u5177");
		lblNewLabel.setBounds(105, 39, 206, 35);
		frame.getContentPane().add(lblNewLabel);
		
		textField = new JTextField();
		textField.setBounds(42, 89, 86, 24);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setEnabled(false);
		textField_1.setBounds(268, 89, 86, 24);
		frame.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		JButton button = new JButton("\u8BA1\u7B97");
		button.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				try {
					int n1;
					n1=Integer.parseInt(textField.getText());
					textField_1.setText("结果是 "+n1*n1);
					lblNewLabel.setText("结果已在右方文本框中给出~");
				} catch (Exception e2) {
					// TODO: handle exception
					lblNewLabel.setText("您的输入有误，请输入一个整数。");
					textField_1.setText("输入有误");
				}
				
			}
		});
		button.setBounds(142, 85, 113, 27);
		frame.getContentPane().add(button);
	}
}
