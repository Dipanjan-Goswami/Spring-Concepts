package com.interview.concepts.registry;

public interface ServiceRegistry {
	public <T> AdapterService<T> getService(String serviceType);
}
