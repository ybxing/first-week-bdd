package ngpanwei.bdd.stepdefs;

import bdd.Backlog;
import cucumber.api.PendingException;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class BacklogStepDefs {
    Backlog backlog = null ;
    @Before
    public void setup() {
        backlog = new Backlog() ;
    }
	@Given("^Backlog �� ����\"(.*?)\"$")
	public void backlog_��_����(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    Task newT
	}

	@Given("^Backlog�� ����\"(.*?)\"$")
	public void backlog��_����(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@When("^�����\"(.*?)\"$")
	public void �����(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@Then("^�����������\"(.*?)\"$")
	public void �����������(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

}