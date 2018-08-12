package com.designpattern.decorator;

import com.designpattern.Fixtures;
import com.designpattern.factory.abstract_factory.ResourceFactory;
import lombok.extern.slf4j.Slf4j;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

@Slf4j
public class Base64EncodedMessageTest {

    long start;

    private ResourceFactory factory;

    @Before
    public void start() {
        start = System.currentTimeMillis();
    }

    @After
    public void end() {
        log.info("Total Time took in milliseconds: {}", (System.currentTimeMillis() - start));
    }

    @Test
    public void getContentTest() {
        com.designpattern.decorator.Message m = new TextMessage(Fixtures.TEXT_MESSAGE);
        com.designpattern.decorator.Message decorator = new HtmlEncodedMessage(m);

        decorator = new Base64EncodedMessage(decorator);
        String actual = decorator.getContent();

        Assert.assertEquals(Fixtures.BASE64_TEXT_MESSAGE, actual);
    }
}