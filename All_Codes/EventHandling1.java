
import java.awt.event.*;
import javax.swing.*;

class EventHandling1 {

    public static void main(String A[]) {
        JFrame fobj = new JFrame("PPA");
        JButton bobj = new JButton("OK");

        bobj.setBounds(100, 100, 150, 80);

        bobj.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent aobj) {

                System.out.println("Button clicked..");
            }
        });

        fobj.add(bobj);

        fobj.setSize(500, 600);

        fobj.setLayout(null);
        fobj.setVisible(true);

        fobj.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
