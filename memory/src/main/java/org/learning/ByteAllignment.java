package org.learning;

import org.openjdk.jol.info.ClassLayout;

public class ByteAllignment {
	public static void main(String[] args) {
//		System.out.println(ClassLayout.parseInstance("a").toPrintable());
		String s = "hello";
		System.out.println(ClassLayout.parseInstance(s).toPrintable());
		String a = "a";
		System.out.println(ClassLayout.parseInstance(a).toPrintable());
	}
}
