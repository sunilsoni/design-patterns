package com.designpattern.factory.factory_method.message;

import lombok.EqualsAndHashCode;
import lombok.ToString;

@EqualsAndHashCode
@ToString
public class TextMessage extends Message {

    @Override
    public String getContent() {
        return "Text";
    }

}
