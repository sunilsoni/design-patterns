package com.designpattern.factory.factory_method.message;

import lombok.EqualsAndHashCode;
import lombok.ToString;

/**
 * This class represents interface for our "product" which is a message
 * Implementations will be specific to content type.
 */
@EqualsAndHashCode
@ToString
public abstract class Message {

    public abstract String getContent();

    public void addDefaultHeaders() {
        //Adds some default headers
    }

    public void encrypt() {
        //# Has some code to encrypt the content
    }

}
