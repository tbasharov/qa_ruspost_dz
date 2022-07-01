package DZ_1;

public class User extends Man implements Loginable {
    private String login;
    private String password;
    private String company;

    public User(String name,String surname,int age,String login,String password,String company){
        super(name,surname,age);
        this.login=login;
        this.password=password;
        this.company=company;
    }

    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    public void Login() {
                             System.out.println("Авторизация с логином "+login+" с паролем "+ password);
    }

    @Override
    public void Say() {
        System.out.println("Я работаю "+company);
    }
}
