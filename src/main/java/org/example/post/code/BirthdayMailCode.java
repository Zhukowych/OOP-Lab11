package org.example.post.code;

import org.example.post.Client;

public class BirthdayMailCode implements MailCode {

    @Override
    public String getMessage(Client client) {
        return String.format("Happy birthday, %s!!!", client.getName());
    }

}
