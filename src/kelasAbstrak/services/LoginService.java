package kelasAbstrak.services;

// abstraction with interface
public interface LoginService {
  // method abstract -- tanpa body
  public void login(String username, String password);
  public void failedLogin();

  // default method -- dengan body -- opsional diturunkan
  default void setToken(String token) {
    System.out.println("token created : " + token);
    forgotPassword(token);
  }

  // static method -- dengan body -- tidak bisa diturunkan
  static void forgotPassword(String newPassword) {
    System.out.println("created new password : " + newPassword);
  }
}
