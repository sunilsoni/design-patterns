package com.designpattern.factory.factory_method;

import com.designpattern.factory.abstract_factory.ResourceFactory;
import com.designpattern.factory.factory_method.message.Message;
import lombok.extern.slf4j.Slf4j;
import org.junit.*;
import org.junit.rules.Timeout;

@Slf4j
public class FactoryMethodTest {

    @Rule
    public Timeout globalTimeout = Timeout.seconds(10);
    long start;
    private ResourceFactory factory;

    @BeforeClass
    public static void setup() {

    }

    @Before
    public void start() {
        start = System.currentTimeMillis();
    }

    @After
    public void end() {
        log.info("Total Time took in milliseconds: {}", (System.currentTimeMillis() - start));
    }

    @Test
    public void jsonMessageCreatorTest() {
        MessageCreator creator = new JSONMessageCreator();
        Message msg = creator.getMessage();

        Assert.assertEquals("{\"JSON]\":[]}", msg.getContent());
    }

    @Test
    public void textMessageCreatorTest() {
        MessageCreator creator = new TextMessageCreator();
        Message msg = creator.getMessage();
        Assert.assertEquals("Text", msg.getContent());
    }
}