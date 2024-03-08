package simple;



public class OOP {
    public static void main(String[] args){
        System.out.println("Hello world!");
        User u=new User();
        u.set_name("Shihab Uddin");
        u.set_membership(User.Membership.Gold);

        System.out.println(u.get_name());
        System.out.println(u.get_membership());

    }
}
