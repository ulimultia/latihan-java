package kelasAbstrak;

public class Registration extends RegistrationAbstract {

  @Override
  public void setUser(String username) {
    System.out.println("user admin created : " + username);
  }

  @Override
  void setRole(String role) {
    super.setRole(role);
  }
  
}
