package com.securevault.exceptions;
import com.securevault.exceptions.InvalidValueException;

public class InvalidValueException extends Exception{
	public InvalidValueException(String message){
		super(message);
	}
}
