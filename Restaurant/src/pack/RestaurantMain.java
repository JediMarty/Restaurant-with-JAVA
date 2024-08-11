package pack;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.Dimension;
import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class RestaurantMain {
	
	public static JFrame frame = new JFrame();
	
	RestaurantMain() {
		init();
	}
	
	public void init() {
	//initialized Variables
	JPanel panel1 = new JPanel();
	JPanel panel_login = new JPanel();
	JLabel label_user = new JLabel();
	JLabel label_pass = new JLabel();
	JTextField username = new JTextField();
	JTextField password = new JTextField();
	ImageIcon img_food = new ImageIcon("food.png");
	JButton FoodIcon = new JButton();
	Font font = new Font("Calibri", Font.PLAIN , 30);
	//...............................//
	
	panel1.setBackground(Color.LIGHT_GRAY);
	panel1.setBounds(0,0,1520,100);
	
	panel_login.setBackground(Color.LIGHT_GRAY);
	panel_login.setBounds(0,110,350,550);
	label_user.setText("ИМЕ");
	label_user.setFont(new Font("Calibri", Font.BOLD, 30));
	label_user.setBounds(150, 150, 100,30);
	label_pass.setText("ПАРОЛА");
	label_pass.setFont(new Font("Calibri", Font.BOLD, 30));
	label_pass.setBounds(120, 355, 110,30);
	
	username.setBounds(70, 190, 220, 50); 
	username.setFont(font);
	password.setBounds(70, 400, 220, 50);
	password.setFont(font);
    
	FoodIcon.setIcon(img_food);
	FoodIcon.setBorderPainted(false);
	FoodIcon.setBounds(330, 10, 70, 70);
	FoodIcon.setContentAreaFilled(false);
	FoodIcon.setFocusPainted(false);
	FoodIcon.setOpaque(false);
	FoodIcon.setCursor(new Cursor(Cursor.HAND_CURSOR));
	
	//The Window
    frame.setTitle("Table Reserved");
    frame.setSize(1520,1040);
	frame.setResizable(false);
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);    
	frame.setLayout(null);
	frame.getContentPane().setBackground(Color.WHITE);
	frame.add(FoodIcon);
	frame.add(panel1);
	frame.add(label_user);
	frame.add(label_pass);
	frame.add(username);
	frame.add((password));
	frame.add(panel_login);
    frame.setVisible(true);
	
	}
	
}

