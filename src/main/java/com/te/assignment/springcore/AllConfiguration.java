package com.te.assignment.springcore;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Import({AnimalConfiguration.class,PetConfiguration.class})
public class AllConfiguration {

}