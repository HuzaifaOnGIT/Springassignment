package com.te.assignment.springcore;

import java.io.Serializable;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import lombok.Data;
    @Data
	public class Pet implements Serializable{

		@Autowired
		@Qualifier("dog")
		private Animal dog;
		
		@Autowired
		@Qualifier("cat1")
		private Animal cat;
		private String name;
		
}
