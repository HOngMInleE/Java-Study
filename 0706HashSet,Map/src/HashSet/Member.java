package HashSet;

public class Member {
	
	public String name;
	public int age;
	
	public Member(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return (name + age).hashCode(); 
	//	return name.hashCode() + age;   ¿Í °°À½. 
	}

	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		Member m = (Member) obj;
		
		boolean result = (this.name == m.name) && (this.age == m.age);  
		
		return result;
	}
	
	
	
}
