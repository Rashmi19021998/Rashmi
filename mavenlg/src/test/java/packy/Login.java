package packy;

import java.util.List;
import java.util.Map;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Login {


	/*@Given("user enters username {string} in field")
	public void user_enters_username_in_field(String a) {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
		System.out.println("username:"+a);
	}

	@When("user enters password {int}")
	public void user_enters_password(int n) {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
		System.out.println("entered password:"+n);
	}

	@When("click on login button")
	public void click_on_login_button() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
		System.out.println("login clicked");
	}
	@Then("the homepage is displayed")
	public void the_homepage_is_displayed() {
	    // Write code here that turns the phrase above into concrete actions
	   System.out.println("Home page is displayed");
	}
	
	@Given("user enters {string} in the field")
	public void user_enters_in_the_field1(String string) {
	   System.out.println("username" +string);
	}

	@When("user enters {int} in the field")
	public void user_enters_in_the_field(int string) {
		 System.out.println("password" +string);
	    
	}*/
	@Given("user in home page")
	public void user_in_home_page() {
	    // Write code here that turns the phrase above into concrete actions
	   System.out.println("User IN homepage");
	}

	@When("user enters credentials")
	public void user_enters_credentials(io.cucumber.datatable.DataTable dt) {
		List<Map<String,String>> list=dt.asMaps();
		System.out.println(list.get(0).get("username"));
		System.out.println(list.get(0).get("password"));
	    // Write code here that turns the phrase above into concrete actions
	    // For automatic transformation, change DataTable to one of
	    // E, List<E>, List<List<E>>, List<Map<K,V>>, Map<K,V> or
	    // Map<K, List<V>>. E,K,V must be a String, Integer, Float,
	    // Double, Byte, Short, Long, BigInteger or BigDecimal.
	    //
	    // For other transformations you can register a DataTableType.
	    //throw new cucumber.api.PendingException();
	}

	@When("click on Login button")
	public void click_on_Login_button() {
	    // Write code here that turns the phrase above into concrete actions
	    System.out.println("Clicked on login");
	}

	@Then("home page is displayed")
	public void home_page_is_displayed() {
	    // Write code here that turns the phrase above into concrete actions
	  System.out.println("home page disp");
	}




}


	