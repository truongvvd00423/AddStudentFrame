/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package swingtutorial;

import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author vuvan
 */
public class AddStudentFrame {

    public static void main(String[] args) {
        JFrame addFrame = new JFrame("Add Student");
        addFrame.setSize(1000, 800);
        addFrame.setLocationRelativeTo(null);
        
        
        JPanel addPanel = new JPanel();
 //       addPanel.setSize(800, 500);
        addPanel.setLayout(null); 
        addPanel.setBackground(Color.lightGray);
        addPanel.setBounds(70, 50, 600, 500);
        
                

        //ID:    
        JLabel lblId = new JLabel("ID: ");
        lblId.setBounds(100, 60, 100, 30);
        JTextField txtId = new JTextField();
        txtId.setBounds(180, 60, 200, 30);

        //Name: 
        JLabel lblName = new JLabel("Name: ");
        lblName.setBounds(100, 100, 100, 30);
        JTextField txtName = new JTextField();
        txtName.setBounds(180, 100, 200, 30);

        //Email:
        JLabel lblEmail = new JLabel("Email: ");
        lblEmail.setBounds(100, 140, 100, 30);
        JTextField txtEmail = new JTextField();
        txtEmail.setBounds(180, 140, 200, 30);

        //Phone:
        JLabel lblPhone = new JLabel("Phone: ");
        lblPhone.setBounds(100, 180, 100, 30);
        JTextField txtPhone = new JTextField();
        txtPhone.setBounds(180, 180, 200, 30);

        //RollNumber:
        JLabel lblRollNumber = new JLabel("Roll Number: ");
        lblRollNumber.setBounds(100, 220, 100, 30);
        JTextField txtRollNumber = new JTextField();
        txtRollNumber.setBounds(180, 220, 200, 30);

        //ClassName:
        JLabel lblClassName = new JLabel("Class Name: ");
        lblClassName.setBounds(100, 260, 100, 30);
        JTextField txtClassName = new JTextField();
        txtClassName.setBounds(180, 260, 200, 30);

        //Status:
        JLabel lblStatus = new JLabel("Status: ");
        lblStatus.setBounds(100, 300, 100, 30);
        JTextField txtStatus = new JTextField();
        txtStatus.setBounds(180, 300, 200, 30);
        
        //Submit:
        JButton btnSubmit = new JButton("Submit");
        btnSubmit.setBounds(300, 350, 80, 30);
        
        

        addPanel.add(lblId);
        addPanel.add(txtId);
        addPanel.add(lblName);
        addPanel.add(txtName);
        addPanel.add(lblEmail);
        addPanel.add(txtEmail);
        addPanel.add(lblPhone);
        addPanel.add(txtPhone);
        addPanel.add(lblRollNumber);
        addPanel.add(txtRollNumber);
        addPanel.add(lblClassName);
        addPanel.add(txtClassName);
        addPanel.add(lblStatus);
        addPanel.add(txtStatus);
        addPanel.add(btnSubmit);
        
        addFrame.add(addPanel);
                

        addFrame.setLayout(null);
        addFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        addFrame.setVisible(true);
    }

}
