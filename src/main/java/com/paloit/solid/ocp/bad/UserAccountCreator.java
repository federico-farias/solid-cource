package com.paloit.solid.ocp.bad;

public class UserAccountCreator {

    public MySQLAccountRepository mySQLAccountRepository;

    public void create() {
        // TODO
        mySQLAccountRepository.save(new ClassDummy());
    }

}

