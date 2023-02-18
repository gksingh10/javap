package core_java;

































public class Extra_function {
//	public static void Binary_covert(int x) {
	public static String Binary_covert(int x) {
	int count=0;
	for(int b=x;b>0;) {
	//int b=x%2;
		b=b/2;
		count++;
	}
	int []rem=new int[count];
	int[]nrem=new int[count];nrem[0]=0;
	int i=0;
	for(;x>0;) {
		rem[i]=x%2;
		x=x/2;
		++i;
	}
	int j=0;int k=rem.length-1;
	String val="";
	while(k>=0) {
		nrem[j]=rem[k];
		val=val+""+nrem[j];
//		System.out.print(nrem[j]);
		++j;--k;
	}
	//int p=0;
//	for(int p:nrem) {
//		val=val+" "+nrem[p];
//	}
	return val;
}
}
