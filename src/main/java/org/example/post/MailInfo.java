package org.example.post;

import lombok.AllArgsConstructor;
import lombok.Getter;
import org.example.post.code.MailCode;

@Getter
@AllArgsConstructor
public class MailInfo {

    private Client client;
    private MailCode mailCode;

    public String getMessage() {
        return mailCode.getMessage(client);
    }

}
