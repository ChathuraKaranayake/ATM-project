import java.awt.*;
import java.awt.event.ActionEvent;
import javax.swing.*;
import java.awt.event.ActionListener;
import java.io.*;

public class BALANCE_Frame extends JDialog {

	private JLabel lbl1;
	private JLabel lbl2;
	private JButton btn1;

	private FileReader fr;
	private BufferedReader br;

	public  BALANCE_Frame (JFrame frame){
		
		super(frame,"DEPOSIT WINDOW",true);
		setLayout (new FlowLayout ());
		
		//lbl1 = new JLabel("YOUR BALANCE ENQURY IS : ");
		lbl1 = new JLabel(" ");
		add(lbl1);
		
		
		lbl2 = new JLabel(" ");
		add(lbl2);

		btn1 = new JButton("EXIT");
		add(btn1);
		
			try{
				
				fr = new FileReader("BANK ACC.txt");
				br = new BufferedReader(fr);

				String s = br.readLine();
				System.out.println(s);
				fr.close();

				lbl1.setText("YOUR CURRENT BALANCE IS : "+s);
				lbl2.setText("THANKS FOR USING OUR SERVICE !");

			}catch (Exception ex) {

			}

		event e = new event();
		btn1.addActionListener(e);
	}

	public class event implements ActionListener {
		public void actionPerformed(ActionEvent e){
			System.exit(0);

		}
	}
}