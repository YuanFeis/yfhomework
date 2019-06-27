package homework;
import java.awt.EventQueue;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Zjy_select {

	private JFrame frame;
	private JTextField tx1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Zjy_select window = new Zjy_select();
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
	public Zjy_select() {
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

		JLabel lb1 = new JLabel("\u8BF7\u9009\u62E9\u60A8\u7684\u5B66\u6821\uFF1A");
		lb1.setBounds(92, 58, 130, 30);
		frame.getContentPane().add(lb1);

		JLabel lb2 = new JLabel("\u60A8\u7684\u9009\u62E9\u662F\uFF1A");
		lb2.setBounds(102, 99, 90, 30);
		frame.getContentPane().add(lb2);

		tx1 = new JTextField();
		tx1.setEditable(false);
		tx1.setBounds(206, 102, 114, 24);
		frame.getContentPane().add(tx1);
		tx1.setColumns(10);
		JComboBox comboBox = new JComboBox();

		comboBox.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				String sel = (String) comboBox.getSelectedItem();
				tx1.setText(sel);
			}
		});

		comboBox.addItem("清华大学");
		comboBox.addItem("北京大学");
		comboBox.setSelectedItem(null);
		comboBox.setBounds(224, 61, 90, 24);
		frame.getContentPane().add(comboBox);

	}
}
