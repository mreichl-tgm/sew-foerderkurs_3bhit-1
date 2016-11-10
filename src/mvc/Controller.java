package mvc;

class Controller {
    private View v;
    private Model m;

    Controller() {
        v = new View();
        m = new Model();
    }
}
