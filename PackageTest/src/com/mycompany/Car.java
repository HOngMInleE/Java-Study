package com.mycompany;

//import com.hankook.SnowTire;
//
////import com.hankook.Tire; // Class의 위치를 참조 해야함.
//
//import com.hankook.Tire; // 오류에서 찾아서 바로 입력가능
//
////import com.kumho.Tire; // 오류 / 직접 클래스에 넣어 생성가능

//import com.hankook.SnowTire; // ctrl + shift + o / 단축키
//import com.hankook.Tire;

import com.hankook.*; // package 내에 모든 class 연결(import)

public class Car {

	Tire t = new Tire();
	
	com.kumho.Tire t2 = new com.kumho.Tire(); 
	
	SnowTire st = new SnowTire();
	
}
