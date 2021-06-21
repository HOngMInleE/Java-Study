package com.member;

import java.util.Objects;

public class Member {

	public String id;

	
	public Member(String id) {
		this.id = id;
	}


	@Override
	public boolean equals(Object obj) {

		if(obj instanceof Member) { // object는 모든 클래스의 부모이기 때문에.
			
			Member other = (Member) obj;
			
			return this.id.equals(other.id); // 매개변수로 넘어온 obj의 id와 비교.
		}	
			return false; // else 생략. else 에도 return 을 써야함.
	}


	@Override
	public int hashCode() {
		
		return Objects.hash(id);  // id.hashCode();
	}
	
	
	
	
	
	
	
}
