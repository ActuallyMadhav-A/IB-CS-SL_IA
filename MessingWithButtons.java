import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class MessingWithButtons{   
    public static void main(String[] args) {
        // create the window
        JFrame frame = new JFrame("Button Experiment");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300);

        
        JPanel panel = new JPanel();

        
        JButton button = new JButton("Click Me!");
        button.setFont(new Font("Arial", Font.BOLD, 20));
        button.setBackground(Color.CYAN);

        
        button.addActionListener(new ActionListener() {
            private boolean clicked = false;

            @Override
            public void actionPerformed(ActionEvent e) {
                if (!clicked) {
                    button.setText("You clicked me!");
                    button.setBackground(Color.GREEN);
                } else {
                    button.setText("Click me again!");
                    button.setBackground(Color.RED);
                }
                clicked = !clicked; 
            }
        });

        
        panel.add(button);        
        frame.add(panel);
        frame.setVisible(true);
    }
}