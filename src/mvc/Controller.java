package mvc;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class Controller {
    private View v;
    private Model m;

    Controller() {
        v = new View();
        m = new Model();

        v.setSaveListener(new SaveListener());
    }

    private void update() {
        v.repaint();
    }

    private class SaveListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent actionEvent) {
            m.setUsername(v.getUnInput());
            m.setPassword(v.getPwInput());

            v.setUserLabel(m.getUsername() + " " + m.getPassword());
            update();
        }
    }
}
