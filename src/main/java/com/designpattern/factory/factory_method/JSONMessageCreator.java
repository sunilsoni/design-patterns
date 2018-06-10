package com.designpattern.factory.factory_method;


import com.designpattern.factory.factory_method.message.JSONMessage;
import com.designpattern.factory.factory_method.message.Message;

/**
 * Provides implementation for creating JSON messages
 */
public class JSONMessageCreator extends MessageCreator {

    @Override
    public Message createMessage() {
        return new JSONMessage();
    }


}
