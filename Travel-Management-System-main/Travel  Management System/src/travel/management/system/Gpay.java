package travel.management.system;


import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Gpay extends JFrame{
    Gpay(){
        JEditorPane j = new JEditorPane();
        j.setEditable(false);   

        try {
            j.setPage("https://gpay.com/payments");
        }catch (Exception e) {
            j.setContentType("text/html");
            j.setText("<html>Could not load,Error 404 </html>");
        } 

        JScrollPane scrollPane = new JScrollPane(j);     
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        getContentPane().add(scrollPane);
        setPreferredSize(new Dimension(800,600));
        
        JButton back=new JButton("Back");
        back.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                setVisible(false);
            }
        });
        back.setBounds(610, 20, 80, 40);
        j.add(back);
        
        setSize(800,600);
        setLocation(600,220);
        setVisible(true);
    }
    public static void main(String[] args){
        new Gpay().setVisible(true);
    }
}

