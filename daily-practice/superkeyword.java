public class Person{
	int s =10;
	Person(){
		System.out.println("Person constructor called");
	}
	void show(){
		System.out.println("Person method  called");
	}

}
// child class
class employ extends Person{
	int c =20;
}