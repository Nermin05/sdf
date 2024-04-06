public class Teacher extends User{//Inheritance
    public String qiymetyazmaq;

    public Teacher(int ID, String name, String password, String email, String username, String qiymetyazmaq) {
        super(ID, name, password, email, username);
        this.qiymetyazmaq = qiymetyazmaq;
    }

    public Teacher() {

    }
    public String getQiymetyazmaq() {
        return qiymetyazmaq;
    }

    public void setQiymetyazmaq(String qiymetyazmaq) {
        this.qiymetyazmaq = qiymetyazmaq;
    }
}
