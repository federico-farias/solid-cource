package com.paloit.solid.isp.bad.exp02.ownimpl;

public class UserAccountCreator {

    public IUserService iUserService;

    public IXProviderNotificationService notificationService;

    public UserAccountCreator(IUserService iUserService, IXProviderNotificationService notificationService) {
        this.iUserService = iUserService;
        this.notificationService = notificationService;
    }

    public void create(UserInfo user) {
        iUserService.create(user);
        notificationService.sendMessage(user.getEmail(), "Mi mensaje", null);
    }

}

