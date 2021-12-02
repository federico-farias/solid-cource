package com.paloit.solid.isp.bad.exp02.ownimpl;

public class UserAccountCreator {

    public IUserService iUserService;

    // Refleja detalles de implementación (Refleja que utiliza al proveedor X)
    public IXProviderNotificationService notificationService;

    public UserAccountCreator(IUserService iUserService, IXProviderNotificationService notificationService) {
        this.iUserService = iUserService;
        this.notificationService = notificationService;
    }

    public void create(UserInfo user) {
        iUserService.create(user);

        // Refleja que el proveedor requiere del tercer parametro, pero el cliente no lo necesita.
        notificationService.sendMessage(user.getEmail(), "Mi mensaje", null);
    }

}

