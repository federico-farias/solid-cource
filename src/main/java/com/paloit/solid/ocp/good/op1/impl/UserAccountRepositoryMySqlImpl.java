package com.paloit.solid.ocp.good.op1.impl;

import com.paloit.solid.ocp.good.op1.UserAccountRepository;

public class UserAccountRepositoryMySqlImpl implements UserAccountRepository {

    @Override
    public void save(Object obj) {
        // TODO
        System.out.println("Implementación MySQL");
    }

}
