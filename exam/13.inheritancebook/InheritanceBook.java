package EXAM;
class Publishers{
	String publisher;
	Publishers(String publi)
	{
	  this.publisher=publi;
	}
}
class Book{
	String name;
	Publishers publisher;
	public Book(String name,Publishers publisher) {
		this.name=name;
		this.publisher=publisher;
	}
}
class Literature extends Book{
	String lit_type="literature";
	Literature(String name,Publishers publisher){
		super(name,publisher);
		
	}void display(){
		System.out.println("name: "+super.name);
		System.out.println("type : "+this.lit_type);
		System.out.println("publisher : "+this.publisher.publisher);
		
		
	}
}
class Fiction extends Book{
	String lit_type="fiction";
	Fiction(String name,Publishers publisher){
		super(name,publisher);
		
	}void display(){
		System.out.println("name: "+super.name);
		System.out.println("type : "+this.lit_type);
		System.out.println("publisher : "+this.publisher.publisher);
		
		
	}
}

public class InheritanceBook {
	public static void main(String[] args) {
		Publishers lp=new Publishers("s.chand");
		Literature l=new Literature("as you like it",lp);
		l.display();
		System.out.println(".................");
		Publishers fp=new Publishers("tata mcGraw hill");
		Fiction f=new Fiction("tempest",fp);
		f.display();
		
	}

}
