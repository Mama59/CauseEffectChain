package fr.univlille1.m2iagl.opl.causechaineffect.action.helper;

public class ValueFormatter {


	public static String format(Object object){
		
		return object.toString().replaceAll("\n", "").replaceAll("\\v", "");
	}

	public static String format(char c){
		return c + "";
	}

	public static String format(short s){
		return s + "";
	}

	public static String format(int i){
		return i + "";
	}

	public static String format(long l){
		return l + "";
	}

	public static String format(float f){
		return f + "";
	}

	public static String format(double d){
		return d + "";
	}


}
