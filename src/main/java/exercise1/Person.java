package exercise1;

class Person {
	private String name;
	private int age;

	Person(String n,int a){
		name = n;
		age = a;
	}
	public void setName(String n){
		name=n;
	}
	public void setAge(int a){
		age=a;
	}
	public String getName(){
		return name;
	}
	public int getAge(){
		return age;
	}
}
