package com.biz.myclass;

public class Myclass_03 {
	//static으로 선언된 nethod는
	//프로젝트가 시잔됨과 동시에 생성되어
	//메모리에 남아있다.
	//너무많은 static메서드들을 선언하면
	// 메모리 낭비가 심해진다
	public static int add(int num1 ,int num2) {
		return num1 +num2;
	}
}
