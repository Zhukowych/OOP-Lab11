package org.example.post;

import lombok.Getter;

import java.util.List;

public class MailBox {

    private List<MailInfo> infos;
    @Getter
    private MailSender mailSender;

    public MailBox(MailSender mailSender) {
        this.mailSender = mailSender;
    }

    public void addMailInfo(MailInfo mailInfo) {
        this.infos.add(mailInfo);
    }

    public void sendAll() {
        for (MailInfo mailInfo : infos) {
            this.mailSender.sendMail(mailInfo);
        }
    }

}
