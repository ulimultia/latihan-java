package kelasAbstrak;

import kelasAbstrak.services.LoginImpl;

public class Main {
  public static void main(String[] args) {
    Registration regis = new Registration();
    regis.setUser("femiliapm");
    regis.setRole("admin");

    System.out.println();

    LoginImpl login = new LoginImpl();
    login.login("testing1234", "xxxxxx");
    login.setUser("testing1234");
    login.setToken("adflkjeru12345");
  }
}
