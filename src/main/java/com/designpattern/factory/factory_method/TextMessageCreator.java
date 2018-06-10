package com.designpattern.factory.factory_method;


import com.designpattern.factory.factory_method.message.Message;
import com.designpattern.factory.factory_method.message.TextMessage;
import lombok.ToString;

/**
 * Provides implementation for creating Text messages
 */
@ToString
public class TextMessageCreator extends MessageCreator {

    @Override
    public Message createMessage() {
        return new TextMessage();
    }

}
