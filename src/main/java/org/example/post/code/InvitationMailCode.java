package org.example.post.code;

import org.example.post.Client;

public class InvitationMailCode implements MailCode{

    @Override
    public String getMessage(Client client) {
        return String.format("Dear, %s, We Invite you to out company!!!", client.getName());
    }

}
