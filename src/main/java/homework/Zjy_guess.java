package homework;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Zjy_guess {

	private JFrame frame;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
	
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Zjy_guess window = new Zjy_guess();
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
	public Zjy_guess() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		int value= (int) (100*Math.random())+1;
		System.out.println(value);
		frame = new JFrame();
		frame.setTitle("\u731C\u5B57\u5C0F\u7A0B\u5E8F");
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(147, 75, 113, 44);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("\u8F93\u5165\u4E00\u4E2A1-100\u7684\u6570\uFF0C\u770B\u770B\u548C\u6211\u7ED9\u51FA\u7684\u4E00\u6837\u4E0D~");
		lblNewLabel.setBounds(60, 35, 316, 40);
		frame.getContentPane().add(lblNewLabel);
		
		JButton btnNewButton = new JButton("\u786E\u5B9A");
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
		try {
            int n1=Integer.parseInt(textField.getText());
			
			if(value==n1) {
				lblNewLabel.setText("恭喜你，猜对了！");
				
			}
			else if(value<n1) {
				lblNewLabel.setText("不好意思，这个数偏大了~");
			}else if(value>n1) {
				lblNewLabel.setText("不好意思，这个数偏小了~");
			}
			
		} catch (Exception e2) {
			// TODO: handle exception
			lblNewLabel.setText("不好意思，请输入一个有效的整数");
		}
			
			}
		});
		btnNewButton.setBounds(147, 132, 113, 27);
		frame.getContentPane().add(btnNewButton);
	}

}
