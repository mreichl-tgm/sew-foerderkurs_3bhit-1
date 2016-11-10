package mvc;

class Model {
    private String username;
    private String password;

    Model() {
        this.username = "admin";
        this.password = "password123";
    }

    String getUsername() {
        return this.username;
    }

    boolean setUsername(String username) {
        if (!username.equals(this.username)) {
            this.username = username;
            return true;
        }

        return false;
    }
}
