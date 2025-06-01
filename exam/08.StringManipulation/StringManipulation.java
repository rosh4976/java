package EXAM;

public class StringManipulation {
	public static void main (String [] args) {
		char arrsample[]= {'R','O','S','E'};
		String strsample1=new String(arrsample);
		System.out.println("length of "+ strsample1+" is:"+strsample1.length());
		byte ascii[]= {65,66,67,68,69,70};
		String strsample2=new String(ascii);
		System.out.println(strsample2+"\t");
		String strsample3=strsample1.concat(strsample2);
		System.out.println(strsample3+"\t");
		String strsample4=strsample1+strsample2;
		System.out.println(strsample4+"\t");
		System.out.println("third character of "+strsample4+"is "+strsample4.charAt(2));
		
		char buff[]=new char[3];
		strsample4.getChars(2, 5, buff, 0);
		System.out.println("extracted characters "+strsample4+ " "+new String(buff));
		
		String strsample="RockStar";
		System.out.println(strsample.compareTo("ROCKSTAR")+" ");
		System.out.println(strsample.compareToIgnoreCase("ROCKSTAR")+" ");
		System.out.println(strsample.equals("ROCKSTAR")+" ");
		System.out.println(strsample.equalsIgnoreCase("ROCKSTAR")+" ");
		
		System.out.println("Rockstar starts with 'ro' "+strsample.startsWith("Ro")+" ");
		System.out.println("rockstar ends with star "+strsample.endsWith("Star")+" ");
		
		System.out.println("rockstar contains tar "+strsample.contains("tar")+" ");
		
		System.out.println("index of t in rockstar:"+strsample.indexOf("t")+" ");
		System.out.println("index of star in rockstar:"+strsample.indexOf("Star")+" ");
		
		System.out.println("rockstar in all caps "+strsample.toUpperCase());
		System.out.println("rockstar in all lower case: "+strsample.toLowerCase());
		System.out.println("replace star in rockstar with et: "+strsample.replace("Star","et")+" ");
		
		String dval="3.456";
		int iVal=6;
		double a=Double.valueOf(dval);
		int b=Integer.valueOf(iVal);
		System.out.println("double value of"+dval+"="+a);
		System.out.println("integer value of" +iVal+"="+b);
		System.out.println(dval+"+"+iVal+"="+(a+b));
		
	}

}
