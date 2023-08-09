package ch32_Enum.enum02;

import java.util.Set;

public class User {
    String name;
    Role role;
    Status statu;

    Set<Role> roles; //eger bir userin birden fazla rolu olursa

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", role=" + role +
                ", statu=" + statu +
                ", roles=" + roles +
                '}';
    }
}
