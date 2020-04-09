
/*
 Mostis Andrei
 Lab10 Ex1
 
 	1. Creați o aplicație ce preia din două câmpuri text (TextField)
  	numele vostru și grupa din care faceți parte și afișează această
   	informație într-o etichetă de culoare RGB (122,123,129).
 */

import javax.swing.*;

import java.awt.Color;

import java.awt.event.*;

public class Texte implements ActionListener {
	
	JTextField tf1, tf2;
	
	JLabel nume = new JLabel();
	JLabel grupa = new JLabel();
	JLabel info = new JLabel();
	JLabel intro = new JLabel();
	//JLabel buton=new JLabel();
	
	JButton b1;

	Texte() {
		
		JFrame f = new JFrame();
		
		tf1 = new JTextField("Nume si prenume");
		tf1.setBounds(50, 50, 150, 20);
		
		tf2 = new JTextField("Grupa");
		tf2.setBounds(50, 75, 150, 20);
		
		nume.setBounds(50, 100, 150, 20);
		grupa.setBounds(50,125,150,20);
		
		
		intro.setBounds(50,20,200,20);
		intro.setText("Introduceti numele si grupa!");

		b1 = new JButton("Confirmare!");
		b1.setBounds(50, 200, 125, 50);
		
		b1.addActionListener(this);
		
		f.add(tf1);
		f.add(tf2);
		f.add(b1);
		f.add(nume);
		f.add(grupa);
		f.add(intro);
		f.setSize(300, 300);
		f.setLayout(null);
		f.setVisible(true);
	}

	public void actionPerformed(ActionEvent e) {
		
		String EtichetaNume = null;
		String EtichetaGrupa=null;
		
		String s1 = tf1.getText();
		String s2 = tf2.getText();
		
		EtichetaNume = "Nume: "+s1;
		
		nume.setForeground(new Color(122,123,129));
		nume.setText(EtichetaNume);
		
		EtichetaGrupa="Grupa: "+s2;
		
		grupa.setForeground(new Color(122,123,129));
		grupa.setText(EtichetaGrupa);
		
	}

	public static void main(String[] args) {
		new Texte();
	}
}