package org.example.post;

import org.junit.Assert;
import org.junit.Test;

public class ClientTest {

    @Test
    public void testClientCreation() {
        Client client = Client.builder()
                .name("Test")
                .email("test@gmail.com")
                .age(20)
                .sex("Male")
                .build();

        Assert.assertEquals(20, client.getAge());
        Assert.assertEquals("Test", client.getName());
        Assert.assertEquals("test@gmail.com", client.getEmail());
        Assert.assertEquals("Male", client.getSex());
    }


}
