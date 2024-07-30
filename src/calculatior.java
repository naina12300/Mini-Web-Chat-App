import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class Calculator extends JFrame implements ActionListener
{
    JTextField tf1,tf2,tf3;
    Calculator()
    {
        JLabel l1=new JLabel("first number");
        JLabel l2=new JLabel("second number");
        JLabel l3=new JLabel("Result");

        tf1=new JTextField(20);
        tf2=new JTextField(20);
        tf3=new JTextField(20);
        
        JButton b1=new JButton("+");
        JButton b2=new JButton("-");

        setLayout(new FlowLayout());
        add(l1);
        add(tf1);
        add(l2);
        add(tf2);
        add(b1);
        add(b2);
        add(l3);
        add(tf3);

        b1.addActionListener(this);
        b2.addActionListener(this);

    }
    public void actionPerformed(ActionEvent e)
    {
        string s=e.getActionCommand();
        int x=Integer.parseInt(tf1.getText());
        int y=Integer.parseInt(tf2.getText()); 
        int z=0;
        if(s.equals("+"))
        {
            z=x+y;
            tf3.setText(Integer.toString(z));
        } 
        if(s.equals("-"))
        {
            z=x-y;
            tf3.setText(Integer.toString(z));
        }
    }
    public static void main(String args[])
    {
        Calculator d=new Calculator();
        d.setSize(300,400);
        d.setVisible(true);
        
    }
}