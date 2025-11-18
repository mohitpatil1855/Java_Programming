
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

class MarvellousLogin implements ActionListener {

    //characteristics
    JFrame fobj;
    JTextField tobj;
    JPasswordField pobj;
    JButton bobj;
    JLabel Userlabel, Passwordlabel, Resultlabel;

    public MarvellousLogin(String title, int width, int height) {

        fobj = new JFrame(title);

        Userlabel = new JLabel("Username");
        Userlabel.setBounds(50, 50, 100, 30);

        tobj = new JTextField();
        tobj.setBounds(150, 50, 100, 30);

        Passwordlabel = new JLabel("Password");
        Passwordlabel.setBounds(50, 100, 100, 30);

        pobj = new JPasswordField();
        pobj.setBounds(150, 100, 100, 30);

        bobj = new JButton("Submit");
        bobj.setBounds(150, 150, 100, 30);

        Resultlabel = new JLabel("");
        Resultlabel.setBounds(150, 200, 250, 30);

        fobj.add(tobj);
        fobj.add(pobj);
        fobj.add(bobj);
        fobj.add(Userlabel);
        fobj.add(Passwordlabel);
        fobj.add(Resultlabel);

        bobj.addActionListener(this);

        fobj.setLayout(null);
        fobj.setSize(width, height);

        fobj.setVisible(true);
        fobj.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    //Username : MohitPatil
    //Password : Mohit@1855
    public void actionPerformed(ActionEvent aobj) {

        String uname = tobj.getText();
        String pass = pobj.getText();

        if ((uname.equals("MohitPatil")) && (pass.equals("Mohit@1855"))) {
            Resultlabel.setText("Login sucessfull..");

        } else {
            Resultlabel.setText("Invalid Username or Password..");

        }
    }

}

class LoginFrameFinal {

    public static void main(String A[]) {

        MarvellousLogin mobj = new MarvellousLogin("Login", 400, 300);
    }
}
