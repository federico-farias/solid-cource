package com.paloit.solid.ocp.good.op1;

public class UserAccountCreator {

    public UserAccountRepository userAccountRepository;

    public UserAccountCreator(UserAccountRepository userAccountRepository) {
        this.userAccountRepository = userAccountRepository;
    }

    public void create(ClassDummy request) {
        // TODO
        userAccountRepository.save(request);
    }

}

