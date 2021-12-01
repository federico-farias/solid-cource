package com.paloit.solid.isp.bad.exp02.ownimpl;

import java.util.List;

public interface IXProviderNotificationService {

    void sendMessage(String email, String content, String otherData);

    void sendMultiMessage(List<String> emails, String content);

    int getNumberMessagesDelivered();

    XMailInfoResponse getLastMessage();

}
