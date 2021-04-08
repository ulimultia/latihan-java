package kelasAbstrak;

public class Registration extends RegistrationAbstract {

  @Override
  public void setUser(String username) {
    // TODO Auto-generated method stub
    System.out.println("user admin created : " + username);
  }

  @Override
  void setRole(String role) {
    // TODO Auto-generated method stub
    super.setRole(role);
  }
  
}
