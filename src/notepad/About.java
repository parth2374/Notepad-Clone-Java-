package notepad;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class About extends JFrame implements ActionListener {
    About() {
        setBounds(400,100,600,450);
        setLayout(null);
        
        ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("notepad/windows.png"));
        Image i2=i1.getImage().getScaledInstance(300, 60, Image.SCALE_DEFAULT);
        ImageIcon i3=new ImageIcon(i2);
        JLabel headerIcon=new JLabel(i3);
        headerIcon.setBounds(70,40,400,80);
        add(headerIcon);
        
        ImageIcon i4=new ImageIcon(ClassLoader.getSystemResource("notepad/notepad.png"));
        Image i5=i4.getImage().getScaledInstance(70, 70, Image.SCALE_DEFAULT);
        ImageIcon i6=new ImageIcon(i5);
        JLabel Icon=new JLabel(i6);
        Icon.setBounds(50,180,70,70);
        add(Icon);
        
        JLabel text=new JLabel("<html>Microsoft Windows<br>Version 22H2 (OS Bould 19045.3930)<br>Microsoft Corporation, All rights reserved.<br><br>The Windows 10 Pro operating system and its user interface ae protected<br>by trademark and other pending or existing intellectual property rights in<br>the United States and other countries/region.<br><br><br><br><br>This product is licensed under the <a>Microsoft Software License Terms</a></html>");
        text.setFont(new Font("SANS_SERIF",Font.PLAIN,12));
        text.setBounds(150,100,500,300);
        add(text);
        
        JButton b1=new JButton("OK");
        b1.setBounds(250,375,120,25);
        b1.addActionListener(this);
        add(b1);
        
        setVisible(true);
    }
    
    @Override
    public void actionPerformed(ActionEvent ae) {
        this.setVisible(false);
    }
    
    public static void main(String[] args) {
        new About();
    }
}
