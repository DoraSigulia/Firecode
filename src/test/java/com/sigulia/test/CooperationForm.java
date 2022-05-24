package com.sigulia.test;

import com.sigulia.pages.CooperationFormPage;
import org.junit.jupiter.api.*;
import com.sigulia.helpers.TestBase;
import com.sigulia.utils.GenerateFakerData;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static io.qameta.allure.Allure.step;

@Tag("test")
public class CooperationForm extends TestBase {

    CooperationFormPage cooperationFormPage = new CooperationFormPage();
    GenerateFakerData faker = new GenerateFakerData();



    String  nameFile = "cute_cat.jpg";
    String  name = faker.expectedFullName,
            phone = faker.mobileNumber,
            email = faker.userEmail,
            nameCompany = faker.generatedString(),
            descriptionTask = faker.generatedString();



    @BeforeEach
    void stepOpenPage(){
        step("Открыть страницу Начать сотрудничество", () -> {
            cooperationFormPage.openPage();
        });
    }

    @Test
    @DisplayName("Отправка заявки без заполнения обязательных полей")
    void CooperationFormWithoutData() {
        step("Отправить заявку", () -> {
            cooperationFormPage.orderCooperation();
        });
        step("Проверка наличия ошибки", () -> {
            cooperationFormPage.verifyAlert("Заполните поля!");
        });
    }

    @Test
    @DisplayName("Добавить файл в заявку")
    void addFile() {
        step("Добавить файл в заявку", () -> {
            cooperationFormPage.addFile(nameFile);
        });
        step("Проверить добавление файла в заявку", () -> {
            cooperationFormPage.verifyAddedFile(nameFile);
        });
    }


    @ValueSource(strings = {
            "Тестирование",
            "Аутстафф (аренда)",
            "Заказная разработка"
    })

    @DisplayName("Заполнить форму заявки")
    @ParameterizedTest(name = "Название услуги {0}")
    void fillFormCooperation(String testData) {
        step("Заполнить заявку на услугу Тестирование", () -> {
            cooperationFormPage.clickService(testData)
                    .addDescriptionTask(descriptionTask)
                    .addFile(nameFile)
                    .addUsersData(name, phone, email, nameCompany);
        });
        step("Здесь была бы отправка заявки", () -> {
//            cooperationFormPage.orderCooperation();
        });
    }

    }