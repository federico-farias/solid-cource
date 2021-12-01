package com.paloit.solid.lsp;

import com.paloit.solid.lsp.impl.EmailValidatorLiskovOkImpl;
import com.paloit.solid.lsp.impl.EmailValidatorLiskovViolationImpl;
import com.paloit.solid.lsp.impl.UserAccountRepositoryMySQLImpl;
import org.junit.jupiter.api.Test;

public class UserCreatorUseCaseTest {

    @Test
    public void processTest() {
        UserAccountInfo userinfo = new UserAccountInfo("ffarias@domain.com");

        UserAcountValidator validator =
                new EmailValidatorLiskovOkImpl();
                //new EmailValidatorLiskovViolationImpl();

        UserCreatorUseCase userCreator = new UserCreatorUseCase(
                new UserAccountRepositoryMySQLImpl(),
                validator
        );

        userCreator.create(userinfo);

        System.out.println(userinfo);
    }

}