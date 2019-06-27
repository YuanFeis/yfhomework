
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JLabel;

public class Zjy_Paint {

	private JFrame frmYfpaint;
	private String tuxing = "圆形";
	private Color c = Color.RED; 
	
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Zjy_Paint window = new Zjy_Paint();
					window.frmYfpaint.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Zjy_Paint() {
		initialize();
		
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		List<String> list = new ArrayList<String>();
		
		frmYfpaint = new JFrame();
		frmYfpaint.setTitle("YFPaint");
		frmYfpaint.setBounds(400, 100, 1100, 800);
		frmYfpaint.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmYfpaint.getContentPane().setLayout(null);

		JPanel panel = new Mypanel();
		panel.setBounds(0, 100, 10000, 10000);
		frmYfpaint.getContentPane().add(panel);
		
		
		
		
		JLabel disxy = new JLabel("\u201C\u8FD9\u662F\u4E00\u4E2A\u70B9\u51FB\u9762\u677F\u4EA7\u751F\u56FE\u5F62\u7684\u5C0F\u7A0B\u5E8F\uFF0C\u4F60\u53EF\u4EE5\u5728\u4E0A\u65B9\u83DC\u5355\u8FDB\u884C\u76F8\u5173\u753B\u56FE\u9009\u62E9\u201D");
		disxy.setBackground(Color.DARK_GRAY);
		disxy.setForeground(Color.MAGENTA);
		disxy.setFont(new Font("方正舒体", Font.BOLD, 28));
		disxy.setBounds(0, 50, 10000, 50);
		frmYfpaint.getContentPane().add(disxy);
		
		
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setBounds(0, 0, 10000, 50);
		frmYfpaint.getContentPane().add(menuBar);
		
		JMenu mnNewMenu = new JMenu("\u9009\u62E9\u6240\u753B\u56FE\u5F62\u5F62\u72B6");
		menuBar.add(mnNewMenu);
		
		JMenuItem yuan = new JMenuItem("\u5706\u5F62");
		yuan.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				tuxing="圆形";
			}
		});
		mnNewMenu.add(yuan);
		
		JMenuItem jvxing = new JMenuItem("\u77E9\u5F62");
		jvxing.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				tuxing="矩形";
			}
		});
		mnNewMenu.add(jvxing);
		
		JMenuItem sanjiao = new JMenuItem("\u4E09\u89D2\u5F62");
		sanjiao.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				tuxing="三角形";
			}
		});
		mnNewMenu.add(sanjiao);
		
		JMenuItem zhengfang = new JMenuItem("\u6B63\u65B9\u5F62");
		zhengfang.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				tuxing="正方形";
			}
		});
		mnNewMenu.add(zhengfang);
		
		JMenu menu = new JMenu("\u9009\u62E9\u6240\u753B\u56FE\u5F62\u989C\u8272");
		menuBar.add(menu);
		
		JMenuItem red = new JMenuItem("\u7EA2\u8272");
		red.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				c=Color.RED;
			}
		});
		menu.add(red);
		
		JMenuItem black = new JMenuItem("\u9ED1\u8272");
		black.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				c=Color.BLACK;
				
			}
		});
		menu.add(black);
		
		JMenuItem green = new JMenuItem("\u7EFF\u8272");
		green.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				c=Color.GREEN;
			}
		});
		menu.add(green);
		
		JMenuItem blue = new JMenuItem("\u84DD\u8272");
		blue.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				c=Color.BLUE;
			}
		});
		menu.add(blue);
		
		JMenu exit = new JMenu("\u9000\u51FA");
		exit.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				System.exit(0);
			}
		});
		
		JMenu mngraphtxt = new JMenu("\u67E5\u770Bgraph.txt\u6587\u672C\u4E2D\u7684\u6570\u636E");
		mngraphtxt.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				disxy.setText("你刚才点击了查看数据菜单项，下面为你显示的是相关文件graph.txt下的文件");
				int yiwei=20;
				Graphics g = panel.getGraphics();
				g.clearRect(0, 0, 100000, 100000);
				g.setColor(c);
	        	g.setFont(new Font("Serif",Font.BOLD+Font.ITALIC,18));
	            List<String> readlist	= YfRead();
	        for(String  str : readlist ) {
	        	yiwei=yiwei+20;
	        	System.out.println(str);
	            g.drawString(str, 350,yiwei );
	        }
			
			}
		});
		menuBar.add(mngraphtxt);
		
		JMenu mnNewMenu_1 = new JMenu("\u6253\u5F00graph.txt\u6587\u4EF6");
		mnNewMenu_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				File file=new File("./graph/graph.txt");
				try {
				//	java.awt.Desktop.getDesktop().open(file.getParentFile());

					java.awt.Desktop.getDesktop().open(file);
				} catch (Exception e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				JOptionPane.showMessageDialog(null, "未找到相关文件，可能时你还没点击下面面板，没产生相关坐标导致的。", "错误提示",JOptionPane.ERROR_MESSAGE);
				}
			}
		});
		
		JMenu mnNewMenu_2 = new JMenu("\u6253\u5F00\u6587\u4EF6\u6240\u5728\u76EE\u5F55");
		mnNewMenu_2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				File file=new File("./graph/graph.txt");
				try {
					java.awt.Desktop.getDesktop().open(file.getParentFile());

					//java.awt.Desktop.getDesktop().open(file);
				} catch (Exception e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				JOptionPane.showMessageDialog(null, "未找到相关文件，可能时你还没点击下面面板，没产生相关坐标导致的。", "错误提示",JOptionPane.ERROR_MESSAGE);
				}
			}
		});
		menuBar.add(mnNewMenu_2);
		menuBar.add(mnNewMenu_1);
		menuBar.add(exit);
		
	

		panel.addMouseListener(new MouseAdapter() {
			int count = 0;

			@Override

			public void mouseClicked(MouseEvent e) {
				int x = 0, y = 0;
				x = e.getX();
				y = e.getY();
				count++;
				disxy.setText("这是你第 "+count+" 次点击面板，点击的坐标为： x = "+x+" y= "+y+" 。");
				if("圆形".equals(tuxing)) {
					list.add("The " + count + " data written is x= " + x + "  y= " + y + " Draw a circle. \n");
					System.out.println("第" + count + "次的数据为" + x + "," + y + "画了一个圆");
					Graphics g = panel.getGraphics();
					g.setColor(c);
					g.clearRect(0, 0, 10000, 10000);
					g.drawOval(x, y, 100, 100);
				    YfWrite(list);
				}
				if("矩形".equals(tuxing)) {
					list.add("The " + count + " data written is x= " + x + "  y= " + y + " Draw a rectangle. \n");
					System.out.println("第" + count + "次的数据为" + x + "," + y + "画了一个矩形");
					Graphics g = panel.getGraphics();
					g.setColor(c);
					g.clearRect(0, 0, 10000, 10000);
					g.drawRect(x, y, 100, 80);
				    YfWrite(list);
					
				}
				if("三角形".equals(tuxing)) {
					list.add("The " + count + " data written is x= " + x + "  y= " + y + " Draw a triangle. \n");
					System.out.println("第" + count + "次的数据为" + x + "," + y + "画了一个三角形");
					Graphics g = panel.getGraphics();
					g.setColor(c);
					g.clearRect(0, 0, 10000, 10000);
					int[] x1= {x+100,x,(x-100)/2};
					int[] y1= {y+100,y,y};
					g.drawPolygon(x1, y1, 3);
				    YfWrite(list);
				}
				if("正方形".equals(tuxing)) {
					list.add("The " + count + " data written is x= " + x + "  y= " + y + " Draw a squrae. \n");
					System.out.println("第" + count + "次的数据为" + x + "," + y + "画了一个正方形");
					Graphics g = panel.getGraphics();
					g.setColor(c);
					g.clearRect(0, 0, 10000, 10000);
					g.drawRect(x, y, 100, 100);
				    YfWrite(list);
					
				}
			}
		});

	}

	class Mypanel extends JPanel {
		public void paintComponent(Graphics g) {
			super.paintComponent(g);
			g.setColor(c);
			g.drawOval(0, 0, 100, 100);

		}
	}
	public void YfWrite(List<String> list) {
		DataOutputStream Dout = null;
		try {
			File filedir=new File("./graph");
		    filedir.mkdirs();
		    File filegraph =new File(filedir,"graph.txt");
			
			Dout = new DataOutputStream(
					new FileOutputStream(filegraph));
			String result = list.toString().replace("[", " ");
			String result1 = result.replace("]", " ");
			String result2 = result1.replace(",", "");
			Dout.writeBytes(result2);
			Dout.flush();
			Dout.close();
		} catch (Exception e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		JOptionPane.showMessageDialog(null, "无法写入到相关文件，请你检查你的相关环境。", "错误提示",JOptionPane.ERROR_MESSAGE);
		}
	}
	public List<String> YfRead() {
		List<String> list =new ArrayList<String>() ;

		BufferedReader Bur =null;
	
		try {
			Bur = new BufferedReader(new FileReader("./graph/graph.txt"));
		
			while(Bur.ready()) {
				String str=Bur.readLine();
			    list.add(str);
				
			}
			Bur.close();
		
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			 JOptionPane.showMessageDialog(null, "未找到相关文件，可能时你还没点击下面面板，没产生相关坐标导致的。", "错误提示",JOptionPane.ERROR_MESSAGE);
		}
		return list;
		
	}
}
