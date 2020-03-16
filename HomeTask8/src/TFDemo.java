import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.lang.reflect.Array;
import java.util.Scanner;

public class TFDemo extends JFrame {
    JTextField jtf1;
    JTextField jtf2;
    JTextField jtf3;
    JTextField jtf4;
    JTextField jtf5;
    JButton jbtnRev;
    JLabel jlabPrompt, jlabContents;
    Image image = Toolkit.getDefaultToolkit().getImage("C:\\Users\\admin\\Java\\Java1\\HomeTask8\\src\\ball.jpg");
    JButton img1;
    JButton img2;
    JButton img3;
    JButton img4;
    JButton img5;
    JButton end;
    JFrame jfrm;
    JButton[] arr = {img1, img2, img3, img4, img5};

    static int counter;



    public void changePlayers() {
        img1.setIcon(new ImageIcon("C:\\Users\\admin\\Java\\Java1\\HomeTask8\\src\\messi.jpg"));
//        jfrm.setVisible(false);
//        jfrm.add(img2);
//        jfrm.setVisible(true);
    }

    public void changePlayers2() {
        img1.setIcon(new ImageIcon("C:\\Users\\admin\\Java\\Java1\\HomeTask8\\src\\neymar.jpg"));
//        jfrm.setVisible(false);
//        jfrm.add(img3);
//        jfrm.setVisible(true);
    }
    public void changePlayers3() {
        img1.setIcon(new ImageIcon("C:\\Users\\admin\\Java\\Java1\\HomeTask8\\src\\ronaldo.jpg"));
    }
    public void changePlayers4() {
        img1.setIcon(new ImageIcon("C:\\Users\\admin\\Java\\Java1\\HomeTask8\\src\\aguero.jpg"));
    }
    public void changePlayers5() {
        img1.setIcon(new ImageIcon("C:\\Users\\admin\\Java\\Java1\\HomeTask8\\src\\end.jpg"));
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
        jtf5 = new JTextField(10);
        jtf5.setActionCommand("myTF");
        img1 = new JButton();
        img1.setIcon(new ImageIcon("C:\\Users\\admin\\Java\\Java1\\HomeTask8\\src\\Cavani.jpg"));

        jlabPrompt = new JLabel("Введите текст: ");
        jlabContents = new JLabel("");
        jfrm.add(jlabPrompt);
        jfrm.add(jtf1);
        jfrm.add(jtf2);
        jfrm.add(jtf3);
        jfrm.add(jtf4);
        jfrm.add(jtf5);
        jfrm.add(img1);
        jfrm.add(jlabContents);
        jfrm.setVisible(true);
        jtf1.addActionListener(e -> {
                    String orgStr1 = jtf1.getText();
                    if (orgStr1.equals("Кавани")) {
                        counter++;
                        changePlayers();
                    }else {
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
            String orgStr4 = jtf4.getText();
            if (orgStr4.equals("Роналду")) {
                counter++;
                changePlayers4();
            } else {
                changePlayers4();
            }
        });
        jtf5.addActionListener(e -> {
                    String orgStr5 = jtf5.getText();
                    if (orgStr5.equals("Агуэро")) {
                        counter++;
                        changePlayers5();
                    }else {
                        changePlayers5();
                    }
                    jfrm.remove(this);
            jlabContents.setText("Вы угадали: " + counter);
                });
    }

    public static void main(String[] args) {
        new TFDemo();



    }

}

