import com.github.javafaker.Faker;
import io.restassured.path.json.JsonPath;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.*;

import static io.restassured.RestAssured.given;
import static org.testng.AssertJUnit.assertEquals;

public class BankTest extends BaseTest {
    @Test
    public void getNames(){
        response = given().get(url+"user");
        JsonPath jsonPath = response.jsonPath();
        System.out.println(jsonPath.getString("name"));
        Assert.assertEquals(response.getStatusCode(),200);
    }
    @Test
    public void deleteUsers(){
        response = given().delete(url+"user");
        JsonPath jsonPath = response.jsonPath();
        System.out.println(jsonPath.getString("name"));
        //esta saliendo en null en consola pero el codigo que esta saliendo es 400
        Assert.assertEquals(response.getStatusCode(),204);
    }
    private UserPojo generateRandomUserData() {
        Faker faker = new Faker();
        UserPojo user = new UserPojo();
        // Genera datos aleatorios
        user.setName(faker.name().firstName());
        user.setEmail(faker.internet().emailAddress());
        user.setBalance(faker.number().randomNumber(4, true));
        user.setAccountNumber(faker.number().randomNumber(5,true));
        return user;
    }
    @Test
    public void postRandomUsers(){
        response = given()
                .contentType(url)
                .body(generateRandomUserData())
                .when()
                .post();
    }
    @Test
    public void noDuplicatedEmails(){
        response = given().get(url+"user");
        JsonPath jsonPath = response.jsonPath();
        List<String> emailList = jsonPath.getList("email");
        Set<String> emailSet = new HashSet<>(emailList);
        Assert.assertEquals(emailList.size(),emailSet.size(),"La lista contiene elementos duplicados.");
    }
    @Test
    public void updateExistingAccountNumber(){
        response = given().get(url+"user");
        JsonPath jsonPath = response.jsonPath();
        List<String> emailList = jsonPath.getList("email");
        Set<String> emailSet = new HashSet<>(emailList);
        Assert.assertEquals(emailList.size(),emailSet.size(),"La lista contiene elementos duplicados.");
    }
    @Test
    public void updateUserDataWithPut() {
        // Datos actualizados del usuario
        String updatedUserData = "{\"Rosemary Kilback\": \"53960.13\", \"Charlie.Cassin@hotmail.com\": \"00001\"}";

        // Realiza la solicitud PUT para actualizar los datos del usuario
        response = given()
                .contentType(url+"user")
                .body(updatedUserData)
                .when()
                .put(url);

        // Verifica el código de estado
        assertEquals(200, response.getStatusCode()); // Código 200 indica éxito
    }
}
