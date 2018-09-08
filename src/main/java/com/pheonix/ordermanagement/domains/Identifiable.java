package com.pheonix.ordermanagement.domains;

public interface Identifiable extends org.springframework.hateoas.Identifiable<Long> {
	public void setId(Long id);

}
