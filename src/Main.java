import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;

import static java.awt.event.KeyEvent.*;

class Main implements ActionListener
{
JFrame f;
Reservation r;
Enquiry q;
Cancellation c;
JLabel imgL,mailL;
ImageIcon img;
JMenuBar mb;
JMenu m1,m2,m3;
JMenuItem i1,i2,i3,i4,i5;
String mail="contact@irctc.co.in";
JMenuItem pbooking,ppnr,pcontact;

Main()
{
mailL=new JLabel(mail);
mailL.setForeground(Color.BLUE.darker());
mailL.setCursor(new Cursor(Cursor.HAND_CURSOR));
img=new ImageIcon(getClass().getResource("./images/indian-railways.jpg"));
imgL=new JLabel(img);
imgL.setBounds(0,0,700,600);
f=new JFrame("IRCTC");
f.getContentPane().setLayout(null);
//f.getContentPane().setBackground(Color.white);
    final JPopupMenu popupmenu = new JPopupMenu("Edit");
     pbooking = new JMenuItem("Booking");
     ppnr = new JMenuItem("PNR Enquiry");
     pcontact = new JMenuItem("Contact");
    popupmenu.add(pbooking); popupmenu.add(ppnr); popupmenu.add(pcontact);
    pbooking.addActionListener(this);ppnr.addActionListener(this);pcontact.addActionListener(this);
    f.addMouseListener(new MouseAdapter() {
        public void mouseClicked(MouseEvent e) {
            if(e.isPopupTrigger())
                popupmenu.show(f , e.getX(), e.getY());
        }
        public void mouseReleased(MouseEvent e) {
            if(e.isPopupTrigger())
                popupmenu.show(f,e.getX(),e.getY());
        }

    });


    i1=new JMenuItem("Reservation Form");
i1.addActionListener(this);

i2=new JMenuItem("PNR-enquiry");
i2.addActionListener(this);

i3=new JMenuItem("Cancellation Form");
i3.addActionListener(this);

i4=new JMenuItem("Exit");
i4.addActionListener(this);

i5=new JMenuItem("Contact Us");
i5.addActionListener(this);

m1=new JMenu("Booking");
m2=new JMenu("Cancellation");
m3=new JMenu("Exit");

m1.add(i1);m1.add(i2);
m2.add(i3);m2.add(i5);
m3.add(i4);
    mb=new JMenuBar();
mb.add(m1);mb.add(m2);mb.add(m3);

f.setJMenuBar(mb);

m1.setMnemonic('B');
m2.setMnemonic('N');
m3.setMnemonic('L');
i1.setMnemonic('R');
i1.setAccelerator(KeyStroke.getKeyStroke(VK_R, Event.CTRL_MASK | Event.SHIFT_MASK));
i2.setMnemonic('P');
i2.setAccelerator(KeyStroke.getKeyStroke(VK_P, Event.CTRL_MASK | Event.SHIFT_MASK));
i3.setMnemonic('C');
i3.setAccelerator(KeyStroke.getKeyStroke(VK_C, Event.CTRL_MASK | Event.SHIFT_MASK));
i4.setMnemonic('E');
i5.setMnemonic('A');

f.getContentPane().add(imgL);
f.setSize(700,600);
f.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
f.setResizable(false);
f.setVisible(true);
}
public void actionPerformed(ActionEvent e)
{
if(e.getSource()==i1 || e.getSource() == pbooking)
{
f.setVisible(false);
r=new Reservation();
}
if(e.getSource()==i2 || e.getSource()==ppnr)
{
f.setVisible(false);
q=new Enquiry();
}
if(e.getSource()==i3)
{
f.setVisible(false);
c=new Cancellation();
}
if(e.getSource()==i4)
{
f.setVisible(false);
System.exit(0);
}
if(e.getSource()==i5 || e.getSource()==pcontact)
{
    mailL.addMouseListener(new MouseAdapter() {

        @Override
        public void mouseClicked(MouseEvent e) {
            try {
                Desktop.getDesktop().browse(new URI("mailto:contact@irctc.co.in"));
            } catch (IOException | URISyntaxException e1) {
                e1.printStackTrace();
            }
        }
    });
    JOptionPane.showMessageDialog(f,mailL,"Contact Mail",
            JOptionPane.INFORMATION_MESSAGE);
}
}
public static void main(String args[])
{
new Main();
}
}
