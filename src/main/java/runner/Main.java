package runner;

import triangle.Triangle;

public class Main {


	public static void main(String[] args) {

		Triangle tr = new Triangle(2, 1, 4);
		System.out.println(tr.checkTriangle());
		System.out.println(tr.getMessage());
		System.out.println(tr.detectTriangle());
	}

}
