
import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class HomePage implements ActionListener{

	JFrame frame = new JFrame();
	JLabel homelabel = new JLabel();
	JLabel pictureLabel = new JLabel();
	ImageIcon image = new ImageIcon("company_logo.png");
	ImageIcon logo = new ImageIcon("hygieia_logo.png");
	JButton donorButton = new JButton("A Blood Donor");
	JButton patientButton = new JButton("A Patient");
	
	HomePage(String username){
		
		patientButton.setBounds(700, 500, 150, 20);
		patientButton.setFocusable(false);
		patientButton.addActionListener(this);
		
		donorButton.setBounds(540, 500, 150, 20);
		donorButton.setFocusable(false);
		donorButton.addActionListener(this);
		
		Image new_logo = logo.getImage();
		Image modifiedLogo = new_logo.getScaledInstance(750, 300, java.awt.Image.SCALE_SMOOTH);
		logo = new ImageIcon(modifiedLogo);
		pictureLabel.setBounds(300, 75, 750, 300);
		pictureLabel.setIcon(logo);
		
		homelabel.setBounds(570, 350, 250, 35);
		homelabel.setFont(new Font(null, Font.PLAIN, 25));
		homelabel.setText("Welcome, " + username);
		
		frame.add(patientButton);
		frame.add(donorButton);
		frame.getContentPane().setBackground(new Color(0xE7DECC));
		frame.setTitle("Hygieia Blood Foundation");
		frame.setIconImage(image.getImage());
		frame.add(homelabel);
		frame.add(pictureLabel);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(1370, 749);
		frame.setResizable(false);
		frame.setLayout(null);
		frame.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
	
}

