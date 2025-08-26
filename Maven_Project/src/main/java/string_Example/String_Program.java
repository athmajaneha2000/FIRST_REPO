package string_Example;

public class String_Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String s = "Hello ";
System.out.println(s);
String n = new String("HI");
System.out.println(n);
//length method
System.out.println(s.length());
//concat
System.out.println(s.concat("WORLD"));
//to uppercase()
System.out.println(s.toUpperCase());
//to lowercase()
System.out.println(s.toLowerCase());
String a ="";
//isEmpty()
System.out.println(s.isEmpty());
//contains()
String b = "how are you";
System.out.println(b.contains("where"));
System.out.println(s.contains(n));
//equals()
String c = "java";
String d = "java";
String e = "Java";
String f = "Selinium";
System.out.println(c.equals(d));
System.out.println(c.equals(e));
System.out.println(c.equals(f));
//equalIgnoreCase()
System.out.println(c.equalsIgnoreCase(e));
String g = new String("java");
System.out.println(c.equals(g));
System.out.println(c==g);
//valueOf()
int h = 2;
String i= String.valueOf(h);
System.out.println(i);
//charAt()
System.out.println(s.charAt(0));
	}


}
