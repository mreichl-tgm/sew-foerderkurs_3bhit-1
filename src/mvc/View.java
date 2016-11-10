package mvc;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;

class View extends JFrame {
    private JPanel unPanel = new JPanel();
    private JPanel pwPanel = new JPanel();
    private JPanel savePanel = new JPanel();

    private JLabel unLabel = new JLabel("Username: ");
    private JLabel pwLabel = new JLabel("Password: ");

    private JTextField unInput = new JTextField();
    private JTextField pwInput = new JTextField();

    private JButton saveButton = new JButton("Save");

    View() {
        super();

        buildComponents();

        SpringLayout layout = new SpringLayout();

        layout.putConstraint(SpringLayout.WEST, unLabel, 10, SpringLayout.WEST, unInput);
        layout.putConstraint(SpringLayout.WEST, pwLabel, 10, SpringLayout.WEST, pwInput);
        layout.putConstraint(SpringLayout.NORTH, pwPanel, 25, SpringLayout.NORTH, unPanel);
        layout.putConstraint(SpringLayout.SOUTH, savePanel, 70, SpringLayout.SOUTH, pwPanel);

        this.setLayout(layout);

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        this.setBounds(200, 150, 600, 200);                 // x-axis, y-axis, width, height
        this.setVisible(true);
    }

    private void buildComponents() {
        unInput.setPreferredSize(new Dimension(200, 20));   // new Dimension(width, height)
        pwInput.setPreferredSize(new Dimension(200, 20));

        saveButton.setPreferredSize(new Dimension(80, 40));
        savePanel.setBorder(new EmptyBorder(20, 20, 20, 20));

        unPanel.add(unLabel);
        unPanel.add(unInput);
        pwPanel.add(pwLabel);
        pwPanel.add(pwInput);

        savePanel.add(saveButton);

        this.add(unPanel);
        this.add(pwPanel);
        this.add(savePanel);
    }
}
