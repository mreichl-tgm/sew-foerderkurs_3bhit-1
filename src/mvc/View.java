package mvc;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import javax.swing.text.JTextComponent;
import java.awt.*;
import java.awt.event.ActionListener;

class View extends JFrame {
    private SpringLayout layout = new SpringLayout();

    private JPanel unPanel = new JPanel();
    private JPanel pwPanel = new JPanel();
    private JPanel userPanel = new JPanel();
    private JPanel savePanel = new JPanel();

    private JLabel unLabel = new JLabel("Username: ");
    private JLabel pwLabel = new JLabel("Password: ");
    private JLabel userLabel = new JLabel("Not set");

    private JTextField unInput = new JTextField();
    private JTextField pwInput = new JTextField();


    private JButton saveButton = new JButton("Save");

    View() {
        super();

        buildComponents();
        buildLayout();

        this.setLayout(layout);

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        this.setBounds(200, 150, 400, 200);                 // x-axis, y-axis, width, height
        this.setVisible(true);
    }

    private void buildLayout() {
        layout.putConstraint(SpringLayout.WEST, unLabel, 10, SpringLayout.WEST, unInput);
        layout.putConstraint(SpringLayout.WEST, pwLabel, 10, SpringLayout.WEST, pwInput);
        layout.putConstraint(SpringLayout.NORTH, pwPanel, 25, SpringLayout.NORTH, unPanel);
        layout.putConstraint(SpringLayout.SOUTH, savePanel, 70, SpringLayout.SOUTH, pwPanel);
        layout.putConstraint(SpringLayout.SOUTH, userPanel, 70, SpringLayout.SOUTH, savePanel);
    }

    private void buildComponents() {
        unInput.setPreferredSize(new Dimension(200, 20));   // new Dimension(width, height)
        pwInput.setPreferredSize(new Dimension(200, 20));
        userPanel.setPreferredSize(new Dimension(400, 100));

        saveButton.setPreferredSize(new Dimension(80, 40));
        savePanel.setBorder(new EmptyBorder(20, 20, 20, 20));
        unPanel.add(unLabel);
        unPanel.add(unInput);

        pwPanel.add(pwLabel);
        pwPanel.add(pwInput);

        userPanel.add(userLabel);
        savePanel.add(saveButton);

        this.add(unPanel);
        this.add(pwPanel);
        this.add(savePanel);
        this.add(userPanel);

    }

    String getUnInput() {
        return unInput.getText();
    }

    String getPwInput() {
        return pwInput.getText();
    }

    void setSaveListener(ActionListener a) {
        saveButton.addActionListener(a);
    }

    void setUserLabel(String s) {
        userLabel.setText(s);
    }
}
