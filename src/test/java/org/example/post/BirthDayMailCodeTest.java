package org.example.post;

import org.example.post.code.BirthdayMailCode;
import org.junit.Assert;
import org.junit.Test;

public class BirthDayMailCodeTest extends MailCodeTest {

    @Test
    public void testBirthdayMailCode() {
        BirthdayMailCode mailCode = new BirthdayMailCode();
        Assert.assertEquals("Happy birthday, Test!!!", mailCode.getMessage(client));
    }

}
