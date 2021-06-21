package com.member;

import java.util.Objects;

public class Member {

	public String id;

	
	public Member(String id) {
		this.id = id;
	}


	@Override
	public boolean equals(Object obj) {

		if(obj instanceof Member) { // object�� ��� Ŭ������ �θ��̱� ������.
			
			Member other = (Member) obj;
			
			return this.id.equals(other.id); // �Ű������� �Ѿ�� obj�� id�� ��.
		}	
			return false; // else ����. else ���� return �� �����.
	}


	@Override
	public int hashCode() {
		
		return Objects.hash(id);  // id.hashCode();
	}
	
	
	
	
	
	
	
}
