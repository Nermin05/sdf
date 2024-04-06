public class TeacherManager extends UserManager{
    @Override//Polimorfizm
    public void Register(User user) {
        if(user.getPassword().length()<10) {
            System.out.println("Kod zeifdir");
        }
        else if(user.getUsername().contains(".")) {
            System.out.println("Istifadeci adini duzgun daxil edin");
        }
        else {
            System.out.println(user.getName()+" hesaba daxil olundu");
        }
    }
}
