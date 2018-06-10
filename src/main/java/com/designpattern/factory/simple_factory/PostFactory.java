package com.designpattern.factory.simple_factory;

import lombok.EqualsAndHashCode;
import lombok.ToString;

/**
 * This class acts as a simple factory for creation of
 * different posts on web site.
 */
@EqualsAndHashCode
@ToString
public class PostFactory {

    public static Post createPost(String type) {
        switch (type) {
            case "blog":
                return new BlogPost();
            case "news":
                return new NewsPost();
            case "product":
                return new ProductPost();
            default:
                throw new IllegalArgumentException("Post type is unown");
        }
    }

}
