import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class donorPage implements ActionListener{

	JFrame frame = new JFrame();
	JButton backButton = new JButton();
	ImageIcon image = new ImageIcon("company_logo.png");
	ImageIcon logo = new ImageIcon("hygieia_logo.png");
	JTextField firstNameField = new JTextField();
	JTextField lastNameField = new JTextField();
	JTextField middleNameField = new JTextField();
	JTextField age = new JTextField();
	JTextField sex = new JTextField();
	JTextField address = new JTextField();
	JTextField contact_num = new JTextField();
	JComboBox vID = new JComboBox();
	JLabel firstnameLabel = new JLabel("First name:");
	JLabel lastnameLabel = new JLabel("Surname:");
	JLabel middlenameLabel = new JLabel("Middle Name:");
	JLabel age_text = new JLabel("Age:");
	JLabel sex_text = new JLabel("Sex");
	JLabel add = new JLabel("Address:");
	JLabel contact = new JLabel("Contact number:");
	JLabel ID = new JLabel("Valid ID:");
	
	donorPage(){
		
		firstnameLabel.setBounds(100, 145, 250, 35);
		firstnameLabel.setFont(new Font(null, Font.PLAIN, 15));
		firstNameField.setBounds(222, 150, 200, 25);
		
		lastnameLabel.setBounds(100, 175, 250, 35);
		lastnameLabel.setFont(new Font(null, Font.PLAIN, 15));
		lastNameField.setBounds(222, 180, 200, 25);
		
		middlenameLabel.setBounds(100, 205, 250, 35);
		middlenameLabel.setFont(new Font(null, Font.PLAIN, 15));
		middleNameField.setBounds(222, 210, 200, 25);
		
		age_text.setBounds(100, 235, 250, 35);
		age_text.setFont(new Font(null, Font.PLAIN, 15));
		age.setBounds(222, 240, 200, 25);
		
		frame.add(age_text);
		frame.add(age);
		frame.add(middleNameField);
		frame.add(lastNameField);
		frame.add(firstNameField);
		frame.add(firstnameLabel);
		frame.add(lastnameLabel);
		frame.add(middlenameLabel);
		frame.add(backButton);
		frame.setIconImage(image.getImage());
		frame.getContentPane().setBackground(new Color(0xE7DECC));
		frame.setTitle("Hygieia Blood Foundation");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(1370, 749);
		frame.setResizable(false);
		frame.setLayout(null);
		frame.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == backButton) {
			frame.dispose();
			HomePage homepage = new HomePage(null); 
		}
		
	}
	
}
