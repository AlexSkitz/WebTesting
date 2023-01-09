package utils;

public enum Credentials {
    USER1("User1", "12345678","emiyemub@hacker9.org"),
    USER2("User2", "123123123", "emiyemub@hacker9.org");

    private final String login;
    private final String password;
    private final String email;

    Credentials(String login, String password, String email) {
        this.login = login;
        this.password = password;
        this.email = email;
    }

    public String getLogin() {
        return login;
    }

    public String getPassword() {
        return password;
    }

    public String getEmail() {
        return email;
    }
}
