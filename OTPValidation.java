package GUI;
import java.awt.Color;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JColorChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
public class OTPValidation implements ActionListener{

	JLabel userName,userAge;
	JTextField txtname,txtAge ;
	JButton btnOK,btnCancel, btnSetBackround;
	Frame f;
	String getUserOTP=null , getUserAge;
	int receivedOTP=0;
	final int OTP=1234;
	public OTPValidation() 
	{
		userName=new JLabel("Enter Name");
		userAge=new JLabel("Enter Age");
		 
		txtname= new JTextField(20);
		txtAge= new JTextField(20);
		 
		btnOK=new JButton("Ok");
		btnCancel=new JButton("Cancel");
		
		btnSetBackround=new JButton("Set Background");
	 
		 f=new Frame();
		 f.setVisible(true);
		 f.setSize(600, 800);
		 f.setLayout(null);
	  // f.setBackground(Color.green);
	   //f.getContentPane().setBackground(Color.YELLOW);
		 btnOK.setBackground(Color.cyan);
		 btnCancel.setBackground(Color.cyan);
		 btnSetBackround.setBackground(Color.cyan);
		 
		 userName.setBounds(100, 100, 200, 40);
		 txtname.setBounds(250, 100, 200, 40);
		 userAge.setBounds(100, 200, 200, 40);
		 txtAge.setBounds(250, 200, 200, 40);
		 btnOK.setBounds(100, 360, 80, 40);
		 btnCancel.setBounds(370, 360, 80, 40);
		 
		 btnSetBackround.setBounds(100, 450, 340, 40);
		 
		 f.add(userName); 
		 f.add(txtname);
		 f.add(userAge); 
		 f.add(txtAge);
		 f.add(btnOK); 
		 f.add(btnCancel);
		 f.add(btnSetBackround);
		 
		 btnOK.addActionListener(this);
		 btnCancel.addActionListener(this);
		 btnSetBackround.addActionListener(this);
		 
		 //JColorChooser jc=new JColorChooser();
		 //Color clr=jc.showDialog(f, "ColorChooser",Color.black);
		 //f.setBackground(clr);
	}
	public static void main(String[] args) {
		 
		OTPValidation sf= new OTPValidation();

	}
	@Override
	public void actionPerformed(ActionEvent e) 
	{
		
	if(e.getSource()==btnSetBackround) 
	{
	  JColorChooser jc=new JColorChooser();
	  Color clr=jc.showDialog(f, "ColorChooser",Color.black);
	  f.setBackground(clr);
	 }
		
	 if(e.getSource()==btnOK) 
	 {
		
	  JOptionPane.showMessageDialog(f, "You have received OTP on your mobile please enter OTP for next step");
	
	   getUserOTP=JOptionPane.showInputDialog("Enter Your OTP");
	   receivedOTP=Integer.parseInt(getUserOTP);
				 
		
		getUserAge= txtAge.getText();
				
			 
		if(receivedOTP==OTP) 
		{
					 
		int getAge=Integer.parseInt(getUserAge);
	    if(getAge>18)
	    {
		 JOptionPane.showMessageDialog(f, "Thanks! You are eligible for vote");
		 f.dispose();
						   
		 }
		  else 
		 {
		  JOptionPane.showMessageDialog(f, "Sorry! You are not eligible for vote"); 
		  f.dispose();
		 }
					 
	   }
		  else 
		 {
		  JOptionPane.showMessageDialog(f, "Sorry! Invalid OTP");
					
		  while(receivedOTP!=1234) 
		 {
		  getUserOTP=JOptionPane.showInputDialog("Enter Your OTP");
		  receivedOTP=Integer.parseInt(getUserOTP);
						 
						 
		  getUserAge= txtAge.getText();
	    //if(receivedOTP==JOptionPane.YES_OPTION) {
		  if(receivedOTP==OTP) 
		 {
								 
		  int getAge=Integer.parseInt(getUserAge);
		  if(getAge>18)
		 {
	      JOptionPane.showMessageDialog(f, "Thanks! You are eligible for vote");
		  f.dispose();
									   
		 }
	       else 
		 {
		  JOptionPane.showMessageDialog(f, "Sorry! You are not eligible for vote"); 
		  f.dispose();
		 }
								 
	   }
		 else {
				JOptionPane.showMessageDialog(f, "Sorry! Invalid OTP..Try Again");
			  }
	      //}
	    }//while
		  if(receivedOTP==JOptionPane.CANCEL_OPTION) {
	      f.dispose();
		}
						 
	  }
	  // f.dispose();
	}
	  if(e.getSource()==btnCancel)
		{
		  f.dispose();
			 
		}
	  }
	}
  