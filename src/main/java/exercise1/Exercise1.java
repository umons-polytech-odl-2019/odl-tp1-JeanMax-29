package exercise1;

public class Exercise1 {
	static Person createPerson(String name, int age) {
		Person p = new Person (name,age);
		return p;
	}
	public static void main(String[] args) {
		Person p = new Person (args[0], Integer.parseInt(args[1]));
		System.out.println(p.getName() + " " + p.getAge());
	}
}
