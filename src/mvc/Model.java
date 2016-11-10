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

    boolean setPassword(String password) {
        if (!password.equals(this.password)) {
            this.password = password;
            return true;
        }

        return false;
    }

    String getPassword() {
        return this.password;
    }
}
