import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import org.testng.Assert;
import org.testng.annotations.Test;

public class BankTest extends BaseTest {
    @Test
    public void getNames(){
        response = RestAssured.given().get(url+"user");
        JsonPath jsonPath = response.jsonPath();
        System.out.println(jsonPath.getString("name"));
        Assert.assertEquals(response.getStatusCode(),200);
    }
    @Test
    public void deleteUsers(){
        response = RestAssured.given().delete(url+"user");
        JsonPath jsonPath = response.jsonPath();
        System.out.println(jsonPath.getString("name"));
        Assert.assertEquals(response.getStatusCode(),204);
        UserPojo userPojo = new UserPojo();
        userPojo.
    }
}
