package com.calculator;

class TestMain<T> {
	T ob;
	TestMain(T o) {
		ob = o;
	}
	T getob() {
		return ob;
	}
}
class MySubclass<T,V> extends TestMain<T> {
	V ob2;
	MySubclass(T o, V o2) {
	    super(o);
	    ob2 = o2;
	  }

	  V getob2() {
	    return ob2;
	  }
}
class MyProduct<T,V,W> extends MySubclass<T,V> {
	W obj3;
	MyProduct(T t, V v, W w) {
		super(t,v);
		obj3 = w;
	}
	W getobj3() {
		return obj3;
	}
}
public class Main {
	  public static void main(String args[]) {
	    MySubclass<String, Integer> x = new MySubclass<String, Integer>("Value is: ", 99);
	    System.out.print(x.getob());
	    System.out.println(x.getob2());
	    
	    
	    MyProduct<String, Integer, String> x2 = new MyProduct<String, Integer, String>("Value is: ", 99, "Dummy DAta");
	    System.out.print(x2.getob());
	    System.out.println(x2.getob2());
	    System.out.println(x2.getobj3());
	    
	  }
	}