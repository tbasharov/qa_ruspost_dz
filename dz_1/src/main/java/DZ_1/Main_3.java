package DZ_1;

public class Main_3 {
    public static void main(String[] args){
        User user=new User("Adam","Smith",26,"asmith","qwerty/12","Kaspersky");
        user.Login();
        System.out.println(user.toString());
        user.Say();
    }
}
