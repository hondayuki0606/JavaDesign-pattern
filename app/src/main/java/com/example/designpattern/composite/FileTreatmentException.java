package com.example.designpattern.composite;

public class FileTreatmentException extends RuntimeException{
    public FileTreatmentException(){

    }
    public FileTreatmentException(String msg){
        super(msg);
    }
}
