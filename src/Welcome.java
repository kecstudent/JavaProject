import java.awt.*;
import javax.swing.*;
class Welcome implements Runnable
{
JFrame f;
JLabel l1,l2,l3;
Thread t;
Login l;
ImageIcon img;
Welcome()
{
img=new ImageIcon(getClass().getResource("./images/logo.png"));
t=new Thread(this);
f=new JFrame("Welcome");
f.getContentPane().setLayout(null);
f.getContentPane().setBackground(Color.black);
l1=new JLabel("Online Reservation");
l1.setBounds(50,300,900,50);
l1.setFont(new Font("Courier new",Font.BOLD,60));
l1.setForeground(Color.red);
l2=new JLabel(" - Abinash S, Arul Prasath V");
l2.setFont(new Font("Courier new",Font.BOLD,35));
l2.setBounds(100,380,800,40);
l2.setForeground(Color.white);
l3=new JLabel(img);
l3.setBounds(0,0,800,800);

f.getContentPane().add(l1);
f.getContentPane().add(l2);
f.getContentPane().add(l3);

f.setSize(800,800);
f.setVisible(true);
f.setResizable(false);
f.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
t.start();
}
public void run()
{
int x=1;
while(x<=5)
{
try
{
Thread.sleep(1000);
}
catch(Exception ignored)
{}
x++;
}
f.setVisible(false);

l=new Login();
}
}

