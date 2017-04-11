package guoyang;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Image;

import javax.imageio.ImageIO;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.SwingConstants;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JScrollPane;
import javax.swing.JSplitPane;
import javax.swing.ImageIcon;
import javax.swing.BoxLayout;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.ListModel;
import javax.swing.border.EmptyBorder;
import javax.swing.JProgressBar;

import java.awt.Dimension;
import java.awt.SystemColor;
import java.awt.Font;

import javax.swing.JTable;
import javax.swing.JList;
import javax.swing.JTextArea;

public class Main2 {

	private JFrame frame;
	private JTextField textField;
	private JTable table;
	JPanel backImage;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Main2 window = new Main2();
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
	public Main2() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		
		
		frame = new JFrame();
		frame.setUndecorated(true);
		frame.setOpacity((float) 0.90);
		
		FrameListener moveListener = new FrameListener(frame);
        
        frame.addMouseListener(moveListener);
        frame.addMouseMotionListener(moveListener);

		frame.setBounds(100, 100, 640, 400);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		 backImage = new JPanel()
		{
			protected void paintComponent(Graphics g)
			{
				try
				{
					Image bg = ImageIO.read(new File("img//1.jpg"));
					// 绘制一张图片作为背景
					g.drawImage(bg , 0 , 0 , getWidth() , getHeight() ,  null);
				}
				catch (IOException ex)
				{
					ex.printStackTrace();
				}
			}
		};
		
		backImage.setLayout(new BorderLayout(0, 0));
		frame.getContentPane().add(backImage);
		
		JPanel panel_1 = new JPanel();
		backImage.add(panel_1, BorderLayout.NORTH);
		//panel_1.setOpaque(false);
		//panel_1.setOpaque((float) 0.90);
		panel_1.setBackground(Color.LIGHT_GRAY);
		panel_1.setLayout(new BoxLayout(panel_1, BoxLayout.X_AXIS));
		
		JPanel panel_2 = new JPanel();
		//panel_2.setOpaque(false);
		panel_2.setBackground(Color.GRAY);
		FlowLayout flowLayout_1 = (FlowLayout) panel_2.getLayout();
		flowLayout_1.setAlignment(FlowLayout.LEFT);
		panel_1.add(panel_2);
		
		JLabel label = new JLabel("");
		label.setIcon(new ImageIcon("img\\Logo-96-32.png"));
		//label.setBackground(new Color(1,1,0,0f));
		panel_2.add(label);
		
		textField = new JTextFieldUser("img\\sousuo.png");
		panel_2.add(textField);
		textField.setColumns(10);
		textField.setText("搜索歌曲");
		textField.setBackground(new Color(1,1,1,1f));
		textField.setBorder(new EmptyBorder(0,0, 0, 0));
		
		textField.addMouseListener(new MouseListener(){

			@Override
			public void mouseClicked(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mousePressed(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mouseReleased(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mouseEntered(MouseEvent e) {
				textField.setText("");
				
			}

			@Override
			public void mouseExited(MouseEvent e) {
				textField.setText("搜索歌曲");
				
			}
			
		});
		
		
		JPanel panel = new JPanel();
		FlowLayout flowLayout = (FlowLayout) panel.getLayout();
		flowLayout.setAlignment(FlowLayout.RIGHT);
		panel.setBackground(Color.GRAY);
		panel_1.add(panel);
		
		JLabel pifu = new JLabel("         ");
		
		panel.add(pifu);
		pifu.setIcon(new ImageIcon("img\\pifu.png"));
		
		JLabel minbtn = new JLabel("");
		panel.add(minbtn);
		
		JLabel maxbtn = new JLabel("");
		
		//maxbtn.setBackground(new Color(1,1,1,0f));
		panel.add(maxbtn);
		
		JLabel closebtn = new JLabel("");
		//closebtn.setBackground(new Color(1,1,1,0f));
		panel.add(closebtn);
		
		
		maxbtn.setIcon(new ImageIcon("img\\maxhui.png"));
		closebtn.setIcon(new ImageIcon("img\\closehui.png"));
		minbtn.setIcon(new ImageIcon("img\\minhui.png"));
		
		
		JPanel panel_3 = new JPanel();
		panel_3.setBackground(SystemColor.menu);
		backImage.add(panel_3, BorderLayout.SOUTH);
		
		JLabel last = new JLabel("");
		last.setIcon(new ImageIcon("img\\shangyishou_gray.png"));
		panel_3.add(last);
		
		JLabel run = new JLabel("");
		run.setIcon(new ImageIcon("img\\bofang-Gray.png"));
		panel_3.add(run);
		
		JLabel next = new JLabel("");
		next.setIcon(new ImageIcon("img\\xiayishou_gray.png"));
		panel_3.add(next);
		
		JLabel lblNewLabel_3 = new JLabel("00:20");
		panel_3.add(lblNewLabel_3);
		
		JProgressBar progressBar = new JProgressBar();
		progressBar.setForeground(Color.GRAY);
		progressBar.setValue(40);
		//progressBar.setBackground(Color.GRAY);
		progressBar.setPreferredSize(new Dimension(300, 8));
		panel_3.add(progressBar);
		
		JLabel lblNewLabel_4 = new JLabel("04:20");
		panel_3.add(lblNewLabel_4);
		
		JLabel volum = new JLabel("");
		volum.setIcon(new ImageIcon("img\\13.png"));
		panel_3.add(volum);
		
		JProgressBar progress = new JProgressBar();
		progress.setForeground(Color.GRAY);
		progress.setValue(40);
		progress.setPreferredSize(new Dimension(70, 12));
		panel_3.add(progress);
		
		
		JLabel shunxu = new JLabel("");
		shunxu.setIcon(new ImageIcon("img\\10.png"));
		panel_3.add(shunxu);
		
		JLabel label_2 = new JLabel("词");
		panel_3.add(label_2);
		
		JPanel panel_4 = new JPanel();
		panel_4.setBackground(new Color(1,1,1,0.2f));
		backImage.add(panel_4, BorderLayout.WEST);
		panel_4.setLayout(new BoxLayout(panel_4, BoxLayout.Y_AXIS));
		
		
		
		JPanel panel_6 = new JPanel();
		panel_6.setBackground(new Color(1,1,1,0.2f));
		panel_4.add(panel_6);
		panel_6.setLayout(new BoxLayout(panel_6, BoxLayout.Y_AXIS));
		
		JLabel label_3 = new JLabel(" ");
		panel_6.add(label_3);
		
		JLabel lbln = new JLabel("\u6211\u7684\u97F3\u4E50\r\n\r\n");
		lbln.setFont(new Font("微软雅黑", Font.BOLD, 18));
		panel_6.add(lbln);
		
		JLabel lblNewLabel = new JLabel(" ");
		panel_6.add(lblNewLabel);
		
		JLabel label_1 = new JLabel("\u6211\u4E0B\u8F7D\u7684");
		label_1.setFont(new Font("微软雅黑", Font.BOLD, 18));
		panel_6.add(label_1);
		
		JLabel lblNewLabel_1 = new JLabel(" ");
		panel_6.add(lblNewLabel_1);
		
		JLabel label_4 = new JLabel("\u6211\u6536\u85CF\u7684");
		label_4.setFont(new Font("微软雅黑", Font.BOLD, 18));
		panel_6.add(label_4);
		
		JLabel label_5 = new JLabel(" ");
		label_5.setFont(new Font("微软雅黑", Font.BOLD, 18));
		panel_6.add(label_5);
		
		JLabel lblmv = new JLabel("\u5386\u53F2\u8BB0\u5F55");
		lblmv.setFont(new Font("微软雅黑", Font.BOLD, 18));
		panel_6.add(lblmv);
		
		JPanel panel_5 = new JPanel();
		//panel_5.setForeground(new Color(1,1,1,0.2f));
		panel_5.setOpaque(false);
		backImage.add(panel_5, BorderLayout.CENTER);
		
		JTextArea textArea = new JTextArea();
		//textArea.setEnabled(false);
		//textArea.setEditable(false);
		textArea.setForeground(Color.DARK_GRAY);
		textArea.setFont(new Font("楷体", Font.PLAIN, 20));
		textArea.setBackground(new Color(1,1,1,0f));
		textArea.setText("想再回到旧生活\n"
				+ " 怎样都找不到出口 \n"
				+ "迟早会断了念头\n "
				+ "什么是对或错\n "
				+ "判断能力可能减弱 \n"
				+ "谁现在会来帮我\n "
				+ "你说是我找借口\n "
				+ "其实并没想逃脱\n"
				+ " 总觉得情绪压迫\n"
				+ " 也不是我的错\n "
				+ "this is my free\n "
				+ "oh this is my free\n");
		//JScrollPane scr=new JScrollPane();
		//scr.setOpaque(false);
		panel_5.add(textArea);
		
		
		
		
		
		
		Object[] resultTitle = {"序号","音乐标题" , "歌手" , "时长"};
		Object[][] data = {{"单词" , "种别码" , "类别","行号"}};
		table = new JTable(data,resultTitle);
		table.setOpaque(false);
		//JScrollPane scr=new JScrollPane(table);
		//scr.setOpaque(false);
		table.setBackground(new Color(1,1,1,0.2f));
		//panel_5.add(scr);
		
		
		
		
		
		maxbtn.addMouseListener(new MouseListener(){

			@Override
			public void mouseClicked(MouseEvent e) {
				if(frame.getExtendedState()==Frame.MAXIMIZED_BOTH){
					frame.setExtendedState(Frame.NORMAL);
				}else{
					frame.setExtendedState(Frame.MAXIMIZED_BOTH);
				}
				
			}

			@Override
			public void mousePressed(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mouseReleased(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mouseEntered(MouseEvent e) {
				
				maxbtn.setIcon(new ImageIcon("img\\maxbai.png"));
			}

			@Override
			public void mouseExited(MouseEvent e) {
				maxbtn.setIcon(new ImageIcon("img\\maxhui.png"));
				
			}

			
			
		});
		minbtn.addMouseListener(new MouseListener(){

			@Override
			public void mouseClicked(MouseEvent e) {
				
				frame.setExtendedState(Frame.ICONIFIED);
				
				
			}

			@Override
			public void mousePressed(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mouseReleased(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mouseEntered(MouseEvent e) {
				minbtn.setIcon(new ImageIcon("img\\minbai.png"));
				
			}

			@Override
			public void mouseExited(MouseEvent e) {
				minbtn.setIcon(new ImageIcon("img\\minhui.png"));
				
			}

			
			
		});
		closebtn.addMouseListener(new MouseListener(){

			@Override
			public void mouseClicked(MouseEvent e) {
				frame.dispose();
			}

			@Override
			public void mousePressed(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mouseReleased(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mouseEntered(MouseEvent e) {
				closebtn.setIcon(new ImageIcon("img\\closebai.png"));
			}
			@Override
			public void mouseExited(MouseEvent e) {
				closebtn.setIcon(new ImageIcon("img\\closehui.png"));
			}
			
		});
		
		pifu.addMouseListener(new MouseListener(){

			@Override
			public void mouseClicked(MouseEvent e) {
				frame.getContentPane().remove(backImage);
				last.setIcon(new ImageIcon("img1\\shangyishou_blue.png"));
				next.setIcon(new ImageIcon("img1\\xiayishou_blue.png"));
				run.setIcon(new ImageIcon("img1\\bofang_blue.png"));
				panel_1.setBackground(new Color(0,0,1,0.2f));
				panel_2.setBackground(new Color(0,0,1,0.2f));
				panel.setBackground(new Color(0,0,1,0.2f));
				panel_3.setBackground(new Color(0,0,1,0.2f));
				
				backImage = new JPanel()
				{
					protected void paintComponent(Graphics g)
					{
						try
						{
							Image bg = ImageIO.read(new File("img1//timg.jpg"));
							// 绘制一张图片作为背景
							g.drawImage(bg , 0 , 0 , getWidth() , getHeight() ,  null);
						}
						catch (IOException ex)
						{
							ex.printStackTrace();
						}
					}
				};
				backImage.setLayout(new BorderLayout());
				backImage.add(panel_1, BorderLayout.NORTH);
				backImage.add(panel_3, BorderLayout.SOUTH);
				backImage.add(panel_4, BorderLayout.WEST);
				backImage.add(panel_5, BorderLayout.CENTER);
				frame.getContentPane().add(backImage);
				frame.revalidate();
			}

			@Override
			public void mousePressed(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mouseReleased(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mouseEntered(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mouseExited(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
		});
		
	
	}

}
