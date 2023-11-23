import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Steps {
    int num1,num2,num3;
    @Given("dado un num")
    public void dadoUnNum() {
        this.num1 = 1;
    }

    @When("se suma a otro")
    public void seSumaAOtro() {
        this.num2 = 2;
        this.num3 = this.num1 + this.num2;
    }

    @Then("suma en total")
    public void sumaEnTotal() {
        if (num3==3){
            System.out.println("suma correcta");
        }else {
            System.out.println("suma incorrecta");
        }
    }

    @When("se resta otro")
    public void seRestaOtro() {
        this.num2 = 2;
        this.num3 = this.num1 - this.num2;
    }

    @Then("resta en total")
    public void restaEnTotal() {
        if (num3==-1){
            System.out.println("resta correcta");
        }else {
            System.out.println("resta incorrecta");
        }
    }
}
