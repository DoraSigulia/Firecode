package com.sigulia.pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;

public class CooperationFormPage {

    // locators
    SelenideElement buttonStartCooperation = $(".btn_order"),
                    namePage = $("h1"),
                    buttonService = $(".frm_order"),
                    buttonOrder = $(byText("Отправить заявку")),
                    alertImage = $(".frm_alert"),
                    buttonFile = $(".order-fileinp"),
                    textClientWishes = $(".client_wishes"),
                    textName = $(".order-boxinput-name"),
                    textPhone = $(".order-boxinput-phone"),
                    textEmail = $(".order-boxinput-mail"),
                    textCompany = $(".order-boxinput-mail"),
                    formAlert = $(".boxMsg"),
                    textAddedFile = $(".line_order_file");

    // actions

    public CooperationFormPage openPage(){
        open("https://firecode.ru/");
        buttonStartCooperation.click();

        return this;
    }

    public CooperationFormPage orderCooperation(){
        buttonOrder.scrollTo();
        buttonOrder.click();

        return this;
    }

    public CooperationFormPage addFile(String nameFile){
        buttonFile.uploadFromClasspath(nameFile);

        return this;
    }

    public CooperationFormPage clickService(String service){
        buttonService.$(byText(service)).click();

        return this;
    }

    public CooperationFormPage addDescriptionTask(String value){
        textClientWishes.sendKeys(value);

        return this;
    }

    public CooperationFormPage addUsersData(String name,String phone, String email, String company){
        textName.setValue(name);
        textEmail.setValue(email);
        textPhone.setValue(phone);
        textCompany.setValue(company);

        return this;
    }


    public CooperationFormPage verifyAlert(String textAlert){
        formAlert.shouldHave(Condition.text(textAlert));

        return this;
    }

    public CooperationFormPage verifyAddedFile(String nameFile){
        textAddedFile.shouldHave(Condition.text(nameFile));

        return this;
    }

}
