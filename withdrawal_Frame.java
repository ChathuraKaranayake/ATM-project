import java.awt.*;
import java.awt.event.ActionEvent;
import javax.swing.*;
import java.awt.event.ActionListener;
import java.io.*;


public class withdrawal_Frame extends JDialog {

	
	private JLabel lbl1;

	
	private JTextField txt1;

	
	private JButton btn1;
	private JButton btn2;
	private JButton btn3;
	private JLabel lbl2;
	private JLabel lbl3;
	private FileReader fr;
	private BufferedReader br;

	private JLabel lbl4;
	private JLabel lbl5;
	private JButton btn4;

	private FileReader fr1;
	private BufferedReader br1;

	private int m;

	public  withdrawal_Frame(JFrame frame){

		super(frame,"WITHDROWAL WINDOW",true);

		setLayout (new FlowLayout ());

		lbl1 = new JLabel("PLEASE ENTER YOUR AMOUNT");
		add(lbl1);
		
		txt1 = new JTextField(10);
		add(txt1);
				

		btn1 = new JButton("Withdrawal");
		add(btn1);
		//btn2 = new JButton("BACK");
		//add(btn2);
		btn3 = new JButton("EXIT");
		add(btn3);

		lbl2 = new JLabel("");
		add(lbl2);

		lbl3 = new JLabel("");
		add(lbl3);

		
		/*try{
				
				fr1 = new FileReader("BANK ACC.txt");
				br1 = new BufferedReader(fr1);

				String s1 = br.readLine();
				System.out.println(s1);
				fr1.close();

				lbl4.setText("YOUR CURRENT BALANCE IS 2: "+s1);
				

			}catch (Exception ex) {

			}*/
			
		lbl4 = new JLabel("");
		add(lbl4);


		event e = new event();
		btn1.addActionListener(e);

		event1 e1 = new event1();
		btn3.addActionListener(e1);

		//System.out.println("THANKS FOR USING OUR SERVICE !");
		
	}

	public class event implements ActionListener {
		public void actionPerformed(ActionEvent e){
			
			try{
				//m=7000;
				String input = txt1.getText();
				int in1 = Integer.parseInt(input);
				fr = new FileReader("BANK ACC.txt");
				br = new BufferedReader(fr);

				String s = br.readLine();
				System.out.println(s);
				fr.close();
				int m = Integer.parseInt(s);

				int Amount;
					if(m>in1){ 
						Amount = m-in1;
					}
					else{	int getAmount = m-500;
						String fn = Integer.toString(getAmount);

						
						System.out.println("money is not enf");
						//THE MAXIMUM AMIUNT YOU CAN TAKE IS 8888 RUPEES
						String word = "THE MAXIMUM AMIUNT YOU CAN TAKE IS  : " +fn +"  RUPEES";
						//JOptionPane.showMessageDialog(this,"THE MAXIMUM AMIUNT YOU CAN TAKE IS RUPEES","Error",JOptionPane.ERROR_MESSAGE);
						JOptionPane.showMessageDialog(null,word);
 						Amount =m;
					}

				//int Amount = m-in1;
				String fn = Integer.toString(Amount);

				//int n = 6;
				//if(n>5){System.out.println("ABCD");}

				//String word = txt1.getText();
				FileWriter stream =new  FileWriter("BANK ACC.txt");
				BufferedWriter out = new BufferedWriter(stream);
				out.write(fn);
				out.close();

				lbl2.setText("YOUR CURRENT BALANCE IS : "+fn);
				lbl3.setText("THANKS FOR USING OUR SERVICE !");

			}catch (Exception ex) {

			}

		}
	}

	public class event1 implements ActionListener {
		public void actionPerformed(ActionEvent e1){
			System.exit(0);

		}
	}	
}
