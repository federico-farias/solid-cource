package com.paloit.solid.isp.good.ownimpl.impl;

import com.paloit.solid.isp.good.externallib.XProviderNotificationService;
import com.paloit.solid.isp.good.ownimpl.EmailSender;

public class EmailSenderXProviderImpl implements EmailSender {

    private XProviderNotificationService service;

    @Override
    public void send(String email, String content) {
        service.sendMessage(email, content, null);
    }

}
