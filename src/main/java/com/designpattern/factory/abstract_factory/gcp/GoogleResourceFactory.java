package com.designpattern.factory.abstract_factory.gcp;

import com.designpattern.factory.abstract_factory.Instance;
import com.designpattern.factory.abstract_factory.ResourceFactory;
import com.designpattern.factory.abstract_factory.Storage;

//Factory implementation for Google cloud platform resources
public class GoogleResourceFactory implements ResourceFactory {

    @Override
    public Instance createInstance(Instance.Capacity capacity) {
        return new GoogleComputeEngineInstance(capacity);
    }

    @Override
    public Storage createStorage(int capMib) {
        return new GoogleCloudStorage(capMib);
    }


}
