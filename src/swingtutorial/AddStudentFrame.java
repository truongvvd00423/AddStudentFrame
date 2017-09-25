/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package swingtutorial;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.ParseException;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFormattedTextField;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.text.MaskFormatter;

/**
 *
 * @author vuvan
 */
public class AddStudentFrame {

    private JFrame addFrame;
    private JPanel addPanel;
    private JLabel lblId;
    private JTextField txtId;
    private JLabel lblName;
    private JTextField txtName;
    private JLabel lblEmail;
    private JTextField txtEmail;
    private JLabel lblPhone;
    private JFormattedTextField txtPhone;
    private JLabel lblRollNumber;
    private JTextField txtRollNumber;
    private JLabel lblClassName;
    private JTextField txtClassName;
    private JLabel lblStatus;
    private JTextField txtStatus;
    private JLabel lblBirthday;
    private JFormattedTextField txtBirthday;

    public AddStudentFrame() {
          
        addFrame = new JFrame("Add Student");
        addFrame.setSize(1000, 800);
        addFrame.setLocationRelativeTo(null);
       
      
     
        addPanel = new JPanel();
        addPanel.setLayout(null);
        addPanel.setBackground(Color.lightGray);
        addPanel.setBounds(70, 50, 600, 500);

        //ID:    
        ImageIcon imgId = new ImageIcon("C:\\Users\\vuvan\\Documents\\NetBeansProjects\\SwingTutorial\\src\\swingtutorial\\id.png");
        lblId = new JLabel("ID: ", imgId, 0);
        lblId.setBounds(80, 60, 100, 30);
        txtId = new JTextField();
        txtId.setBounds(180, 60, 200, 30);

        //Name: 
        ImageIcon imgName = new ImageIcon("C:\\Users\\vuvan\\Documents\\NetBeansProjects\\SwingTutorial\\src\\swingtutorial\\name.png");
        lblName = new JLabel("Name: ", imgName, 0);
        lblName.setBounds(80, 100, 100, 30);
        txtName = new JTextField();
        txtName.setBounds(180, 100, 200, 30);

        //Email:
        ImageIcon imgEmail = new ImageIcon("C:\\Users\\vuvan\\Documents\\NetBeansProjects\\SwingTutorial\\src\\swingtutorial\\email.png");
        lblEmail = new JLabel("Email: ", imgEmail, 0);
        lblEmail.setBounds(80, 140, 100, 30);
        txtEmail = new JTextField();
        txtEmail.setBounds(180, 140, 200, 30);

        //Phone:
        
        ImageIcon imgPhone = new ImageIcon("C:\\Users\\vuvan\\Documents\\NetBeansProjects\\SwingTutorial\\src\\swingtutorial\\phone.png");
        lblPhone = new JLabel("Phone: ", imgPhone, 0);
        lblPhone.setBounds(80, 180, 100, 30);
        
        try{
        MaskFormatter fmPhone = new MaskFormatter("+84 ####-###-###");
        
        txtPhone = new JFormattedTextField(fmPhone);
        txtPhone.setBounds(180, 180, 200, 30);
        }catch(ParseException e){
            System.out.println(e);
        
        }
        //Birthday:
        ImageIcon imgBirthday = new ImageIcon("C:\\Users\\vuvan\\Documents\\NetBeansProjects\\SwingTutorial\\src\\swingtutorial\\bithday.png");
        lblBirthday = new JLabel("Birthday: ", imgBirthday, 0);
        lblBirthday.setBounds(80, 220, 100, 30);
        try{
        MaskFormatter fmBirthday = new MaskFormatter("##/##/####");
        
        txtBirthday = new JFormattedTextField(fmBirthday);
        txtBirthday.setBounds(180, 220, 200, 30);
        
        }catch(ParseException e){
            System.out.println(e);    
        }

        //RollNumber:
        ImageIcon imgRollNumber = new ImageIcon("C:\\Users\\vuvan\\Documents\\NetBeansProjects\\SwingTutorial\\src\\swingtutorial\\3gach.png");
        
        lblRollNumber = new JLabel("Roll Number: ", imgRollNumber, 0);
        lblRollNumber.setBounds(70, 260, 100, 30);
        txtRollNumber = new JTextField();
        txtRollNumber.setBounds(180, 260, 200, 30);

        //ClassName:
        ImageIcon imgClassName = new ImageIcon("C:\\Users\\vuvan\\Documents\\NetBeansProjects\\SwingTutorial\\src\\swingtutorial\\3gachnho.png");
        
        lblClassName = new JLabel("Class Name: ", imgClassName, 0);
        lblClassName.setBounds(70, 300, 100, 30);
        txtClassName = new JTextField();
        txtClassName.setBounds(180, 300, 200, 30);

        //Status:
        ImageIcon imgStatus = new ImageIcon("C:\\Users\\vuvan\\Documents\\NetBeansProjects\\SwingTutorial\\src\\swingtutorial\\pen.png");
        lblStatus = new JLabel("Status: ", imgStatus, 0);
        lblStatus.setBounds(80, 340, 100, 30);
        txtStatus = new JTextField();
        txtStatus.setBounds(180, 340, 200, 30);

        //Submit:
        ImageIcon imgSubmit = new ImageIcon("C:\\Users\\vuvan\\Documents\\NetBeansProjects\\SwingTutorial\\src\\swingtutorial\\submit.gif");
        JButton btnSubmit = new JButton("Submit",imgSubmit);
        btnSubmit.setBounds(270, 390, 110, 30);

        btnSubmit.addActionListener(new ButtonHandle());

        addPanel.add(lblId);
        addPanel.add(txtId);
        addPanel.add(lblName);
        addPanel.add(txtName);
        addPanel.add(lblEmail);
        addPanel.add(txtEmail);
        addPanel.add(lblPhone);
        addPanel.add(lblBirthday);
        addPanel.add(txtBirthday);
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

    public class ButtonHandle implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            JOptionPane.showConfirmDialog(null, "Id: " + txtId.getText() 
                    + "\n Name: " + txtName.getText() 
                    + "\n Email: " + txtEmail.getText() 
                    + "\n Phone: " + txtPhone.getText() 
                    + "\n Birthday" + txtBirthday.getText() 
                    + "\n Class Name: " + txtClassName.getText() 
                    + "\n Roll Number: " + txtRollNumber.getText() 
                    + "\n Status: " + txtStatus.getText());
            
            JOptionPane.showMessageDialog(null, "Login Success !! hihi.");
        }

    }
    
    public static void main(String[] args) {
        AddStudentFrame addstd = new AddStudentFrame();
        
    }

}
