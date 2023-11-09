import lombok.Data;

public class UserPojo {

    public String name;
    public float balance;
    public String email;

    public UserPojo() {
    }
    @Data
    public UserPojo(String name, float balance, String email) {
        this.name = name;
        this.balance = balance;
        this.email = email;
    }

}
