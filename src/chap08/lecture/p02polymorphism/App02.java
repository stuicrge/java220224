package chap08.lecture.p02polymorphism;

import java.io.Closeable;
import java.io.Serializable;
import java.util.Iterator;
import java.util.Scanner;

public class App02 {
	public static void main(String[] args) {
		String str = "java";
		Object o1 = str;
		Serializable s1 = str;
		CharSequence c1 = str;
		Comparable<String> com1 = str;
		
		Serializable s2 = "spring";
		CharSequence c2 = "Hello";
		Comparable<String> com2="jsp";
		
		//Scanner
		Scanner scanner = new Scanner("");
		Object o2 = scanner;
		Closeable C1 = scanner;
		AutoCloseable AC = scanner;
		Iterator<String> iter = scanner;
	}
}
