package com.paloit.solid.lsp.impl;

import com.paloit.solid.lsp.UserAcountValidator;
import com.paloit.solid.lsp.EmailMalformedException;
import com.paloit.solid.lsp.UserAccountInfo;

public class EmailValidatorLiskovOkImpl implements UserAcountValidator {

    @Override
    public void validate(final UserAccountInfo user) {
        String[] tokens = user.getEmail().split("[@]");
        if (tokens.length != 2 || !tokens[1].contains(".")) {
            throw new EmailMalformedException("Email no valido: " + user.getEmail());
        }
    }

}
