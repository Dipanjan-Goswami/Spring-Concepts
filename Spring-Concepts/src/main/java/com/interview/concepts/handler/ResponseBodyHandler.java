package com.interview.concepts.handler;

import org.springframework.core.MethodParameter;
import org.springframework.http.MediaType;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.http.server.ServerHttpRequest;
import org.springframework.http.server.ServerHttpResponse;
import org.springframework.web.servlet.mvc.method.annotation.ResponseBodyAdvice;
import com.interview.concepts.Model.Student;

public class ResponseBodyHandler implements ResponseBodyAdvice<Student>{

	@Override
	public boolean supports(MethodParameter returnType, Class<? extends HttpMessageConverter<?>> converterType) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Student beforeBodyWrite(Student body, MethodParameter returnType, MediaType selectedContentType,
			Class<? extends HttpMessageConverter<?>> selectedConverterType, ServerHttpRequest request,
			ServerHttpResponse response) {
		// TODO Auto-generated method stub
		return null;
	}

}
