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
	@Given("^Backlog 有 任务\"(.*?)\"$")
	public void backlog_有_任务(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    Task newT
	}

	@Given("^Backlog有 任务\"(.*?)\"$")
	public void backlog有_任务(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@When("^我完成\"(.*?)\"$")
	public void 我完成(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@Then("^问完成任务是\"(.*?)\"$")
	public void 问完成任务是(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

}
