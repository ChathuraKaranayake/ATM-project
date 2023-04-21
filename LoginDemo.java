import javax.swing.*; 
import java.awt.*; 
import java.awt.event.*;
import java.io.*;   

class Login extends JFrame implements ActionListener  {   
	JButton btn1,btn2;   JPanel panel;   JLabel label1,label2;   final JTextField  text1;  
	private FileReader fr;
	private BufferedReader br;

	Login()    {    
		//label1 = new JLabel();    //label1.setText("Username:");    //text1 = new JTextField(15); 
 
        /*label2 = new JLabel();    
        label2.setText("PIN NUMBER:");    
        text2 = new JPasswordField(15);      
        SUBMIT=new JButton("OK");     
        panel=new JPanel(new GridLayout(3,1));    
        panel.add(label1);    
        panel.add(text1);    
        panel.add(label2);    
        panel.add(text2);    
        panel.add(SUBMIT);*/

        panel = new JPanel (new FlowLayout(FlowLayout.CENTER));
        label1 = new JLabel();
        label1.setText("WELCOME TO XYZ BANK ATM SYSTEM");
        label1.setFont(new Font("calibri",1,22));
        label2 = new JLabel("PLEASE INPUT YOUR CREDIT CARD & ENTER PIN !");
        btn2 = new JButton("ha");
        text1 = new JPasswordField(15);
        btn1=new JButton("OK");

       

        panel.add(label1);    
        panel.add(label2);
        //panel.add(btn2);
        
        panel.add(text1);    
            
        panel.add(btn1);

        add(panel,BorderLayout.CENTER);    
        btn1.addActionListener(this); 
        //btn2.addActionListener(this);    
        setTitle("LOGIN FORM");    
    }   




    public void actionPerformed(ActionEvent ae)    {    
    	String value1=text1.getText();    
    	//String value2=text2.getText();    
    		if (value1.equals("1267")) {  

			try{
				
				fr = new FileReader("BANK ACC.txt");
				br = new BufferedReader(fr);

				String s = br.readLine();
				System.out.println(s);
				fr.close();
				int max = Integer.parseInt(s);
				int max_out = max-500;
				String fn = Integer.toString(max_out);
				
				//lbl1.setText("YOUR CURRENT BALANCE IS : "+s);
				//lbl2.setText("THANKS FOR USING OUR SERVICE !");

				NextPage page = new NextPage (); 
				
				page.setLocationRelativeTo(null);   
    				page.setVisible(true);
    				page.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);    
    				//JLabel label = new JLabel("Welcome:"+value1); 

				String word ="MAXIMUM AMOUNT OF MONEY YOU CAN AFFORD IS : "+fn ;  
    				JOptionPane.showMessageDialog(null,word);


				}catch (Exception ex) {

				}
  
    			/*NextPage page = new NextPage ();    
    			page.setVisible(true);
    			page.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);    
    			//JLabel label = new JLabel("Welcome:"+value1);    
    			JOptionPane.showMessageDialog(null,s);*/
    		        }   
 
    			else{    
    				System.out.println("enter the valid username and password");    
    		    		JOptionPane.showMessageDialog(this,"Incorrect login or password","Error",JOptionPane.ERROR_MESSAGE); 
   			}  
		}  		
	}   

    //public void actionPerformed(ActionEvent aee)    {

    //}

class LoginDemo  {    
	public static void main(String arg[])    { 

		//Login.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


		try    {    
			Login frame=new Login();    frame.setSize(400,150);  frame.setLocationRelativeTo(null);  frame.setVisible(true);    
		}    
		catch(Exception e)    {
			JOptionPane.showMessageDialog(null, e.getMessage());
		}    
	}  
} 