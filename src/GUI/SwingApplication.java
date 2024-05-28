package GUI;

import javax.swing.*;
import java.awt.*;

public class SwingApplication {

    public static void main(String[] args) {

        // FRAME
        JFrame frame = new JFrame("SwingApplication");
        frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
        frame.setSize(500,500);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);

        //PANEL
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(7,7,10,10));
        frame.add(panel);

        // COMPONENTS
        JLabel Name = new JLabel("Name");
        JLabel Email = new JLabel("Email");
        JLabel password = new JLabel("Password");
        JLabel Gender = new JLabel("Gender");
        JLabel Hobby = new JLabel("Hobby");

        Name.setLocation(20,20);


        JPasswordField Password = new JPasswordField("Password");

        JTextField nametext = new JTextField(10);
        JTextField emailtext = new JTextField(10);

        JRadioButton Male = new JRadioButton("Male");
        JRadioButton Female = new JRadioButton("Female");
        ButtonGroup genderGroup = new ButtonGroup();
        genderGroup.add(Male);
        genderGroup.add(Female);

        JCheckBox coding = new JCheckBox("Coding");
        JCheckBox movie = new JCheckBox("Movie");

        panel.add(Name);
        panel.add(nametext);
        panel.add(Email);
        panel.add(emailtext);
        panel.add(password);
        panel.add(Password);
        panel.add(Gender);
        panel.add(Male);
        panel.add(Female);
        panel.add(Hobby);
        panel.add(coding);
        panel.add(movie);



    }
}
