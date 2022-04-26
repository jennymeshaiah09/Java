package sola;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class MyFrame extends JFrame implements ActionListener {
	
	private static final long serialVersionUID = 1L;
	private Container c;
	private JLabel title;
	private JLabel name;
	private JTextField tname;
	private JLabel mno;
	private JTextField tmno;
	private JLabel ano;
	private JTextField tano;
	private JLabel gender;
	private JRadioButton male;
	private JRadioButton female;
	private ButtonGroup gengp;
	private JLabel dob;
	private JComboBox<?> date;
	private JComboBox<?> month;
	private JComboBox<?> year;
	private JLabel vaccine;
	private JComboBox<?> vac;
	private JLabel add;
	private JTextArea tadd;
	private JCheckBox term;
	private JCheckBox con;
	private JButton sub;
	private JButton reset;
	private JTextArea tout;
	private JLabel res;
	private JTextArea resadd;

	private String dates[]	= { "1", "2", "3", "4", "5","6", "7", "8", "9", "10","11", "12", "13", "14", "15","16", "17", "18", "19", "20",
			"21", "22", "23", "24", "25",
			"26", "27", "28", "29", "30",
			"31" };
	private String months[]= { "Jan", "feb", "Mar", "Apr",
			"May", "Jun", "July", "Aug",
			"Sup", "Oct", "Nov", "Dec" };
	
	private String years[]= { "1983", "1984", "1985","1986",
			"1987", "1988", "1989", "1990",
			"1991", "1992", "1994", "1993",
			"1994","1995", "1996", "1997", "1998",
			"1999", "2000", "2001", "2002",
			"2003" };
	private String vacc[]= {"CoviShield","Covaxin","Sputnik V","Nova Vax","Moderna","pfizer"};

	public MyFrame()
	{
		JFrame frame  = new JFrame("Register");
		frame.setBackground(Color.black);
		setTitle("Registration Form");
		setBounds(500, 120, 1000, 800);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setResizable(false);

		c = getContentPane();
		c.setLayout(null);

		title = new JLabel("Covid Vaccine Registration Form");
		title.setFont(new Font("Arial", Font.PLAIN, 30));
		title.setSize(300, 50);
		title.setLocation(250, 30);
		c.add(title);

		name = new JLabel("Name");
		name.setFont(new Font("Arial", Font.PLAIN, 20));
		name.setSize(100, 20);
		name.setLocation(100, 100);
		c.add(name);

		tname = new JTextField();
		tname.setFont(new Font("Arial", Font.PLAIN, 15));
		tname.setSize(190, 20);
		tname.setLocation(200, 100);
		c.add(tname);

		mno = new JLabel("Mobile");
		mno.setFont(new Font("Arial", Font.PLAIN, 20));
		mno.setSize(100, 20);
		mno.setLocation(100, 150);
		c.add(mno);

		tmno = new JTextField();
		tmno.setFont(new Font("Arial", Font.PLAIN, 15));
		tmno.setSize(150, 20);
		tmno.setLocation(200, 150);
		c.add(tmno);
		
		ano = new JLabel("Aadhar Number");
		ano.setFont(new Font("Arial", Font.PLAIN, 20));
		ano.setSize(100, 20);
		ano.setLocation(100, 200);
		c.add(ano);	
		
		tano = new JTextField();
		tano.setFont(new Font("Arial", Font.PLAIN, 15));
		tano.setSize(150, 20);
		tano.setLocation(200, 200);
		c.add(tano);
		
		gender = new JLabel("Gender");
		gender.setFont(new Font("Arial", Font.PLAIN, 20));
		gender.setSize(100, 20);
		gender.setLocation(100, 250);
		c.add(gender);

		male = new JRadioButton("Male");
		male.setFont(new Font("Arial", Font.PLAIN, 15));
		male.setSelected(true);
		male.setSize(75, 20);
		male.setLocation(200, 250);
		c.add(male);

		female = new JRadioButton("Female");
		female.setFont(new Font("Arial", Font.PLAIN, 15));
		female.setSelected(false);
		female.setSize(80, 20);
		female.setLocation(275, 250);
		c.add(female);

		gengp = new ButtonGroup();
		gengp.add(male);
		gengp.add(female);

		dob = new JLabel("DOB");
		dob.setFont(new Font("Arial", Font.PLAIN, 20));
		dob.setSize(100, 20);
		dob.setLocation(100, 300);
		c.add(dob);

		date = new JComboBox<Object>(dates);
		date.setFont(new Font("Arial", Font.PLAIN, 15));
		date.setSize(50, 20);
		date.setLocation(200, 300);
		c.add(date);

		month = new JComboBox<Object>(months);
		month.setFont(new Font("Arial", Font.PLAIN, 15));
		month.setSize(60, 20);
		month.setLocation(250, 300);
		c.add(month);

		year = new JComboBox<Object>(years);
		year.setFont(new Font("Arial", Font.PLAIN, 15));
		year.setSize(60, 20);
		year.setLocation(320, 300);
		c.add(year);
		
		vaccine = new JLabel("Vaccine");
		vaccine.setFont(new Font("Arial", Font.PLAIN, 20));
		vaccine.setSize(100, 20);
		vaccine.setLocation(100, 350);
		c.add(vaccine);
		
		vac = new JComboBox<Object>(vacc);
		vac.setFont(new Font("Arial", Font.PLAIN, 15));
		vac.setSize(100, 20);
		vac.setLocation(200, 350);
		c.add(vac);
		
		add = new JLabel("Address");
		add.setFont(new Font("Arial", Font.PLAIN, 20));
		add.setSize(100, 20);
		add.setLocation(100, 400);
		c.add(add);

		tadd = new JTextArea();
		tadd.setFont(new Font("Arial", Font.PLAIN, 15));
		tadd.setSize(200, 75);
		tadd.setLocation(200, 400);
		tadd.setLineWrap(true);
		c.add(tadd);

		sub = new JButton("Submit");
		sub.setFont(new Font("Arial", Font.PLAIN, 15));
		sub.setSize(100, 20);
		sub.setLocation(150, 600);
		sub.addActionListener(this);
		c.add(sub);

		reset = new JButton("Reset");
		reset.setFont(new Font("Arial", Font.PLAIN, 15));
		reset.setSize(100, 20);
		reset.setLocation(270, 600);
		reset.addActionListener(this);
		c.add(reset);

		tout = new JTextArea();
		tout.setFont(new Font("Arial", Font.PLAIN, 15));
		tout.setSize(300, 400);
		tout.setLocation(500, 100);
		tout.setLineWrap(true);
		tout.setEditable(false);
		c.add(tout);

		res = new JLabel("");
		res.setFont(new Font("Arial", Font.PLAIN, 20));
		res.setSize(500, 25);
		res.setLocation(100, 500);
		c.add(res);

		resadd = new JTextArea();
		resadd.setFont(new Font("Arial", Font.PLAIN, 15));
		resadd.setSize(200, 75);
		resadd.setLocation(580, 175);
		resadd.setLineWrap(true);
		c.add(resadd);
		
		 term = new JCheckBox("Accept Terms And Conditions.");
	     term.setFont(new Font("Arial", Font.PLAIN, 15));
         term.setSize(250, 20);
         term.setLocation(100,495);
	     c.add(term);
	     term.addActionListener(this);
	     c.add(term);
	     con = new JCheckBox("Accept if you are 18 or above.");
	     con.setFont(new Font("Arial", Font.PLAIN, 15));
         con.setSize(250, 20);
         con.setLocation(100,535);
	     c.add(con);
	     con.addActionListener(this);
	     c.add(con);
	     c.setLayout(null);
	     setVisible(true);
	}

	public void actionPerformed(ActionEvent e)
	{
		if (e.getSource() == sub) {
			if (term.isSelected()&&con.isSelected()) {
				String data1;
				String data= "Name : "+ tname.getText() + "\n"+ "Mobile : "+ tmno.getText() + "\n";
				String data5="Aadhar :"+tano.getText();
				if (male.isSelected())
					data1 = "Gender : Male"+ "\n";
				else
					data1 = "Gender : Female"+ "\n";
				String data2= "DOB : "+ (String)date.getSelectedItem()+ "/" + (String)month.getSelectedItem()+"/" + (String)year.getSelectedItem()+ "\n";
				String data3="Vaccine"+(String)vac.getSelectedItem();
				String data4 = "Address : " + tadd.getText();
				tout.setText(data + data5+ data1 + data2 +data3+ data4);
				tout.setEditable(false);
			}
			else {
				tout.setText("");
				resadd.setText("");
				term.setAction(null);
			}
		}
			
		else if (e.getSource() == reset) {
			String def = "";
			tname.setText(def);
			tadd.setText(def);
			tmno.setText(def);
			tano.setText(def);
			res.setText(def);
			tout.setText(def);
			term.setSelected(false);
			date.setSelectedIndex(0);
			month.setSelectedIndex(0);
			year.setSelectedIndex(0);
			vac.setSelectedIndex(0);
			resadd.setText(def);
		}
	}
}

// Driver Code
class Registration {

	public static void main(String[] args) throws Exception
	{
		new MyFrame();
	}
}
