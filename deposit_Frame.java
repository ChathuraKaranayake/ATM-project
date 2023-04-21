import java.awt.*;
import java.awt.event.ActionEvent;
import javax.swing.*;
import java.awt.event.ActionListener;
import java.io.*;


public class deposit_Frame extends JDialog {

	private JLabel lbl1;
	private JTextField txt1;

	private JButton btn1;
	private JButton btn2;
	private JButton btn3;

	private JLabel lbl2;
	private JPanel pnl1;

	private FileReader fr;
	private BufferedReader br;
	private JLabel lbl3;

	private int m=500;


	public  deposit_Frame (JFrame frame){

		super(frame,"DEPOSIT WINDOW",true);

		//setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout (new FlowLayout ());

		// Display --> Deposit Text
		
		lbl1 = new JLabel("ENTER AMOUNT YOU WANT TO DEPOSIT");
		add(lbl1);
		

		// Display --> Amount TextArea
		txt1 = new JTextField(10);
		add(txt1);
	
		// Display --> Deposit,Back,Exit Buttons
		btn1 = new JButton("DEPOSIT");
		add(btn1);
		//btn2 = new JButton("BACK");
		//add(btn2);
		btn3 = new JButton("EXIT");
		add(btn3);



		lbl2 = new JLabel("");
		add(lbl2);

		lbl3 = new JLabel("");
		add(lbl3);

		event e = new event();
		btn1.addActionListener(e);

		event1 e1 = new event1();
		btn3.addActionListener(e1);



	}

	public class event implements ActionListener {
		public void actionPerformed(ActionEvent e){
			
			try{
				m=500;
				String input = txt1.getText();
				int in1 = Integer.parseInt(input);
				fr = new FileReader("BANK ACC.txt");
				br = new BufferedReader(fr);

				String s = br.readLine();
				System.out.println(s);
				fr.close();
				int m = Integer.parseInt(s);

				int Amount = m+in1;
				String fn = Integer.toString(Amount);

				String word = txt1.getText();
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