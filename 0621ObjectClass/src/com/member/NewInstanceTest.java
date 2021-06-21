package com.member;

public class NewInstanceTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			Class clazz = Class.forName("com.member.SendAction");
			SendAction action = (SendAction) clazz.newInstance();
			action.execute();
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (InstantiationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
			
		try {
			
			Class clazz2 = Class.forName("com.member.ReceiveAction");
			ReceiveAction actionR = (ReceiveAction) clazz2.newInstance();
			actionR.execute();
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (InstantiationException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		}
			
		
		
		
	}

}
