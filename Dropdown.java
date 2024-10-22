import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Dropdown {
    public static void main(String[] args) {
        // create the window
        JFrame frame = new JFrame("Dropdown Experiment");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300);

        // create the dropdowns and label
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(4, 1, 10, 10)); // use GridLayout for neat arrangement

        
        String[] colorOptions = { "Red", "Green", "Blue" };
        String[] sizeOptions = { "Small", "Medium", "Large" };
        String[] shapeOptions = { "Circle", "Square", "Triangle" };

        JComboBox<String> colorDropdown = new JComboBox<>(colorOptions);
        JComboBox<String> sizeDropdown = new JComboBox<>(sizeOptions);
        JComboBox<String> shapeDropdown = new JComboBox<>(shapeOptions);

        
        colorDropdown.setPreferredSize(new Dimension(100, 25));
        sizeDropdown.setPreferredSize(new Dimension(100, 25));
        shapeDropdown.setPreferredSize(new Dimension(100, 25));

        // Create a label to display the selected options
        JLabel label = new JLabel("Pick from each dropdown!");
        label.setFont(new Font("Arial", Font.PLAIN, 20));
        label.setForeground(Color.BLACK); // Set initial label color

        // Add action listeners to handle dropdown selection changes
        colorDropdown.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                updateLabel(colorDropdown, sizeDropdown, shapeDropdown, label);
            }
        });

        sizeDropdown.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                updateLabel(colorDropdown, sizeDropdown, shapeDropdown, label);
            }
        });

        shapeDropdown.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                updateLabel(colorDropdown, sizeDropdown, shapeDropdown, label);
            }
        });

        // add the dropdowns and label to the panel
        panel.add(colorDropdown);
        panel.add(sizeDropdown);
        panel.add(shapeDropdown);
        panel.add(label);

        
        frame.add(panel);

        
        frame.setVisible(true);
    }

    // method to update the label based on the current dropdown selections
    private static void updateLabel(JComboBox<String> colorDropdown, JComboBox<String> sizeDropdown, JComboBox<String> shapeDropdown, JLabel label) {
        String color = (String) colorDropdown.getSelectedItem();
        String size = (String) sizeDropdown.getSelectedItem();
        String shape = (String) shapeDropdown.getSelectedItem();
        label.setText("You selected: " + color + ", " + size + ", " + shape);
        
        // change label color based on the selected color
        switch (color) {
            case "Red":
                label.setForeground(Color.RED);
                break;
            case "Green":
                label.setForeground(Color.GREEN);
                break;
            case "Blue":
                label.setForeground(Color.BLUE);
                break;
        }
    }
    
}
