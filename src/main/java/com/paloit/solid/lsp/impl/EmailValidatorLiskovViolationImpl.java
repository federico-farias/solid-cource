package com.paloit.solid.lsp.impl;

import com.paloit.solid.lsp.UserAcountValidator;
import com.paloit.solid.lsp.UserAccountInfo;

public class EmailValidatorLiskovViolationImpl implements UserAcountValidator {

    @Override
    public void validate(UserAccountInfo user) {
        // TODO: Código espagueti
        user.setEmail("email-mutado@domain.com"); // Por accidente el objeto es mutado.
    }

}
