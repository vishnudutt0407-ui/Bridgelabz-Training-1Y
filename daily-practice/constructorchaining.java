public class constructorchaining{
	int id;
	String name;
	
	constructorchaining(){
		this(101,"vishnu");  // call perameterised constructor
		System.out.println("Default constructor called");
	}
	// perameterise constructor
	constructorchaining(int id ,String name){
		this.id = id;
		this.name =name;
		System.out.println("perametrised constructor called");
	}
	void display(){
		System.out.println(id+" "+name);
	}
	public static void main(String[] args){
		constructorchaining c =new constructorchaining();
		c.display();
	}
}
