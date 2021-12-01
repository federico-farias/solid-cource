package com.paloit.solid.isp.bad.exp01;

public class UserAccountCreator {

    public IMandrilNotificationService iMandrilNotificationService;

    public IRedisCacheSerivce iRedisCacheSerivce;

    public iUserAccountService iMySqlUserAccountService;

    public IPersistenceProvider iPersistenceProvider;

    public void create() {
        // TODO
        iMandrilNotificationService.sendEmailAccountCreated("account@domain.com");
        iRedisCacheSerivce.record(new ClassDummy());
        iMySqlUserAccountService.save(new ClassDummy());
        iPersistenceProvider.headerInterface("Value of provider 1", "Value of provider 2");
    }

}

