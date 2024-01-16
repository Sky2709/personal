package LLD_DesignPattern.builder;

public class client {
    public static void main(String[] args) {
        User user= new User.UserBuilder()
                .setName("Akash")
                .setAge(24)
                .setEmail("xyzakash.gupta@gmail.com")
                .setPhone(893585)
                .setUnivName("Patna University")
                .setAddress("Muzaffarpur")
                .build();

        System.out.println(user);
    }
}
