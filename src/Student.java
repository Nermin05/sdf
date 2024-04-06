public class Student extends User{//Inheritance
    private String qayib;

    public Student(int ID, String name, String password, String email, String username, String qayib) {
        super(ID, name, password, email, username);
        this.qayib = qayib;
    }
  public Student() {

  }

    public String getQayib() {//Encapsulation
        return qayib;
    }

    public void setQayib(String qayib) {
        this.qayib = qayib;
    }
}
