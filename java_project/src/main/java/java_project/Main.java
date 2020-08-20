package java_project;

import org.apache.commons.lang3.StringUtils;

public class Main {

	public static void main(String[] args) {
		String str = null;
		boolean result = StringUtils.isEmpty(str);
		System.out.println("string is empty : " + result);
	}
}
