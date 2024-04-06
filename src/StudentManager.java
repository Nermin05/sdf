public class StudentManager extends UserManager{

    @Override//Polimorfizm
    public void Register(User user) {
        if(user.getPassword().length()<8) {
            System.out.println("Kod zeifdir");
        }
        else {
            System.out.println(user.getName()+" hesaba daxil olundu");
        }
    }
}
