package core_java;

public class Operators {
	static int a=15,b=5;				//instance variable(doesn't get memory at compile time. It gets memory at runtime when an object or instance is created)
	
 static void operator() {
//		Unary Operator
//	int a=10,b=a;											//local variable
//	System.out.println("a=\t"+a+	"\tb=\t"+b+"\n"+
//			"a=\t"+(b=++a)+			"\tb=\t"+(b=a++)+"\n"+
//			"a=\t"+(b=--a)+			"\tb=\t"+(b=a--)+"\n"
//			);
	
//	Arithmetic Operator
//	int add,sub,mul,div,mod;
//	System.out.println(
//			"add="+	(add=a+b)+      "\t"+
//					"sub="+(sub=a-b)+		"\t"+
//					"mul="+(mul=a*b)+		"\t"+
//					"div="+(div=a/b)+		"\t"+
//					"mod="+(mod=a%b));
//	
//	Shift Operator			
//	 int val=100,val1,val2;		//binary value is 1010
//	 System.out.println(val+"\t\t"+Extra_function.Binary_covert(val));
//	 System.out.println(( val1=(val>>2))+"\t\t"+Extra_function.Binary_covert(val1));   //right shift
//	 System.out.println(( val2=(val<<2))+"\t\t"+Extra_function.Binary_covert(val2));    //left shift
//	
	 
//	 Relational operator
	 System.out.println(a>b);
	 System.out.println(a<b);
	 System.out.println(a>=b);
	 System.out.println(a<=b);
	 System.out.println(a==b);
	 System.out.println(a!=b);
	 System.out.println(a instanceof Operators);
}
}
