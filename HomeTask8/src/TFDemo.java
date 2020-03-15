import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Scanner;

public class TFDemo extends JFrame {
    JTextField jtf1;
    JTextField jtf2;
    JTextField jtf3;
    JTextField jtf4;
    JButton jbtnRev;
    JLabel jlabPrompt, jlabContents;
    Image image = Toolkit.getDefaultToolkit().getImage("C:\\Users\\admin\\Java\\Java8\\src\\lesson8\\ball.jpg");
    JButton img1;
    JButton img2;
    JButton img3;
    JButton img4;
    JButton img5;
    JFrame jfrm;

    static int counter;

    public void changePlayers() {
        jfrm.remove(img1);
        jfrm.setVisible(false);
        jfrm.add(img2);
        jfrm.setVisible(true);
    }

    public void changePlayers2() {
        jfrm.remove(img2);
        jfrm.setVisible(false);
        jfrm.add(img3);
        jfrm.setVisible(true);
    }
    public void changePlayers3() {
        jfrm.remove(img3);
        jfrm.setVisible(false);
        jfrm.add(img4);
        jfrm.setVisible(true);
    }
    public void changePlayers4() {
        jfrm.remove(img4);
        jfrm.setVisible(false);
        jfrm.add(img5);
        jfrm.setVisible(true);
    }


    TFDemo() {
        jfrm = new JFrame("Угадай футболиста");
        jfrm.setLayout(new FlowLayout());
        jfrm.setSize(800, 800);
        jfrm.setIconImage(image);
        jfrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jtf1 = new JTextField(10);
        jtf1.setActionCommand("myTF");
        jtf2 = new JTextField(10);
        jtf2.setActionCommand("myTF");
        jtf3 = new JTextField(10);
        jtf3.setActionCommand("myTF");
        jtf4 = new JTextField(10);
        jtf4.setActionCommand("myTF");
        img1 = new JButton();
        img1.setIcon(new ImageIcon("C:\\Users\\admin\\Java\\Java8\\src\\lesson8\\Cavani.jpg"));
        img2 = new JButton();
        img2.setIcon(new ImageIcon("C:\\Users\\admin\\Java\\Java8\\src\\lesson8\\messi.jpg"));
        img3 = new JButton();
        img3.setIcon(new ImageIcon("C:\\Users\\admin\\Java\\Java8\\src\\lesson8\\neymar.jpg"));
        img4 = new JButton();
        img4.setIcon(new ImageIcon("C:\\Users\\admin\\Java\\Java8\\src\\lesson8\\ronaldo.jpg"));
        img5 = new JButton();
        img5.setIcon(new ImageIcon("C:\\Users\\admin\\Java\\Java8\\src\\lesson8\\aguero.jpg"));
        JButton jbtnRev = new JButton("Ответить");
        jtf1.addActionListener(e -> {
            System.out.println(jtf1.getText());
            String orgStr1 = jtf1.getText();
            if (orgStr1.equals("Кавани")) {
                counter++;
                changePlayers();
            } else {
                changePlayers();
            }
        });
        jtf2.addActionListener(e -> {
            String orgStr2 = jtf2.getText();
            if (orgStr2.equals("Месси")) {
                counter++;
                changePlayers2();
            } else {
                changePlayers2();
            }
        });
        jtf3.addActionListener(e -> {
            String orgStr3 = jtf3.getText();
            if (orgStr3.equals("Неймар")) {
                counter++;
                changePlayers3();
            } else {
                changePlayers3();
            }
        });
        jtf4.addActionListener(e -> {
            String orgStr4 = jtf1.getText();
            if (orgStr4.equals("Роналду")) {
                counter++;
                changePlayers4();
            } else {
                changePlayers4();
            }
        });
        jbtnRev.addActionListener(e -> {

        });
        jlabPrompt = new JLabel("Введите текст: ");
        jlabContents = new JLabel("");
        jfrm.add(jlabPrompt);
        jfrm.add(jtf1);
        jfrm.add(img1);
        jfrm.add(jbtnRev);
        jfrm.add(jlabContents);
        jfrm.setVisible(true);

    }


    public void actionPerformed(ActionEvent ae) {
//        if (ae.getActionCommand().equals("Ответить")) {

    }
    public static void main(String[] args) {
        new TFDemo();


        System.out.println("Правильных ответов: " + counter);
    }

}

