package day3;

import javax.swing.JOptionPane;

import jdk.nashorn.internal.scripts.JO;

public class Snopper {
public static void main(String[] args) {   
	String address = JOptionPane.showInputDialog("What is your address?");
	String phoneNumber = JOptionPane.showInputDialog("What is your phone number");
	String Insta = JOptionPane.showInputDialog("What is your instagram username  and password. I will follow.");
	JOptionPane.showMessageDialog(null, "Your SO STUPID! I SHALL TAKE OVER YOUR LIFE WITh YOUR "+ Insta + phoneNumber + address);
}
}
