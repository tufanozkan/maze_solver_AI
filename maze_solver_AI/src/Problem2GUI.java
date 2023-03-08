import java.awt.*;
import javax.swing.*;
import javax.swing.border.EmptyBorder;

public class Problem2GUI extends JFrame {

    public JPanel contentPane;

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    Problem2GUI frame = new Problem2GUI();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    public Problem2GUI() {
        setSize(625, 675);
        setResizable(false);

        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        setLocationRelativeTo(null);
        setTitle("PROBLEM TWO");
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(new BorderLayout(0, 0));
    }
}
