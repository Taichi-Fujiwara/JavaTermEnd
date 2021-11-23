
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Desktop;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.Random;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.LineBorder;

 public class MainFrame extends JFrame{
	String nick = null;
	String bigname = null;
	int n;

	 MainFrame(String title){

		setTitle(title);
		setSize(1000, 700);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		JPanel panel1 = new JPanel();
		panel1.setBackground(Color.WHITE);
		panel1.setLayout(null);

		 /*ImageIcon icon0 = new ImageIcon("./genlogo.png");
		 setIconImage(icon0.getImage());*/

		ImageIcon icon = new ImageIcon("./genlogo.png");
		JLabel imagelabel = new JLabel(icon);
		imagelabel.setBounds(70, 20, 800, 300);

		ImageIcon icon2 = new ImageIcon("./ya1.png");
		JLabel imagelabel2 = new JLabel(icon2);
		imagelabel2.setBounds(520, 430, 90, 80);
		
		ImageIcon icon3 = new ImageIcon("./IC1.png");
		ImageIcon icon4 = new ImageIcon("./IC2.png");
		ImageIcon icon5 = new ImageIcon("./IC3.png");

		final JTextField text1 = new JTextField();
		text1.setBounds(400, 380, 280, 50);
		text1.setFont(new Font("Serif", Font.BOLD, 20));
		text1.setBorder(new LineBorder(Color.BLUE, 4, true));

		final JTextArea area1 = new JTextArea();
		area1.setBounds(400, 520,280, 50);
		area1.setFont(new Font("Serif", Font.BOLD, 22));
	    area1.setBorder(new LineBorder(Color.RED, 4, true));

	    JLabel label1 = new JLabel("元の名前");
	    label1.setFont(new Font("Serif", Font.BOLD, 15));
	    label1.setBounds(400, 340, 200, 50);

	    JLabel label2 = new JLabel("あだ名");
	    label2.setFont(new Font("Serif", Font.BOLD, 15));
	    label2.setBounds(400, 480,200, 48);

		 JButton button1 = new JButton(icon3);
		 button1.setBounds(190,350,100,100);

		 JButton button2 = new JButton(icon4);
		 button2.setBounds(190,500,100,100);
		 JButton button3 = new JButton(icon5);
		 button3.setBounds(720,450,100,50);

		//ボタンイベント（入力）
	    button1.addActionListener(
	      new ActionListener(){
	        public void actionPerformed(ActionEvent event){
	        	String nickname = null;
	        	int many = 11;
	        	MakeNickName making = new MakeNickName();
	        	Random rnd1 = new Random();

	        	int ran = rnd1.nextInt(many);
	        	bigname = text1.getText();
	        	
	        	System.out.println(bigname+"\n");
	        	Setnum(ran);
	        	making.SetName(bigname,ran);
	        	System.out.println(bigname+"\n");
	        	
	        	nickname = making.GetName();
	        	nick = nickname;
	        	
				area1.setText("");
	            area1.append(nickname);
	        }
	      }
	    );
	    //ボタンイベント（デリート）
		button2.addActionListener(
			new ActionListener(){
				public void actionPerformed(ActionEvent event){
					area1.setText("");
					nick = null;
				}
			}
		);
		//ボタンイベント（シェア）
		button3.addActionListener(
			      new ActionListener(){
			        public void actionPerformed(ActionEvent event){
			        	if(bigname != null && nick != null){
				        	Desktop desktop = Desktop.getDesktop();
				    		String uriString = "http://twitter.com/share?text=";
				    		try {
			    			URI uri = new URI(uriString+"「"+bigname+"」"+"のあだ名は...「"+nick+"」に決定！！");
				    			desktop.browse(uri);
				    		} catch (URISyntaxException e) {
				    			e.printStackTrace();
				    		} catch (IOException e) {
				    			e.printStackTrace();
				    		}
				        	int favnum = Getnum();
				        	System.out.println("favorite is "+favnum+"\n");
			        	}else{
			        		area1.append("ニックネーム作ってよ！！");
			        	}
			        }
			      }
			    );

		panel1.add(imagelabel);
		panel1.add(imagelabel2);
		panel1.add(label1);
		panel1.add(label2);
		panel1.add(text1);
		panel1.add(area1);
		panel1.add(button1);
		panel1.add(button2);
		panel1.add(button3);

		Container contentPane = getContentPane();
		contentPane.add(panel1, BorderLayout.CENTER);
	}
	
	void Setnum(int n){
		this.n = n;
	}
	int Getnum(){
		return(this.n);
	}

}