package calculator;
import javax.swing.*;
public class frame extends JFrame  {
    JTextField t;
    JButton b1, b2, b3, b4, b5, b6, b7, b8, b9, b10,
            b11, b12, b13, b14, b15, b16, b17, b18,
            b19, b20, b21, b22, b23, b24, b25, b26,
            b27, b28, b29, b30, b31;

    frame() {
        setSize(350, 490);
        setTitle("Calculator");
        setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocation(500, 100);
        setVisible(true);
    }
}

