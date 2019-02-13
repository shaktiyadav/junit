package com.calculator;

public class MFoo<T> {
  private T t;
  public void setValue(T t) {
	  this.t = t;
  }
  public T getValue(){
	  return this.t;
  }
} 
