package MODULE1;

public class CPU {

	double price;
	class processor{
		double cores;
		String manufacturer;
		double getCache(double f) {
			return f;}}
	static class RAM{
		double memory;
		String manufacturer;
		double getClockSpeed(double r) {
			return r;}}}

	
	
		



package MODULE1;

import java.util.Scanner;

public class CPUDetails{
	public static void main(String[] args) {
		double p,m;
		Scanner s=new Scanner(System.in);
		System.out.println("enter the cache of processor ");
		p=s.nextDouble();
		System.out.println("enter the clock speed ");
		m=s.nextDouble();
		CPU cpu=new CPU();
		CPU.processor processor=cpu.new processor();
		CPU.RAM ram=new CPU.RAM();
		System.out.println("processor Cache="+processor.getCache(p));
		System.out.println("RAM Clock speed="+ram.getClockSpeed(m));
	}
}

	
	
