package com.designpattern.factory.abstract_factory;

import com.designpattern.factory.abstract_factory.aws.AwsResourceFactory;
import com.designpattern.factory.abstract_factory.gcp.GoogleResourceFactory;
import lombok.extern.slf4j.Slf4j;
import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.Timeout;

@Slf4j
public class AbstractFactoryTest {

    @Rule
    public Timeout globalTimeout = Timeout.seconds(10);

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
    public void awsResourceFactoryTest() {
        ResourceFactory awsResourceFactory = new AwsResourceFactory();
        factory = awsResourceFactory;
        Instance i1 = createServer(Instance.Capacity.micro, 20480);
        i1.start();
        i1.stop();
    }


    @Test
    public void googleResourceFactoryTest() {
        ResourceFactory googleResourceFactory = new GoogleResourceFactory();
        factory = googleResourceFactory;
        Instance i1 = createServer(Instance.Capacity.micro, 20480);
        i1.start();
        i1.stop();
    }

    public Instance createServer(Instance.Capacity cap, int storageMib) {
        Instance instance = factory.createInstance(cap);
        Storage storage = factory.createStorage(storageMib);
        instance.attachStorage(storage);
        return instance;
    }
}
