package com.designpattern.decorator;

import com.designpattern.Fixtures;
import com.designpattern.factory.abstract_factory.ResourceFactory;
import lombok.extern.slf4j.Slf4j;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

@Slf4j
public class HtmlEncodedMessageTest {


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
        com.designpattern.decorator.Message m = new TextMessage(Fixtures.HTML_TEXT_MESSAGE);

        com.designpattern.decorator.Message decorator = new HtmlEncodedMessage(m);

        String actual = decorator.getContent();

        String expected = "&lt;a href=&quot;sms://+14035550185?body=I%27m%20interested%20in%20your%20product.%20Please%20contact%20me.&quot;&gt;Send a SMS message&lt;/a&gt;";
        Assert.assertEquals(expected, actual);
    }
}