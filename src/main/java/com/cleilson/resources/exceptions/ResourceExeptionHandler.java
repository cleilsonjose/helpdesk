package com.cleilson.resources.exceptions;

import javax.servlet.http.HttpServletRequest;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.cleilson.services.exceptions.ObjectNotFoundException;

@ControllerAdvice
public class ResourceExeptionHandler {
	
	@ExceptionHandler(ObjectNotFoundException.class)
	public ResponseEntity<StanderdError> objectNotFoundException(ObjectNotFoundException ex, 
			HttpServletRequest request){
		
		StanderdError error =  new StanderdError(System.currentTimeMillis(), HttpStatus.NOT_FOUND.value(), 
				"Not Found!", ex.getMessage(), request.getRequestURI());
		
		return ResponseEntity.status(HttpStatus.NOT_FOUND).body(error);
	}
}
