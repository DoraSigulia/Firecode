package com.sigulia.test;

import org.aeonbits.owner.ConfigFactory;
import org.junit.jupiter.api.Test;
import com.sigulia.config.CredentialsConfig;

public class OwnerTest {
    CredentialsConfig config = ConfigFactory.create(CredentialsConfig.class);
    @Test
    void loginTest(){
        String login = config.login();
        String password = config.password();
        String selenoid = config.selenoid();

        System.out.println("Login: " + login + "\nPassword: " + password + "\nSelenoid address: " + selenoid);
    }


}

