import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.GridLayout;

import javax.swing.AbstractButton;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import java.awt.Color;
import javax.swing.border.LineBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.border.BevelBorder;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Tabla extends JFrame {

	private JPanel contentPane;
	private JFrame frame;
	private String pocetakIgre = "X";
	private int xRacuranje = 0;
	private int oRacuranje = 0;
	private JButton dugme1 = new JButton("");
	private JButton dugme2 = new JButton("");
	private JButton dugme3 = new JButton("");
	private JButton dugme4 = new JButton("");
	private JButton dugme5 = new JButton("");
	private JButton dugme6 = new JButton("");
	private JButton dugme7 = new JButton("");
	private JButton dugme8 = new JButton("");
	private JButton dugme9 = new JButton("");
	private JLabel jIgracX = new JLabel("");
	private JLabel jIgracO = new JLabel("");
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Tabla frame = new Tabla();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	public void RezultatIgre() {
		jIgracX.setText(String.valueOf(xRacuranje));
		jIgracO.setText(String.valueOf(oRacuranje));
				
	}
	
	public void ugasiDugmice(Boolean stanje) {
		dugme1.setEnabled(stanje);
		dugme2.setEnabled(stanje);
		dugme3.setEnabled(stanje);
		
		dugme4.setEnabled(stanje);
		dugme5.setEnabled(stanje);
		dugme6.setEnabled(stanje);
		
		dugme7.setEnabled(stanje);
		dugme8.setEnabled(stanje);
		dugme9.setEnabled(stanje);
	}

	public void PobednikIgre() {
		String d1 = dugme1.getText();
		String d2 = dugme2.getText();
		String d3 = dugme3.getText();
		
		String d4 = dugme4.getText();
		String d5 = dugme5.getText();
		String d6 = dugme6.getText();
		
		String d7 = dugme7.getText();
		String d8 = dugme8.getText();
		String d9 = dugme9.getText();
		
		if (d1 ==("X") && d2==("X") && d3 ==("X") ) 
		{
			JOptionPane.showMessageDialog(this, "Igrac X je pobedio!", "XO Igra", JOptionPane.INFORMATION_MESSAGE);
			xRacuranje++;
			RezultatIgre(); 
			ugasiDugmice(false);
			dugme1.setBackground(Color.YELLOW);
			dugme2.setBackground(Color.YELLOW);
			dugme3.setBackground(Color.YELLOW);
			
		}
		
		if (d4 ==("X") && d5==("X") && d6 ==("X") ) 
		{
			JOptionPane.showMessageDialog(this, "Igrac X je pobedio!", "XO Igra", JOptionPane.INFORMATION_MESSAGE);
			xRacuranje++;
			RezultatIgre(); 
			ugasiDugmice(false);
			dugme4.setBackground(Color.CYAN);
			dugme5.setBackground(Color.CYAN);
			dugme6.setBackground(Color.CYAN);
		}
		
		if (d7 ==("X") && d8==("X") && d9 ==("X") ) 
		{
			JOptionPane.showMessageDialog(this, "Igrac X je pobedio!", "XO Igra", JOptionPane.INFORMATION_MESSAGE);
			xRacuranje++;
			RezultatIgre(); 
			ugasiDugmice(false);
			dugme7.setBackground(Color.CYAN);
			dugme8.setBackground(Color.CYAN);
			dugme9.setBackground(Color.CYAN);
		}
		
		if (d1 ==("X") && d4==("X") && d7 ==("X") ) 
		{
			JOptionPane.showMessageDialog(this, "Igrac X je pobedio!", "XO Igra", JOptionPane.INFORMATION_MESSAGE);
			xRacuranje++;
			RezultatIgre(); 
			ugasiDugmice(false);
			dugme1.setBackground(Color.MAGENTA);
			dugme4.setBackground(Color.MAGENTA);
			dugme7.setBackground(Color.MAGENTA);
		}
		
		if (d2 ==("X") && d5==("X") && d8 ==("X") ) 
		{
			JOptionPane.showMessageDialog(this, "Igrac X je pobedio!", "XO Igra", JOptionPane.INFORMATION_MESSAGE);
			xRacuranje++;
			RezultatIgre(); 
			ugasiDugmice(false);
			dugme2.setBackground(Color.PINK);
			dugme5.setBackground(Color.PINK);
			dugme8.setBackground(Color.PINK);
		}
		
		if (d3 ==("X") && d6==("X") && d9 ==("X") ) 
		{
			JOptionPane.showMessageDialog(this, "Igrac X je pobedio!", "XO Igra", JOptionPane.INFORMATION_MESSAGE);
			xRacuranje++;
			RezultatIgre(); 
			ugasiDugmice(false);
			dugme3.setBackground(Color.MAGENTA);
			dugme6.setBackground(Color.MAGENTA);
			dugme9.setBackground(Color.MAGENTA);
		}
		
		if (d1 ==("X") && d5==("X") && d9 ==("X") ) 
		{
			JOptionPane.showMessageDialog(this, "Igrac X je pobedio!", "XO Igra", JOptionPane.INFORMATION_MESSAGE);
			xRacuranje++;
			RezultatIgre(); 
			ugasiDugmice(false);
			dugme1.setBackground(Color.CYAN);
			dugme5.setBackground(Color.CYAN);
			dugme9.setBackground(Color.CYAN);
		}
		
		if (d3 ==("X") && d5==("X") && d7 ==("X") ) 
		{
			JOptionPane.showMessageDialog(this, "Igrac X je pobedio!", "XO Igra", JOptionPane.INFORMATION_MESSAGE);
			xRacuranje++;
			RezultatIgre(); 
			ugasiDugmice(false);
			dugme3.setBackground(Color.CYAN);
			dugme5.setBackground(Color.CYAN);
			dugme7.setBackground(Color.CYAN);
		}
		
		if (d1==("O") && d2 == ("O") && d3 == ("O"))
        {
            JOptionPane.showMessageDialog(this,"Igrac O je pobedio", "XO Igra",JOptionPane.INFORMATION_MESSAGE);
            oRacuranje++;
			RezultatIgre(); 
			ugasiDugmice(false);
			dugme1.setBackground(Color.PINK);
			dugme2.setBackground(Color.PINK);
			dugme3.setBackground(Color.PINK);
        }
        
        if (d4==("O") && d5 == ("O") && d6 == ("O"))
        {
            JOptionPane.showMessageDialog(this,"Igrac O je pobedio", "XO Igra",JOptionPane.INFORMATION_MESSAGE);
            oRacuranje++;
			RezultatIgre(); 
			ugasiDugmice(false);
            dugme4.setBackground(Color.YELLOW);
            dugme5.setBackground(Color.YELLOW);
            dugme6.setBackground(Color.YELLOW);
        }
        
        if (d7==("O") && d8 == ("O") && d9 == ("O"))
        {
            JOptionPane.showMessageDialog(this,"Igrac O je pobedio", "XO Igra",JOptionPane.INFORMATION_MESSAGE);
            oRacuranje++;
			RezultatIgre(); 
			ugasiDugmice(false);
			dugme7.setBackground(Color.MAGENTA);
			dugme8.setBackground(Color.MAGENTA);
			dugme9.setBackground(Color.MAGENTA);
        }
        
        if (d1==("O") && d4 == ("O") && d7 == ("O"))
        {
            JOptionPane.showMessageDialog(this,"Igrac O je pobedio", "XO Igra",JOptionPane.INFORMATION_MESSAGE);
            oRacuranje++;
			RezultatIgre(); 
			ugasiDugmice(false);
			dugme1.setBackground(Color.MAGENTA);
			dugme4.setBackground(Color.MAGENTA);
			dugme7.setBackground(Color.MAGENTA);
        }
        
        if (d2==("O") && d5 == ("O") && d8 == ("O"))
        {
            JOptionPane.showMessageDialog(this,"Igrac O je pobedio", "XO Igra",JOptionPane.INFORMATION_MESSAGE);
            oRacuranje++;
			RezultatIgre(); 
			ugasiDugmice(false);
			dugme2.setBackground(Color.MAGENTA);
			dugme5.setBackground(Color.MAGENTA);
			dugme8.setBackground(Color.MAGENTA);
        }
        
        if (d3==("O") && d6 == ("O") && d9 == ("O"))
        {
            JOptionPane.showMessageDialog(this,"Igrac O je pobedio", "XO Igra",JOptionPane.INFORMATION_MESSAGE);
            oRacuranje++;
			RezultatIgre(); 
			ugasiDugmice(false);
			dugme3.setBackground(Color.PINK);
         	dugme6.setBackground(Color.PINK);
         	dugme9.setBackground(Color.PINK);
        }
        
        if (d1==("O") && d5 == ("O") && d9 == ("O"))
        {
            JOptionPane.showMessageDialog(this,"Igrac O je pobedio", "XO Igra",JOptionPane.INFORMATION_MESSAGE);
            oRacuranje++;
			RezultatIgre(); 
			ugasiDugmice(false);
			dugme1.setBackground(Color.PINK);
			dugme5.setBackground(Color.PINK);
			dugme9.setBackground(Color.PINK);
        }
        
        if (d3==("O") && d5 == ("O") && d7 == ("O"))
        {
            JOptionPane.showMessageDialog(this,"Igrac O je pobedio", "XO Igra",JOptionPane.INFORMATION_MESSAGE);
            oRacuranje++;
			RezultatIgre(); 
			ugasiDugmice(false);
			dugme3.setBackground(Color.PINK);
			dugme5.setBackground(Color.PINK);
			dugme7.setBackground(Color.PINK);
        }
		
	}
	
	public void IzaberiIgraca() {
		if(pocetakIgre.equalsIgnoreCase("X")) {
			pocetakIgre ="O";
		} else {
			pocetakIgre = "X";
		}
	}
	
	
	
	public Tabla() {
		setTitle("XO Igra");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 600, 700);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		
		JPanel panel = new JPanel();
		panel.setBorder(new LineBorder(new Color(0, 191, 255), 2));
		panel.setBackground(new Color(135, 206, 250));
		contentPane.add(panel, BorderLayout.CENTER);
		panel.setLayout(new BorderLayout(0, 0));
		
		JLabel lblNewLabel = new JLabel("XO Igra");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 70));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		panel.add(lblNewLabel, BorderLayout.NORTH);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(135, 206, 250));
		panel.add(panel_1, BorderLayout.SOUTH);
		
		JButton btnNewButton = new JButton("Izlaz");
		
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame = new JFrame("Izlaz");
				
				if(JOptionPane.showConfirmDialog(frame, "Da li si siguran da zelis izaci?", "XO Igra",
						JOptionPane.YES_NO_OPTION) == JOptionPane.YES_NO_OPTION); 
				{
					System.exit(0);
				}
				
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 40));
		panel_1.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Nova Igra");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ugasiDugmice(true);
				dugme1.setText(null);
				dugme2.setText(null);
				dugme3.setText(null);
				
				dugme4.setText(null);
				dugme5.setText(null);
				dugme6.setText(null);
				
				dugme7.setText(null);
				dugme8.setText(null);
				dugme9.setText(null);
				
				dugme1.setBackground(Color.WHITE);
				dugme2.setBackground(Color.WHITE);
				dugme3.setBackground(Color.WHITE);
				
				dugme4.setBackground(Color.WHITE);
				dugme5.setBackground(Color.WHITE);
				dugme6.setBackground(Color.WHITE);
				
				dugme7.setBackground(Color.WHITE);
				dugme8.setBackground(Color.WHITE);
				dugme9.setBackground(Color.WHITE);
			}
		});
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 40));
		panel_1.add(btnNewButton_1);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(new Color(0, 191, 255));
		panel.add(panel_2, BorderLayout.CENTER);
		panel_2.setLayout(new GridLayout(5, 3, 2, 2));
		
		JPanel panel_3 = new JPanel();
		panel_3.setBackground(Color.WHITE);
		panel_2.add(panel_3);
		panel_3.setLayout(new BorderLayout(0, 0));
		
		
		dugme1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				dugme1.setText(pocetakIgre);
				
				if(pocetakIgre.equalsIgnoreCase("X")) {
					dugme1.setForeground(Color.BLUE);
				} else {
					dugme1.setForeground(Color.RED);
				}
				IzaberiIgraca(); 
				PobednikIgre();
			}
			
		});
		dugme1.setFont(new Font("Tahoma", Font.BOLD, 99));
		panel_3.add(dugme1, BorderLayout.CENTER);
		
		JPanel panel_4 = new JPanel();
		panel_4.setBackground(Color.WHITE);
		panel_2.add(panel_4);
		panel_4.setLayout(new BorderLayout(0, 0));
		
		dugme2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dugme2.setText(pocetakIgre);
				
				if(pocetakIgre.equalsIgnoreCase("X")) {
					dugme2.setForeground(Color.BLUE);
				} else {
					dugme2.setForeground(Color.RED);
				}
				IzaberiIgraca();
				PobednikIgre();
			}
		});
		dugme2.setFont(new Font("Tahoma", Font.BOLD, 99));
		panel_4.add(dugme2, BorderLayout.CENTER);
		
		JPanel panel_5 = new JPanel();
		panel_5.setBackground(Color.WHITE);
		panel_2.add(panel_5);
		panel_5.setLayout(new BorderLayout(0, 0));
		
		dugme3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dugme3.setText(pocetakIgre);
				
				if(pocetakIgre.equalsIgnoreCase("X")) {
					dugme3.setForeground(Color.BLUE);
				} else {
					dugme3.setForeground(Color.RED);
				}
				IzaberiIgraca(); 
				PobednikIgre();
			}
		});
		dugme3.setFont(new Font("Tahoma", Font.BOLD, 99));
		panel_5.add(dugme3, BorderLayout.CENTER);
		
		JPanel panel_6 = new JPanel();
		panel_6.setBackground(Color.WHITE);
		panel_2.add(panel_6);
		panel_6.setLayout(new BorderLayout(0, 0));
		
		dugme4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dugme4.setText(pocetakIgre);
				
				if(pocetakIgre.equalsIgnoreCase("X")) {
					dugme4.setForeground(Color.BLUE);
				} else {
					dugme4.setForeground(Color.RED);
				}
				IzaberiIgraca(); 
				PobednikIgre();
			}
		});
		dugme4.setFont(new Font("Tahoma", Font.BOLD, 99));
		panel_6.add(dugme4, BorderLayout.CENTER);
		
		JPanel panel_7 = new JPanel();
		panel_7.setBackground(Color.WHITE);
		panel_2.add(panel_7);
		panel_7.setLayout(new BorderLayout(0, 0));
		
		dugme5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dugme5.setText(pocetakIgre);
				
				if(pocetakIgre.equalsIgnoreCase("X")) {
					dugme5.setForeground(Color.BLUE);
				} else {
					dugme5.setForeground(Color.RED);
				}
				IzaberiIgraca(); 
				PobednikIgre();
			}
		});
		dugme5.setFont(new Font("Tahoma", Font.BOLD, 99));
		panel_7.add(dugme5, BorderLayout.CENTER);
		
		JPanel panel_8 = new JPanel();
		panel_8.setBackground(Color.WHITE);
		panel_2.add(panel_8);
		panel_8.setLayout(new BorderLayout(0, 0));
		
		dugme6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dugme6.setText(pocetakIgre);
				
				if(pocetakIgre.equalsIgnoreCase("X")) {
					dugme6.setForeground(Color.BLUE);
				} else {
					dugme6.setForeground(Color.RED);
				}
				IzaberiIgraca(); 
				PobednikIgre();
			}
		});
		dugme6.setFont(new Font("Tahoma", Font.BOLD, 99));
		panel_8.add(dugme6, BorderLayout.CENTER);
		
		JPanel panel_9 = new JPanel();
		panel_9.setBackground(Color.WHITE);
		panel_2.add(panel_9);
		panel_9.setLayout(new BorderLayout(0, 0));
		
		dugme7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dugme7.setText(pocetakIgre);
				
				if(pocetakIgre.equalsIgnoreCase("X")) {
					dugme7.setForeground(Color.BLUE);
				} else {
					dugme7.setForeground(Color.RED);
				}
				IzaberiIgraca(); 
				PobednikIgre();
			}
		});
		dugme7.setFont(new Font("Tahoma", Font.BOLD, 99));
		panel_9.add(dugme7, BorderLayout.CENTER);
		
		JPanel panel_10 = new JPanel();
		panel_10.setBackground(Color.WHITE);
		panel_2.add(panel_10);
		panel_10.setLayout(new BorderLayout(0, 0));
		
		dugme8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dugme8.setText(pocetakIgre);
				
				if(pocetakIgre.equalsIgnoreCase("X")) {
					dugme8.setForeground(Color.BLUE);
				} else {
					dugme8.setForeground(Color.RED);
				}
				IzaberiIgraca(); 
				PobednikIgre();
			}
		});
		dugme8.setFont(new Font("Tahoma", Font.BOLD, 99));
		panel_10.add(dugme8, BorderLayout.CENTER);
		
		JPanel panel_11 = new JPanel();
		panel_11.setBackground(Color.WHITE);
		panel_2.add(panel_11);
		panel_11.setLayout(new BorderLayout(0, 0));
		
		dugme9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dugme9.setText(pocetakIgre);
				
				if(pocetakIgre.equalsIgnoreCase("X")) {
					dugme9.setForeground(Color.BLUE);
				} else {
					dugme9.setForeground(Color.RED);
				}
				IzaberiIgraca(); 
				PobednikIgre();
			}
		});
		dugme9.setFont(new Font("Tahoma", Font.BOLD, 99));
		panel_11.add(dugme9, BorderLayout.CENTER);
		
		JPanel panel_12 = new JPanel();
		panel_12.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panel_12.setBackground(new Color(211, 211, 211));
		panel_2.add(panel_12);
		panel_12.setLayout(new BorderLayout(0, 0));
		
		JLabel lblNewLabel_4 = new JLabel("Igrac X");
		lblNewLabel_4.setBackground(new Color(211, 211, 211));
		lblNewLabel_4.setForeground(new Color(0, 0, 255));
		lblNewLabel_4.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_4.setFont(new Font("Tahoma", Font.BOLD, 48));
		panel_12.add(lblNewLabel_4, BorderLayout.CENTER);
		
		JPanel panel_13 = new JPanel();
		panel_13.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panel_13.setBackground(new Color(211, 211, 211));
		panel_2.add(panel_13);
		panel_13.setLayout(new BorderLayout(0, 0));
		jIgracX.setBackground(new Color(211, 211, 211));
		jIgracX.setHorizontalAlignment(SwingConstants.CENTER);
		
		
		jIgracX.setFont(new Font("Tahoma", Font.BOLD, 50));
		panel_13.add(jIgracX, BorderLayout.CENTER);
		
		JPanel panel_14 = new JPanel();
		panel_14.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panel_14.setBackground(new Color(0, 0, 255));
		panel_2.add(panel_14);
		panel_14.setLayout(new BorderLayout(0, 0));
		
		JLabel lblNewLabel_6 = new JLabel("");
		lblNewLabel_6.setBackground(new Color(0, 0, 255));
		lblNewLabel_6.setFont(new Font("Tahoma", Font.BOLD, 40));
		panel_14.add(lblNewLabel_6, BorderLayout.CENTER);
		
		JPanel panel_15 = new JPanel();
		panel_15.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panel_15.setBackground(new Color(211, 211, 211));
		panel_2.add(panel_15);
		panel_15.setLayout(new BorderLayout(0, 0));
		
		JLabel lblNewLabel_7 = new JLabel("Igrac O");
		lblNewLabel_7.setBackground(new Color(211, 211, 211));
		lblNewLabel_7.setForeground(new Color(255, 0, 0));
		lblNewLabel_7.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_7.setFont(new Font("Tahoma", Font.BOLD, 48));
		panel_15.add(lblNewLabel_7, BorderLayout.CENTER);
		
		JPanel panel_16 = new JPanel();
		panel_16.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panel_16.setBackground(new Color(211, 211, 211));
		panel_2.add(panel_16);
		panel_16.setLayout(new BorderLayout(0, 0));
		jIgracO.setBackground(new Color(211, 211, 211));
		jIgracO.setHorizontalAlignment(SwingConstants.CENTER);
		
		jIgracO.setFont(new Font("Tahoma", Font.BOLD, 50));
		panel_16.add(jIgracO, BorderLayout.CENTER);
		
		JPanel panel_17 = new JPanel();
		panel_17.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panel_17.setBackground(new Color(255, 0, 0));
		panel_2.add(panel_17);
		panel_17.setLayout(new BorderLayout(0, 0));
		
		JLabel lblNewLabel_9 = new JLabel("");
		lblNewLabel_9.setBackground(new Color(255, 0, 0));
		lblNewLabel_9.setFont(new Font("Tahoma", Font.BOLD, 40));
		panel_17.add(lblNewLabel_9, BorderLayout.CENTER);
		
		
		
		
	}
	
	

}
