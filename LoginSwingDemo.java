import javax.swing.*;
class LoginSwingDemo extends JFrame
{	
	LoginSwingDemo(String s1)
	{	
		super(s1);
	}
	LoginSwingDemo()
	{	
		
	}
	void setComponents()
	{	
		JLabel l1=new JLabel("WELCOME");
		JTextField t1=new JTextField();
		setLayout(null);
		l1.setBounds(200,100,100,30);
		t1.setBounds(200,100,100,30);
		add(t1);
		add(l1);
	}
	public static void main(String args[])
	{
		LoginSwingDemo s1=new LoginSwingDemo("Welcome to FaceBook..!!");
		s1.setVisible(true);
		s1.setSize(700,700);
		s1.setComponents();
		s1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}