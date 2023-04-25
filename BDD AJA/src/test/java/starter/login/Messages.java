package starter.login;

import net.thucydides.core.annotations.Step;

public class Messages {
    @Step("I am on the main LinkedIn page")
    public void onTheLinkedInPage(){
        System.out.println("I am on the main LinkedIn page");
    }
    @Step("I click the Messaging button")
    public void clickMessagingButton(){
        System.out.println("I click the Messaging button");
    }
    @Step("I entered the destination username")
    public void enterDestinationUsername(){
        System.out.println("I entered the destination username");
    }
    @Step("I typed the message, example Hello, how are you?")
    public void typeMessage(){
        System.out.println("I typed the message, example Hello, how are you?");
    }
    @Step("I clicked the Send button")
    public void clickSendButton(){
        System.out.println("I clicked the Send button");
    }
    @Step("I will see my message in the conversation with the destination user")
    public void seeMyMessage(){
        System.out.println("I will see my message in the conversation with the destination user");
    }
}