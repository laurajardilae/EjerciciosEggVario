import lombok.Data;
@Data //anotacion de lombok para generar automaticamente getters y setters
public class UserPojo {

    public String name;
    public float balance;
    public String email;
    public long accountNumber;

    public UserPojo() {
    }
    public UserPojo(String name, float balance, String email,int accountNumber) {
        this.name = name;
        this.balance = balance;
        this.email = email;
        this.accountNumber = accountNumber;
    }

}
