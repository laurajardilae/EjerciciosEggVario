import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import java.net.URL;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static io.restassured.RestAssured.given;

public class ServicesTest extends BaseTest {

    @Test
    public void getPeople(){
        response = RestAssured.given().get(url+"people/2/");
        JsonPath jsonPath = response.jsonPath();
        Assert.assertEquals(response.getStatusCode(),200);
        Assert.assertEquals(jsonPath.getString("skin_color"),"gold");
        Assert.assertEquals(jsonPath.getList("films").size(),6);
    }
    @Test
    public void getFilm(){//segunda pelicula de people 2
        response = RestAssured.given().get(url+"people/2/");
        JsonPath jsonPath = response.jsonPath();
        String filmUrl = jsonPath.getList("films").get(1).toString(); //la lista de films esta por url
        response = RestAssured.given().get(filmUrl);
        jsonPath = response.jsonPath();
        String date = jsonPath.getString("release_date");
        //verifico el formato de la release date
        String regex = "^(\\d{4})-(0[1-9]|1[0-2])-(0[1-9]|[12][0-9]|3[01])$"; //expresion regular para aaaa-mm-dd
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(date);
        Assert.assertTrue(matcher.matches());
        /*
        the response to include characters, planets, starships, vehicles and species, each element including more than 1 element.
         */
        Assert.assertTrue(jsonPath.getList("characters").size()>1);
        Assert.assertTrue(jsonPath.getList("planets").size()>1);
        Assert.assertTrue(jsonPath.getList("starships").size()>1);
        Assert.assertTrue(jsonPath.getList("vehicles").size()>1);
        Assert.assertTrue(jsonPath.getList("species").size()>1);
    }
    @Test
    public void getPlanet() {//primer planeta de la ultima pelicula
        response = RestAssured.given().get(url + "people/2/");
        JsonPath jsonPath = response.jsonPath();

        int filmSize = jsonPath.getList("films").size();
        String filmUrl = jsonPath.getList("films").get(filmSize - 1).toString();
        System.out.println(filmUrl);
        response = RestAssured.given().get(filmUrl);
        jsonPath = response.jsonPath();

        String planetUrl = jsonPath.getList("planets").get(0).toString();
        response = RestAssured.given().get(planetUrl);
        System.out.println(planetUrl);
        jsonPath = response.jsonPath();

        Assert.assertEquals(jsonPath.get("gravity"), "1 standard");
        Assert.assertEquals(jsonPath.get("terrain"), "desert");

        //On the same response from the planet, grab the url element on the response, and request it. Validate the response being exactly the same from the previous one.;
        Assert.assertEquals(jsonPath.get("url"),planetUrl);
    }
    @Test
    public void film7notFound(){
        response = RestAssured.given().get(url+"film/7/");
        JsonPath jsonPath = response.jsonPath();
        Assert.assertEquals(response.getStatusCode(),404);

    }
}
