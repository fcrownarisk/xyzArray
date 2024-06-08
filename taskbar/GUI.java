import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class GUI extends JFrame {
    private static final long serialVersionUID = 1L;
    private JButton button;

    public GUI() {
        setTitle("Simple GUI Example");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300, 200);

        Container contentPane = getContentPane();
        contentPane.setLayout(new FlowLayout());

        button = new JButton("Click me!");
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Handle the button click event here
                System.out.println("Button clicked!");
            }
        });

        contentPane.add(button);
    }
    public static void main(String[] args) {
        GUI gui = new GUI();
        gui.setVisible(true);
    }
}