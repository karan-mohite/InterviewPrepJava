import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

class LoginSwingDemo extends JFrame
{	
	JLabel l1,l2,l3,l4,l5;
	JTextField t1;
	JButton b1,b2,b3;
	JPasswordField t2;
	
	LoginSwingDemo(String s1)
	{	
		super(s1);
	}
	LoginSwingDemo()
	{	
		
	}
	void setComponents()
	{
 		 
		setBackground(Color.red);
		Cursor c1=new Cursor(Cursor.CROSSHAIR_CURSOR);
		Cursor c2=new Cursor(Cursor.HAND_CURSOR);
		Cursor c3=new Cursor(Cursor.WAIT_CURSOR);

		Font f1=new Font("Times New Roman",Font.BOLD,28);
		Font f2=new Font("Callibri",Font.ITALIC,22);
		
		Font f=new Font("Callibri",Font.BOLD,25);
		
		l1=new JLabel("Welcome to VJTech Academy Institute");
		l1.setFont(f1);
		l1.setForeground(Color.RED);
		
		l2=new JLabel("Username");
		l2.setFont(f);
		l2.setBackground(Color.BLUE);
		l2.setForeground(Color.BLUE);
		
		l3=new JLabel("Password");
		l3.setFont(f);
		l3.setForeground(Color.BLUE);
		l3.setBackground(Color.BLUE);
		
		l4=new JLabel();
		t1=new JTextField();
		t2=new JPasswordField();
		
	
		b1=new JButton("Login");
		b1.setBackground(Color.RED);
		b1.setForeground(Color.WHITE);
		b1.setCursor(c1);
		
		b2=new JButton("Clear");
		b2.setBackground(Color.RED);
	    b2.setForeground(Color.WHITE);
		b2.setCursor(c2);
		
		b3=new JButton("ADD");
		b3.setBackground(Color.RED);
		b3.setForeground(Color.WHITE);
		b3.setCursor(c3);

		setLayout(null);
		
		add(l1);
		add(l2);
		add(l3);
		add(l4);
	 
		add(t1);
		add(t2);
		add(b1);
		add(b2);
		add(b3);
		
		l1.setBounds(100,50,500,30);
		l2.setBounds(100,200,160,50);
		l3.setBounds(100,350,160,30);
		l4.setBounds(100,550,400,30);
	 
		t1.setBounds(350,200,100,30);
		t2.setBounds(350,350,100,30);
		b1.setBounds(200,450,100,30);
		b2.setBounds(350,450,100,30);
		b3.setBounds(500,450,100,30);
		
		
		b1.addActionListener(new Log());
		b2.addActionListener(new Clear());
		b3.addActionListener(new Add());
		
		l1.addMouseListener(new MouseL());
		
		
	}
	class MouseL implements MouseListener
	{	
		public void mouseClicked(MouseEvent e1)
		{ 
		}			
		public void mouseEntered(MouseEvent e1)
		{
			l1.setForeground(Color.RED);
		}			
		public void mouseExited(MouseEvent e1) 
		{
			l1.setForeground(Color.BLACK);
		}
		public void mousePressed(MouseEvent e1)
		{
			l1.setText("");
		}			
		public void mouseReleased(MouseEvent e1)
		{
			l1.setText("Username");
		}			  
	}
	public static void main(String args[])
	{
		LoginSwingDemo s1=new LoginSwingDemo("Welcome to FaceBook..!!");
		s1.setVisible(true);
		s1.setSize(700,700);
		s1.setComponents();
		s1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	class Log implements ActionListener
	{	
		public void actionPerformed(ActionEvent e1) 
		{	
			String s1=t1.getText();
			String s2=t2.getText();
			if(s1.equals("coding") && s2.equals("seekho"))
			{	
				JOptionPane.showMessageDialog(null,"Login Successful");
				l4.setText("Login Successful");
			}
			else
			{
				JOptionPane.showMessageDialog(null,"Login UnSuccessful");
			}
		}	
	}
	class Clear implements ActionListener
	{	
		public void actionPerformed(ActionEvent e1) 
		{	
			t1.setText(" ");
			t2.setText(" ");
		}	
	}
	class Add implements ActionListener
	{	
		public void actionPerformed(ActionEvent e1) 
		{	
		    try
			{
			 int a=Integer.parseInt(t1.getText());
			 int b=Integer.parseInt(t2.getText());			 
			 int c=a+b;
			 l4.setText("Addition is :"+c);
			}
			catch(Exception e)
			{
				l4.setText("Please Enter a number only..!!");
			}
		}	
	}
}