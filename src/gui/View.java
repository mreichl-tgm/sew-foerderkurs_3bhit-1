import javax.swing.*;
import java.awt.*;

class View {
    View() {
        JFrame frame = new JFrame("My JFrame");
        FlowLayout layout = new FlowLayout();
        ButtonGroup userButtons = new ButtonGroup();
        ButtonGroup botButtons = new ButtonGroup();
        /* Configure frame */
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(800,500);
        /* Content */
        frame.setLayout(layout);

        userButtons.add(new JRadioButton());

        /* Make Visible */
        frame.setVisible(true);
    }

    private class DrawGraphics extends JPanel {
        int xPoints[] = {50, 350, 350, 200, 50};
        int yPoints[] = {50, 50, 350, 200, 350};
        int nPoints = 5;

        public void paint(Graphics g) {
            g.drawPolygon(xPoints, yPoints, nPoints);
            g.fillArc(400, 50, 200, 400, 60, 240);
        }
    }
}