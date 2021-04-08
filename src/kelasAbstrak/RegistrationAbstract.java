package kelasAbstrak;

public abstract class RegistrationAbstract {
  // modifier : public
  public abstract void setUser(String username);

  // modifier : default
  void setRole(String role) {
    System.out.println("role created : " + role);
    setLevel(1);
  }

  // modifier : default
  static void setLevel(Integer level) {
    System.out.println("Level : " + level);
  }
}
