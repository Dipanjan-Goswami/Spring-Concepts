package com.interview.concepts.registry;

public interface AdapterService<T> {
	
	public T process(T request);
}