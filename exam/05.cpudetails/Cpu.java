package EXAM;
import java.util.Scanner;

public class Cpu {
	double price;
	class Processor{
		double cores;
		String manufactures;
		double getCache(double c) {
			return c;
		}
	}
		static class RAM{
			double memory;
			String manufactures;
			double getClockSpeed(double s) {
				return s;
			}
		
		}
		public static void main(String[] args) {
			Scanner sc=new Scanner(System.in);
			Cpu cpu=new Cpu();
			Cpu.Processor processor=cpu.new Processor();
			Cpu.RAM ram=new Cpu.RAM();
			System.out.println("enter the cache :");
			double c=sc.nextDouble();
			System.out.println("enter the clock speed:");
			double s=sc.nextDouble();
			
			System.out.println("processor cache:"+processor.getCache(c));
			System.out.println("RAM clockspeed:"+ram.getClockSpeed(s));
			sc.close();
			
			
		}
		
	
	

}
