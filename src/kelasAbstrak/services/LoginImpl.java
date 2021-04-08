package kelasAbstrak.services;

import kelasAbstrak.*;

public class LoginImpl extends RegistrationAbstract implements LoginService {

  @Override
  public void login(String username, String password) {
    // TODO Auto-generated method stub
    System.out.println("login berhasil " + username);
  }

  @Override
  public void failedLogin() {
    // TODO Auto-generated method stub
    System.out.println("login gagal");
  }

  @Override
  public void setUser(String username) {
    // TODO Auto-generated method stub
    System.out.println("User created and logged : " + username);
  }

  @Override
  public void setToken(String token) {
    // TODO Auto-generated method stub
    LoginService.super.setToken(token);
  }
  
}
