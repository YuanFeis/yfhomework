import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Paint;

import javax.swing.ImageIcon;
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
import java.awt.event.MouseMotionAdapter;

public class Zjy_Paint {

	private JFrame frmYfpaint;
	private String tuxing = "圆形";
	private Color c = Color.RED; 

	 //用于处理拖动事件，表示鼠标按下时的坐标，相对于JFrame
	 int xOld = 0;
	 int yOld = 0;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Zjy_Paint window = new Zjy_Paint();
					Welcome w1= new Welcome();
					w1.setBounds(350, 100, 1259,694);
					w1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
					w1.setVisible(true);
					Thread.sleep(2000);
					w1.setVisible(false);
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
		frmYfpaint.getContentPane().setBackground(Color.WHITE);
		frmYfpaint.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				 xOld = e.getX();//记录鼠标按下时的坐标
				 yOld = e.getY();
			}
		});
		frmYfpaint.addMouseMotionListener(new MouseMotionAdapter() {
			@Override
			public void mouseDragged(MouseEvent e) {
				int xOnScreen = e.getXOnScreen();
			    int yOnScreen = e.getYOnScreen();
				int xx = xOnScreen - xOld;
				int yy = yOnScreen - yOld;
				frmYfpaint.setLocation(xx, yy);//设置拖拽后，窗口的位置
			}
		});
		frmYfpaint.setTitle("YFPaint");
		frmYfpaint.setBounds(400, 100, 1100, 800);
		frmYfpaint.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmYfpaint.getContentPane().setLayout(null);
		frmYfpaint.setUndecorated(true);
		JPanel panel = new Mypanel();
		panel.setBounds(0, 100, 10000, 10000);
		panel.setOpaque(false);
		frmYfpaint.getContentPane().add(panel);
		
		
		
		
		JLabel disxy = new JLabel("\u201C\u8FD9\u662F\u4E00\u4E2A\u70B9\u51FB\u9762\u677F\u4EA7\u751F\u56FE\u5F62\u7684\u5C0F\u7A0B\u5E8F\uFF0C\u4F60\u53EF\u4EE5\u5728\u4E0A\u65B9\u83DC\u5355\u8FDB\u884C\u76F8\u5173\u753B\u56FE\u9009\u62E9\u201D");
		disxy.setBackground(Color.DARK_GRAY);
		disxy.setForeground(Color.MAGENTA);
		disxy.setFont(new Font("方正舒体", Font.BOLD, 28));
		disxy.setBounds(0, 50, 10000, 50);
		frmYfpaint.getContentPane().add(disxy);
		
		
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setForeground(Color.WHITE);
		menuBar.setFont(new Font("方正舒体", Font.BOLD, 15));
		menuBar.setBackground(Color.WHITE);
		menuBar.setBounds(0, 0, 10000, 50);
		frmYfpaint.getContentPane().add(menuBar);
		
		JMenu mnNewMenu = new JMenu("\u9009\u62E9\u6240\u753B\u56FE\u5F62\u5F62\u72B6");
		mnNewMenu.setBackground(Color.WHITE);
		mnNewMenu.setFont(new Font("方正舒体", Font.BOLD, 15));
		menuBar.add(mnNewMenu);
		
		JMenuItem yuan = new JMenuItem("\u5706\u5F62");
		yuan.setBackground(Color.WHITE);
		yuan.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				tuxing="圆形";
			}
		});
		mnNewMenu.add(yuan);
		
		JMenuItem jvxing = new JMenuItem("\u77E9\u5F62");
		jvxing.setBackground(Color.WHITE);
		jvxing.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				tuxing="矩形";
			}
		});
		mnNewMenu.add(jvxing);
		
		JMenuItem sanjiao = new JMenuItem("\u4E09\u89D2\u5F62");
		sanjiao.setBackground(Color.WHITE);
		sanjiao.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				tuxing="三角形";
			}
		});
		mnNewMenu.add(sanjiao);
		
		JMenuItem zhengfang = new JMenuItem("\u6B63\u65B9\u5F62");
		zhengfang.setBackground(Color.WHITE);
		zhengfang.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				tuxing="正方形";
			}
		});
		mnNewMenu.add(zhengfang);
		
		JMenu menu = new JMenu("\u9009\u62E9\u6240\u753B\u56FE\u5F62\u989C\u8272");
		menu.setBackground(Color.WHITE);
		menu.setFont(new Font("方正舒体", Font.BOLD, 15));
		menuBar.add(menu);
		
		JMenuItem red = new JMenuItem("\u7EA2\u8272");
		red.setBackground(Color.WHITE);
		red.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				c=Color.RED;
			}
		});
		menu.add(red);
		
		JMenuItem black = new JMenuItem("\u9ED1\u8272");
		black.setBackground(Color.WHITE);
		black.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				c=Color.BLACK;
				
			}
		});
		menu.add(black);
		
		JMenuItem green = new JMenuItem("\u7EFF\u8272");
		green.setBackground(Color.WHITE);
		green.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				c=Color.GREEN;
			}
		});
		menu.add(green);
		
		JMenuItem blue = new JMenuItem("\u84DD\u8272");
		blue.setBackground(Color.WHITE);
		blue.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				c=Color.BLUE;
			}
		});
		menu.add(blue);
		
		JMenu exit = new JMenu("\u9000\u51FA");
		exit.setBackground(Color.WHITE);
		exit.setFont(new Font("方正舒体", Font.BOLD, 15));
		exit.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				GoodBye gb=new GoodBye();
				gb.setBounds(350, 100, 1259,720);
				gb.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				gb.setVisible(true);
				try {
					Thread.sleep(2000);
				} catch (InterruptedException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				System.exit(0);
			}
		});
		
		JMenu mngraphtxt = new JMenu("\u67E5\u770Bgraph.txt\u6587\u672C\u4E2D\u7684\u6570\u636E");
		mngraphtxt.setFont(new Font("方正舒体", Font.BOLD, 15));
		mngraphtxt.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				disxy.setText("你刚才点击了查看数据菜单项，下面为你显示的是相关文件graph.txt下的文件");
				int yiwei=20;
				Graphics g = panel.getGraphics();
				Graphics2D g2d = (Graphics2D) g;
				g2d.setBackground(Color.WHITE);
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
		mnNewMenu_1.setFont(new Font("方正舒体", Font.BOLD, 15));
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
		mnNewMenu_2.setFont(new Font("方正舒体", Font.BOLD, 15));
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
		
		JMenu menu_1 = new JMenu("\u5927\u5C0F\u8BBE\u7F6E");
		menu_1.setFont(new Font("方正舒体", Font.BOLD, 15));
	
		menuBar.add(menu_1);
		
		JMenuItem zuidahua = new JMenuItem("\u6700\u5927\u5316");
		zuidahua.setBackground(Color.WHITE);
		zuidahua.setFont(new Font("方正舒体", Font.BOLD, 15));
		zuidahua.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				frmYfpaint.setExtendedState(frmYfpaint.MAXIMIZED_BOTH);;
			}
		});
		menu_1.add(zuidahua);
		
		JMenuItem zuixiaohua = new JMenuItem("\u6700\u5C0F\u5316");
		zuixiaohua.setBackground(Color.WHITE);
		zuixiaohua.setFont(new Font("方正舒体", Font.BOLD, 15));
		zuixiaohua.addMouseListener(new MouseAdapter() {
			
			@Override
			public void mousePressed(MouseEvent e) {
				frmYfpaint.setExtendedState(frmYfpaint.ICONIFIED);;
			}
		});
		menu_1.add(zuixiaohua);
		
		JMenuItem huanyuan = new JMenuItem("\u8FD8\u539F");
		huanyuan.setBackground(Color.WHITE);
		huanyuan.setFont(new Font("方正舒体", Font.BOLD, 15));
		huanyuan.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				frmYfpaint.setExtendedState(frmYfpaint.NORMAL);;
			}
		});
		menu_1.add(huanyuan);
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
					Graphics2D g2d = (Graphics2D) g;
					g2d.setBackground(Color.WHITE);
					g.setColor(c);
					g.clearRect(0, 0, 10000, 10000);
					g.drawOval(x, y, 100, 100);
					
				    YfWrite(list);
				}
				if("矩形".equals(tuxing)) {
					list.add("The " + count + " data written is x= " + x + "  y= " + y + " Draw a rectangle. \n");
					System.out.println("第" + count + "次的数据为" + x + "," + y + "画了一个矩形");
					Graphics g = panel.getGraphics();
					Graphics2D g2d = (Graphics2D) g;
					g2d.setBackground(Color.WHITE);
					g.setColor(c);
					g.clearRect(0, 0, 10000, 10000);
					g.drawRect(x, y, 100, 80);
				    YfWrite(list);
					
				}
				if("三角形".equals(tuxing)) {
					list.add("The " + count + " data written is x= " + x + "  y= " + y + " Draw a triangle. \n");
					System.out.println("第" + count + "次的数据为" + x + "," + y + "画了一个三角形");
					Graphics g = panel.getGraphics();
					Graphics2D g2d = (Graphics2D) g;
					g2d.setBackground(Color.WHITE);
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
					Graphics2D g2d = (Graphics2D) g;
					g2d.setBackground(Color.WHITE);
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
	class GoodBye extends JFrame {
		public GoodBye() {
			setUndecorated(true);
			this.setBackground(new Color(0, 0, 0, 0));
			
		}
			@Override
			public void paint(Graphics g) {
				// TODO Auto-generated method stub
				super.paint(g);
				  Graphics2D g2 = (Graphics2D)g; //强转成2D
			      ImageIcon ii1 = new ImageIcon("src/img/GOODBYE.png");
			        //dimision.width是窗体的宽度，dimision.height是窗体的高度
			      g2.drawImage(ii1.getImage(), 0, 0, 1240,760,null);      
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

class Welcome extends JFrame {
	public Welcome() {
		setUndecorated(true);
		this.setBackground(new Color(0, 0, 0, 0));
		
	}
		@Override
		public void paint(Graphics g) {
			// TODO Auto-generated method stub
			super.paint(g);
			  Graphics2D g2 = (Graphics2D)g; //强转成2D
		      ImageIcon ii1 = new ImageIcon("src/img/WELCOME.png");
		        //dimision.width是窗体的宽度，dimision.height是窗体的高度
		      g2.drawImage(ii1.getImage(), 0, 0, 1259,694,null);      
		}
		
	}


