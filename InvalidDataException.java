package com.customerror;

public class InvalidDataException extends Exception{
	    public InvalidDataException(String msg){
	        super(msg);
	        System.out.println("InvalidDataException:"+msg);
	    }
	}

