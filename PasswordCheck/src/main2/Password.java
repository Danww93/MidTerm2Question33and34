package main2;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Arrays;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JButton;

public class Password implements ActionListener{

	private JFrame frame;
	private JPasswordField passwordField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Password window = new Password();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Password() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		
		
		JLabel lblEnterThePassword = new JLabel("Enter the password:");
		lblEnterThePassword.setBounds(37, 102, 119, 14);
		frame.getContentPane().add(lblEnterThePassword);
		
		passwordField = new JPasswordField(10);
		passwordField.setBounds(166, 99, 135, 20);
		frame.getContentPane().add(passwordField);
		
		
		
		JButton btnOk = new JButton("Ok");
		btnOk.setBounds(311, 84, 89, 23);
		frame.getContentPane().add(btnOk);
		
		JButton btnHelp = new JButton("Help");
		btnHelp.setBounds(311, 109, 89, 23);
		frame.getContentPane().add(btnHelp);
		
		btnOk.addActionListener(this); 
		btnOk.setActionCommand("Ok");
		
		
		
	}
	public void actionPerformed(ActionEvent e)
	{
	    String cmd = e.getActionCommand();
	    char[] correctPassword = { 'b', 'u', 'g', 'a', 'b', 'o', 'o' };
	    

	    if ("Ok".equals(cmd)) {
	    	char[] input = passwordField.getPassword();
	        if (Arrays.equals(input, correctPassword)) 
	        { 
	        	JOptionPane.showMessageDialog(frame,"Success! You typed the right password.");
	        } else {
	            JOptionPane.showMessageDialog(frame,"Invalid password. Try again.", "Error Message", JOptionPane.ERROR_MESSAGE);
	        }
	        
	        }}; 
	
}
