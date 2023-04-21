import javax.swing.*; 
import java.awt.*;
import java.awt.event.*;   
class NextPage extends JFrame  { 

	JMenuBar menubar;
	JMenu T;
	JMenuItem C,D,B,E;
	private ImageIcon image1;
	private JLabel label1;

	NextPage()   {

		setLayout (new FlowLayout ());

		menubar = new JMenuBar();
		add(menubar);

		T = new JMenu("TRANSACTION OPTION");
		menubar.add(T);

		C = new JMenuItem("CASH WITHDRAWA");
		T.add(C);

		D = new JMenuItem("DEPOSIT");
		T.add(D);



		B = new JMenuItem("BALANCE ENQURY");
		T.add(B);

		E = new JMenuItem("EXIT");
		T.add(E);
		
		setJMenuBar(menubar);

		image1 = new ImageIcon(getClass().getResource("ATM-system-548x364.jpg"));
			label1 = new JLabel(image1);
			add(label1);


		event1 e1 = new  event1();
		C.addActionListener(e1);

		event2 e2 = new  event2();
		D.addActionListener(e2);
		
		event3 e3 = new  event3();
		B.addActionListener(e3);

		event4 e4 = new  event4();
		E.addActionListener(e4);


	   setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
	   setTitle("Welcome");   
	   setSize(820, 520);    
	} 

	public class event1 implements ActionListener {
		public void actionPerformed(ActionEvent e1){
			withdrawal_Frame gui = new withdrawal_Frame(NextPage.this);
			
			gui.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
			//gui.setTitle("HELP WINDOW");
			gui.setSize(375,150);
			gui.setLocationRelativeTo(null);
			gui.setVisible(true);
		}
	}

	public class event2 implements ActionListener {
		public void actionPerformed(ActionEvent e2){
			deposit_Frame gui =new deposit_Frame(NextPage.this);
			
			gui.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
			//gui.setTitle("HELP WINDOW");
			gui.setSize(370,150);
			gui.setLocationRelativeTo(null);
			gui.setVisible(true);

		}
	}

	public class event3 implements ActionListener {
		public void actionPerformed(ActionEvent e3){
			BALANCE_Frame gui =new BALANCE_Frame(NextPage.this);
			
			gui.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
			gui.setTitle("BALANCE WINDOW");
			gui.setSize(250,150);
			gui.setLocationRelativeTo(null);
			gui.setVisible(true);

		}
	}


	public class event4 implements ActionListener {
		public void actionPerformed(ActionEvent e4){
			System.exit(0);

		}
	}
  
} 