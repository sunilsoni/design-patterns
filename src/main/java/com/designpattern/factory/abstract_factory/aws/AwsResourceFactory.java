package com.designpattern.factory.abstract_factory.aws;


import com.designpattern.factory.abstract_factory.Instance;
import com.designpattern.factory.abstract_factory.ResourceFactory;
import com.designpattern.factory.abstract_factory.Storage;

//Factory implementation for Google cloud platform resources
public class AwsResourceFactory implements ResourceFactory {

	@Override
	public Instance createInstance(Instance.Capacity capacity) {
		return new Ec2Instance(capacity);
	}

	@Override
	public Storage createStorage(int capMib) {
		return new S3Storage(capMib);
	}


}
