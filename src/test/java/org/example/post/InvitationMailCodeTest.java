package org.example.post;

import org.example.post.code.InvitationMailCode;
import org.junit.Assert;
import org.junit.Test;

public class InvitationMailCodeTest extends MailCodeTest {

    @Test
    public void testIntivationMailCode() {
        InvitationMailCode mailCode = new InvitationMailCode();
        Assert.assertEquals("Dear, Test, We Invite you to out company!!!", mailCode.getMessage(client));
    }

}
