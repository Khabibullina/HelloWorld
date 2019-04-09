package hello;

public class Hello {
	
	    public boolean isBigger(int a, int b) {
	        return a > b;
	    }

	    public static void main(String[] args) {
	        System.out.println("Hello world!");

	        Hello main = new Hello();
	        System.out.println(main.isBigger(10, 5));
	    }
	}