package LLD_DesignPattern.builder;

public class User {
    private final String name;
    private final int age;
    private final String email;
    private final long phone;
    private final String univName;
    private final String address;

    @Override
    public String toString() {
        return this.name + " : "
                + this.age + " : "
                + this.email + " : "
                + this.phone + " : "
                + this.univName + " : "
                + this.address;
    }

    private User(UserBuilder builder){
        this.name= builder.name;
        this.age= builder.age;
        this.email= builder.email;
        this.phone= builder.phone;
        this.univName= builder.univName;
        this.address= builder.address;


    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getEmail() {
        return email;
    }

    public long getPhone() {
        return phone;
    }

    public String getUnivName() {
        return univName;
    }

    public String getAddress() {
        return address;
    }

    static class UserBuilder{
        private String name;
        private int age;
        private String email;
        private long phone;
        private String univName;
        private String address;

        public UserBuilder(){}

        public UserBuilder setName(String name) {
            this.name = name;
            return this;
        }

        public UserBuilder setAge(int age) {
            this.age = age;
            return this;
        }

        public UserBuilder setEmail(String email) {
            this.email = email;
            return this;
        }

        public UserBuilder setPhone(long phone) {
            this.phone = phone;
            return this;
        }

        public UserBuilder setUnivName(String univName) {
            this.univName = univName;
            return this;
        }

        public UserBuilder setAddress(String address) {
            this.address = address;
            return this;
        }

        public User build(){
            User user= new User(this);
            return user;
        }
    }
}
