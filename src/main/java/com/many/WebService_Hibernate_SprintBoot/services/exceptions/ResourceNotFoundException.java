package com.many.WebService_Hibernate_SprintBoot.services.exceptions;

public class ResourceNotFoundException extends RuntimeException {
	private static final long serialVersionUID = 1L;
	
	public ResourceNotFoundException(Object id) {
		super("Resource not found. id " + id);
	}
	
}
