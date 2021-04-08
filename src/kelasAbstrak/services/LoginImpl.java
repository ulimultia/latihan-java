package kelasAbstrak.services;

import kelasAbstrak.*;

public class LoginImpl extends RegistrationAbstract implements LoginService {

  @Override
  public void login(String username, String password) {
    
    System.out.println("login berhasil " + username);
  }

  @Override
  public void failedLogin() {
    
    System.out.println("login gagal");
  }

  @Override
  public void setUser(String username) {
    
    System.out.println("User created and logged : " + username);
  }

  @Override
  public void setToken(String token) {
    
    LoginService.super.setToken(token);
  }
  
}
