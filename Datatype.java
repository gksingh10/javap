package core_java;

public class Datatype {
static void datatype() {
	
//	/*
	 int a;
	float b;
	String c;
	Boolean d;
	byte by;
	short s;
	char ch;
	long l;
	double db;
//	 */		//		default value	size
	
//	int a;			0				4 byte	
//	float b;		0.0f			4 byte
//	String c;		
//	Boolean d;		false			1 bit
//	byte by;		0				1 byte
//	short s;		0				2 byte
//	char ch;		'\u0000'		2 byte       It is because java uses Unicode system not ASCII code system. The \u0000 is the lowest range of Unicode system.
//	long l;			0L				8 byte
//	double db;		0.0d			8 byte
	
//	a=10,b=20,c="ram",d=true,by=10,s=25,ch='c',l=50,db=25;
	a=10;b=20;c="ram";d=true;by=10;s=25;ch='c';l=50l;db=25.6d;
	
	System.out.println("int\t \\\\"+a+"\nfloat\t \\\\"+b+"\nString\t \\\\"+c+"\nBoolean\t \\\\"+ d+"\nbyte\t \\\\"+ by +
		"\nshort\t \\\\"+s+"\ncharector\t \\\\"+ch+"\nlong\t \\\\"+l+"\ndouble \t \\\\"+db);
	
	//a=10;b=20;c="ram";d=true;by=10;s=25;ch='c';l=50;db=25;
	
}
}
