package starter.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.login.Messages;

public class MessagesSteps {
    @Steps
    Messages login;
    @Given("I am on the main LinkedIn page")
    public void onTheLinkedInPage(){
        login.onTheLinkedInPage();
    }
    @When("I click the Messaging button")
    public void clickMessagingButton(){
        login.clickMessagingButton();
    }
    @And("I entered the destination username")
    public void enterDestinationUsername(){login.enterDestinationUsername();}
    @And("I typed the message, example Hello, how are you?")
    public void typeMessage(){
        login.typeMessage();
    }
    @And("I clicked the Send button")
    public void clickSendButton(){
        login.clickSendButton();
    }
    @Then("I will see my message in the conversation with the destination user")
    public void seeMyMessage(){
        login.seeMyMessage();
    }
}
