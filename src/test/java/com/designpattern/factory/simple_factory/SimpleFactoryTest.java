package com.designpattern.factory.simple_factory;

import com.designpattern.factory.abstract_factory.ResourceFactory;
import lombok.extern.slf4j.Slf4j;
import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.Timeout;

@Slf4j
public class SimpleFactoryTest {
    @Rule
    public Timeout globalTimeout = Timeout.seconds(5);

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
    public void createPostBlogTest() {
        Post post = PostFactory.createPost("blog");
    }

    @Test
    public void createPostNewsTest() {
        Post post = PostFactory.createPost("news");
    }

    @Test
    public void createPostProductTest() {
        Post post = PostFactory.createPost("product");
    }
}