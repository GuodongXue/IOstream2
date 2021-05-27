package DataStream;

import java.io.Serial;
import java.io.Serializable;

public class Teacher implements Serializable {
    @Serial
    private static final long serialVersionUID = -4031710728147774939L;
    private String username;
    transient private String password;
    static int age;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Teacher(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public Teacher() {
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "username='" + username + '\'' +
                ", password='" + password + '\'' +
                '}'+age;
    }
}
