package com.designpattern.factory.factory_method;


import com.designpattern.factory.factory_method.message.Message;
import com.designpattern.factory.factory_method.message.TextMessage;

/**
 * Provides implementation for creating Text messages
 */
public class TextMessageCreator extends MessageCreator {

    @Override
    public Message createMessage() {
        return new TextMessage();
    }

}
