package com.greedy.user;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class StartPage extends JFrame {
	
	private JFrame mf = new JFrame();
	
	public StartPage() {
		
		Font labelFont = new Font("DungGeunMo", Font.PLAIN, 25);
		
		
		this.mf = this;
		mf.setSize(700, 790);
		mf.setLocationRelativeTo(null);
//		mf.setResizable(false);
		
		mf.setTitle("진격의 DRAGON");
		
		JPanel panel1 = new JPanel();
		
		panel1.setLayout(null);
		
		ImageIcon icon1 = new ImageIcon("images/startpage1.png");
		Image icon2 = new ImageIcon("images/dragon1.png").getImage().getScaledInstance(100, 100, 0);
		Image icon3 = new ImageIcon("images/dragon2.png").getImage().getScaledInstance(100, 100, 0);
		Image icon4 = new ImageIcon("images/dragon3.png").getImage().getScaledInstance(100, 100, 0);
		
		JLabel label1 = new JLabel(icon1);
		label1.setSize(700, 760);
		
		label1.setLayout(null);
		
		JLabel label2 = new JLabel();
		label2.setIcon(new ImageIcon(icon2));
		label2.setSize(100, 100);
		label2.setLocation(100, 400);
		
		JLabel label3 = new JLabel();
		label3.setIcon(new ImageIcon(icon3));
		label3.setSize(100, 100);
		label3.setLocation(300, 400);
		
		JLabel label4 = new JLabel();
		label4.setIcon(new ImageIcon(icon4));
		label4.setSize(100, 100);
		label4.setLocation(500, 400);
//		JLabel label3 = new JLabel(new ImageIcon(icon3));
//		JLabel label4 = new JLabel(new ImageIcon(icon4));
		

		
		RoundedButton button = new RoundedButton("GAME START");
//		button.setBorderPainted(false); //외곽선 없애기
//		button.setContentAreaFilled(false); //내용영역 채우기 안함?
//		button.setFocusPainted(false);
		
		button.setFont(labelFont);
		button.setSize(400, 50);
		button.setLocation(155, 550);
		
		button.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {

//	            mf.dispose();
//	            new Application();
				
			}
		});
		panel1.add(button);
		
		panel1.add(label4);
		panel1.add(label3);
		panel1.add(label2);
		panel1.add(label1);
		
		mf.add(panel1);
	
		
		mf.setVisible(true);
		mf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		



//		mf.setLayout(null);
//		contentPane.setLayout(null);


	}
	
}
