public abstract class UserManager {
    public abstract void Register(User user) ;//abstraction
    public void login(User user) {
        System.out.println(user.getName()+" hesabiniza daxil olundu!");
    }
    public void logOut(User user) {
        System.out.println(user.getName()+" hesabdan cixis etdiniz");
    }

}
